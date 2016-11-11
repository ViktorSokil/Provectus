package utils.xml;


import com.websystique.springmvc.utils.xml.Branch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BranchTest {
    private Branch branch;

    @Before
    public void setUp(){
        branch = new Branch();
        boolean value = true;
        branch.setValue(value);

    }

    @Test
    public void getterAndsetterTest() {
        assertEquals(true,branch.getValue());
    }
}
