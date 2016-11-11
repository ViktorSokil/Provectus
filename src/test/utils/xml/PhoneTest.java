package utils.xml;


import com.websystique.springmvc.utils.xml.Phone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneTest {

    private Phone phone;

    @Before
    public void setUp(){
        String value = "Test";
        phone = new Phone();
        phone.setValue(value);
    }

    @Test
    public void getterAndsetterTest(){
        assertEquals("Test", phone.getValue());
    }
}
