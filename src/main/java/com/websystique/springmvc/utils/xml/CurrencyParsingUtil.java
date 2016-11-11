package com.websystique.springmvc.utils.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class CurrencyParsingUtil {
    private static final String FINANCE_UA_DATA_SOURCE_URL="http://resources.finance.ua/ua/public/currency-cash.xml";

    public static Source createFileAndParse(){
        URL url = createUrl(FINANCE_UA_DATA_SOURCE_URL);
        File file=createFile(url);
        return parse(file);
    }

    public static URL createUrl(String sourceUrl) {
        URL url= null;
        try {
            url = new URL(sourceUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }

    public static Source parse(File file) {
        Source source=null;
        JAXBContext jaxbContext= null;
        try {
            jaxbContext = JAXBContext.newInstance(Source.class);
            // read from file and create objects
            Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
            source =(Source)unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return source;
    }

    public static File createFile(URL sourceUrl) {

        File file=new File("1.xml");

        URLConnection connection;
        try {
            connection = sourceUrl.openConnection();
            final InputStream fis = connection.getInputStream();
            try {
                final OutputStream fos = new FileOutputStream(file);
                try {
                    copy(fis, fos, connection.getContentLength());
                    fos.flush(); // Doesn't actually do anything in this specific case.
                } finally {
                    fos.close();
                }
            } finally {
                fis.close();
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
        return file;
    }

    private static void copy(InputStream fis, OutputStream fos, int length) {
        byte[] buf = new byte[length];
        while (true) {
            int len;
            try {
                len = fis.read(buf);
                if (len == -1) {
                    break;
                }
                fos.write(buf, 0, len);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
