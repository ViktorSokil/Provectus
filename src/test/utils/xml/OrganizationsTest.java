package utils.xml;


import com.websystique.springmvc.utils.xml.OrganizationXmlElement;
import com.websystique.springmvc.utils.xml.Organizations;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OrganizationsTest {

    private Organizations organizations;
    List<OrganizationXmlElement> list;

    @Before
    public void setUp(){
        organizations = new Organizations();
        list=new ArrayList<OrganizationXmlElement>();
        OrganizationXmlElement organizationXmlElement;
        organizationXmlElement = new OrganizationXmlElement();

        list.add(organizationXmlElement);
        organizations.setOrganizations(list);

    }

    @Test
    public void getterAndsetterTest() {
        assertEquals(list,organizations.getOrganizations());
    }
}
