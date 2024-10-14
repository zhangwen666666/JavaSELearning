package com.zw;

import java.io.FileWriter;
import java.io.IOException;

public class XMLTest {
    /*
        <?xml version="1.0" encoding="UTF-8" ?>
        <book>
            <name>从入门到跑路</name>
            <author>zw</author>
            <price>999.9</price>
        </book>
     */
    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();
        builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n");
        builder.append("<book>\r\n");
        builder.append("<name>从入门到跑路</name>\r\n");
        builder.append("<author>zw</author>\r\n");
        builder.append("<price>999.9</price>\r\n");
        builder.append("</book>");
        FileWriter fw = new FileWriter("1.xml");
        fw.write(builder.toString());
        fw.flush();
        fw.close();
    }
}
