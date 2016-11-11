package utils.xml;


import com.websystique.springmvc.utils.xml.Title;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TitleTest {

    private Title title;

    @Before
    public void setUp(){
        String value = "Test";
        title = new Title();
        title.setValue(value);
    }

    @Test
    public void getterAndsetterTest(){
        assertEquals("Test", title.getValue());
    }
}
