package utils.xml;


import com.websystique.springmvc.utils.xml.CurrencyParsingUtil;
import com.websystique.springmvc.utils.xml.Source;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class CurrencyParsingUtilTest {

    private static final String FINANCE_UA_DATA_SOURCE_URL="http://resources.finance.ua/ua/public/currency-cash.xml";

    @Before
    public void setUp(){
        deleteFile();
    }

    @Test
    public void createUrlTest() throws MalformedURLException {
        URL actual = CurrencyParsingUtil.createUrl(FINANCE_UA_DATA_SOURCE_URL);
        assertNotNull(actual);
    }

    @Test
    public void createUrlExceptionTest() {
        CurrencyParsingUtil.createUrl("url");
    }

    @Test
    public void createFileAndParseTest(){
        Source actual = CurrencyParsingUtil.createFileAndParse();
        assertNotNull(actual);
    }

    @Test
    public void parseTest(){
        Source actual = CurrencyParsingUtil.parse(new File("src/test/resources/1.xml"));
        assertNotNull(actual);
    }

    @Test
    public void parseExceptionTest(){
        CurrencyParsingUtil.parse(new File("src/test/resources/2.xml"));
    }

    @Test
    public void createFileTest() throws MalformedURLException{
        File actual = CurrencyParsingUtil.createFile(new URL(FINANCE_UA_DATA_SOURCE_URL));
        assertTrue(actual.exists());
    }

    @Test
    public void createFileExceptionTest() throws MalformedURLException{
        File actual = CurrencyParsingUtil.createFile(new URL("http://resources.finance.ua/ua/public/fake.xml"));
        assertFalse(actual.exists());
    }

    private void deleteFile(){
        File file=new File("1.xml");
        file.delete();
    }
}
