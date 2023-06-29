package com.paytrue.commons.transform;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.util.Objects;

public class RawTextProcessor {

    public String process(String input, String action) {

        if (action == "HTML4")
            return org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(input);
        else
            return org.apache.commons.lang3.StringEscapeUtils.unescapeXml(input);
    }
}