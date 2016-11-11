package persistence.entities;


import com.websystique.springmvc.persistence.entities.Organization;
import com.websystique.springmvc.persistence.entities.Region;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RegionTest {

    private Region region;

    @Before
    public void setUp(){
        region=new Region();
        region.setRegionId("1");
        region.setRegionName("TestRegion");

        Organization organization=new Organization();
        organization.setId(10L);
        List<Organization> regionList =new ArrayList<>();
        regionList.add(organization);

        region.setRegionList(regionList);
    }

    @Test
    public void getterAndsetterTest() {
        assertEquals("1",region.getRegionId());
        assertEquals("TestRegion",region.getRegionName());
        assertEquals(new Long(10), region.getRegionList().get(0).getId());
    }
}



