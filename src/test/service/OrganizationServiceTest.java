package service;


import com.websystique.springmvc.dao.IOrganizationDao;
import com.websystique.springmvc.persistence.entities.Organization;
import com.websystique.springmvc.service.IActualCurrencyRateService;
import com.websystique.springmvc.service.IOrganizationService;
import com.websystique.springmvc.service.impl.OrganizationServiceImpl;
import com.websystique.springmvc.utils.xml.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;

public class OrganizationServiceTest {

    @Mock
    private IOrganizationDao organizationDao;

    @Mock
    private IActualCurrencyRateService actualCurrencyRateService;

    @InjectMocks
    private IOrganizationService organizationService = new OrganizationServiceImpl();

    private Source source;
    private Currencies currencies;
    private Organizations organizations;
    private Title title;
    private Branch branch;
    private Address address;
    private CityXmlElement city;
    private RegionXmlElement region;
    private Link link;
    private Phone phone;



    private List<OrganizationXmlElement> organizationXmlElements;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        CurrencyXmlElement currencyXmlElement = new CurrencyXmlElement();
        List<CurrencyXmlElement> list = new ArrayList<>();
        list.add(currencyXmlElement);
        currencies = new Currencies();
        currencies.setCurrencies(list);


        organizations = new Organizations();
        title  = new Title();
        branch = new Branch();
        address =new Address();
        city = new CityXmlElement();
        region = new RegionXmlElement();
        link = new Link();
        phone = new Phone();

        organizationXmlElements = new ArrayList<>();

        OrganizationXmlElement organizationXmlElement = new OrganizationXmlElement();
        organizationXmlElement.setCurrencies(currencies);
        organizationXmlElement.setTitle(title);
        organizationXmlElement.setOldId(1);
        organizationXmlElement.setBranch(branch);
        organizationXmlElement.setAddress(address);
        organizationXmlElement.setCity(city);
        organizationXmlElement.setRegion(region);
        organizationXmlElement.setLink(link);
        organizationXmlElement.setPhone(phone);

        organizationXmlElements.add(organizationXmlElement);
        organizations.setOrganizations(organizationXmlElements);


        source =new Source();
        source.setOrganizations(organizations);
    }

    @Test
    public void saveOrganizationTest() {
        organizationService.saveOrganization(source);
        verify(organizationDao).saveOrganization((Organization)any());
        verify(actualCurrencyRateService).saveActualCurrencyRate((Organization)any(), (OrganizationXmlElement)any());
    }

    @Test
    public void getOrganizationByIdTest(){
        String id = "1";
        organizationDao.getOrganizationById(id);
        verify(organizationDao).getOrganizationById(id);
    }

    @Test
    public void findAllTest(){
        organizationDao.findAll();
        verify(organizationDao).findAll();
    }
}
