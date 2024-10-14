package com.zw;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Dom4JTest1 {
    public static void main(String[] args) throws DocumentException {
        // 1. 创建一个Dom4J框架提供的解析器对象
        SAXReader saxReader = new SAXReader();

        // 2. 使用saxReader对象把需要解析的XML文件都城一个Document对象。
        String path = "properties-xml-log\\src\\helloworld.xml";
        Document document = saxReader.read(path);

        // 3. 从文档对象中解析XML文件的全部数据
        Element root = document.getRootElement();
        String rootName = root.getName();
        System.out.println(rootName); // users

        // 4.获取根元素下的全部一级子元素
        List<Element> elements = root.elements();
        for (Element element : elements) {
            System.out.println(element.getName());// user user people
        }

        // 5.得到当前元素下指定名字的子元素
        List<Element> userElements = root.elements("user");
        for (Element userElement : userElements) {
            System.out.println(userElement.getName()); // user user
        }

        // 6. 获取当前元素下的某个子元素
        Element people = root.element("people");
        System.out.println(people.elementText("name")); // 张三
        // 如果有很多子元素user,默认获取第一个
        Element user = root.element("user");
        System.out.println(user.elementText("name")); // 张无忌

        // 7. 获取元素的属性信息
        System.out.println(user.attributeValue("id")); // 1
        // 也可以先获取属性对象，在调用属性对象的getValue方法拿到属性值
        Attribute id = user.attribute("id");
        System.out.println(id.getName()); // id
        System.out.println(id.getValue()); // 1

        // 8.获取当前元素的所有属性信息
        List<Attribute> attributes = user.attributes();
        for (Attribute attribute : attributes) {
            // id=1  desc=第一个用户
            System.out.println(attribute.getName() + "=" + attribute.getValue());
        }

        // 9.获取当前元素下的子元素的文本值
        System.out.println(user.elementText("name")); // 张无忌
        System.out.println(user.elementText("sex"));    // 男
        System.out.println(user.elementText("data"));   //  3 < 2 && 5 > 4
        System.out.println(user.elementText("data1")); //  3 < 2 && 5 > 4
    }
}
