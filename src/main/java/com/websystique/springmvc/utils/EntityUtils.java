package com.websystique.springmvc.utils;


import com.websystique.springmvc.persistence.entities.*;
import com.websystique.springmvc.utils.xml.*;

public class EntityUtils {

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
        return entity;
    }

    public static ActualCurrencyRate createAndReturnActualCurrencyRateEntity(CurrencyXmlElement currencyXmlElement, Organization organization) {
        Currency currency = createAndReturnCurrencyEntity(currencyXmlElement);
        ActualCurrencyRate entity = new ActualCurrencyRate();
        entity.setIdFromOrg(organization);
        entity.setCurrencyId(currency);
        entity.setAscRate(currencyXmlElement.getAskRate());
        entity.setBuyRate(currencyXmlElement.getBuyRate());
        return entity;
    }
}
