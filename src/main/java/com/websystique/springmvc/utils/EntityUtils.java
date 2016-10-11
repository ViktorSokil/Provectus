package com.websystique.springmvc.utils;


import com.websystique.springmvc.persistence.entities.*;
import com.websystique.springmvc.utils.xml.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class EntityUtils {

    private static final String USD="USD";
    private static final String EUR="EUR";
    private static final String RUB="RUB";

    private static final Logger logger = LoggerFactory.getLogger(EntityUtils.class);

    private EntityUtils(){}

    public static City createAndReturnCityEntity(CityXmlElement cityElement) {
        City entity=new City();
        entity.setCityId(cityElement.getId());
        entity.setCityName(cityElement.getTitle());
        return entity;
    }

    public static Region createAndReturnRegionEntity(RegionXmlElement regionXmlElement) {
        Region entity = new Region();
        entity.setRegionId(regionXmlElement.getId());
        entity.setRegionName(regionXmlElement.getTitle());
        return entity;
    }

    public static Currency createAndReturnCurrencyEntity(CurrencyXmlElement currencyElement) {
        Currency entity = new Currency();
        entity.setId(currencyElement.getId());
        entity.setTitle(currencyElement.getTitle());
        return entity;
    }

    public static OrgType createAndReturnOrgTypeEntity(OrgTypeXmlElement orgTypeElement) {
        OrgType entity = new OrgType();
        entity.setId(orgTypeElement.getId());
        entity.setTitle(orgTypeElement.getTitle());
        return entity;
    }

    public static Organization createAndReturnOrganizationEntity(OrganizationXmlElement organizationElement) {
        Organization entity = new Organization();
        entity.setOrganizationId(organizationElement.getId());
        entity.setTitle(organizationElement.getTitle().getValue());
        entity.setOldOrgId(organizationElement.getOldId());
        entity.setBranch(organizationElement.getBranch().getValue());
        entity.setAddress(organizationElement.getAddress().getValue());
        entity.setCity(createAndReturnCityEntity(organizationElement.getCity()));
        entity.setRegion(createAndReturnRegionEntity(organizationElement.getRegion()));
        entity.setLink(organizationElement.getLink().getHref());
        entity.setLinkType(organizationElement.getLink().getType());
        entity.setOrgType(organizationElement.getOrgTypeId());
        entity.setPhone(organizationElement.getPhone().getValue());
        allocateCurrencyAndSetToEntity(entity, organizationElement);
        return entity;
    }

    private static void allocateCurrencyAndSetToEntity(Organization entity, OrganizationXmlElement organizationElement) {
        List<CurrencyXmlElement> currencyElements= organizationElement.getCurrencies().getCurrencies();
        for(CurrencyXmlElement currencyElement: currencyElements){
            switch (currencyElement.getId()){
                case USD: entity.setCurrency1(createAndReturnCurrencyEntity(currencyElement));
                          entity.setCurrency1br(currencyElement.getBuyRate());
                          entity.setCurrency1ar(currencyElement.getAskRate());
                          break;
                case EUR: entity.setCurrency2(createAndReturnCurrencyEntity(currencyElement));
                          entity.setCurrency2br(currencyElement.getBuyRate());
                          entity.setCurrency2ar(currencyElement.getAskRate());
                          break;
                case RUB: entity.setCurrency3(createAndReturnCurrencyEntity(currencyElement));
                          entity.setCurrency3br(currencyElement.getBuyRate());
                          entity.setCurrency3ar(currencyElement.getAskRate());
                          break;
                default:  logger.warn("Pay attention due to not standard currency!!!. It didn't add to db.");
            }
        }
    }
}
