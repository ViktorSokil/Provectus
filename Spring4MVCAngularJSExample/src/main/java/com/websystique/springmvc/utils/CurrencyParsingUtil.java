package com.websystique.springmvc.utils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Anna on 19.09.2016.
 */
public class CurrencyParsingUtil {
    private static final String FINANCE_UA_DATA_SOURCE_URL="http://resources.finance.ua/ua/public/currency-cash.xml";

    public static void parse() {

        Source source;
        try {
            File file=createFile(FINANCE_UA_DATA_SOURCE_URL);

            JAXBContext jaxbContext=JAXBContext.newInstance(Source.class);
            // read from file and create objects
            Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
            source =(Source)unmarshaller.unmarshal(file);
            System.out.println(source.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static File createFile(String sourceUrl) {

        URL url= null;
        try {
            url = new URL(sourceUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        URLConnection connection;
        try {
            connection = url.openConnection();
            final InputStream fis = connection.getInputStream();
            try {
                final OutputStream fos = new FileOutputStream(new File("1.xml"));
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
        return new File("1.xml");
    }

    private static void copy(InputStream fis, OutputStream fos, int length) {
        byte[] buf = new byte[length];
        while (true) {
            int len = 0;
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
