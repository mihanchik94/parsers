package task_2;

import task_1.Employee;
import task_1.ListToJsonConverter;
import task_1.StringWriter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListToJsonConverter converter = new ListToJsonConverter();
        XMLParser parser = new XMLParser();
        StringWriter writer = new StringWriter();

        List<Employee> list = parser.parseXML("data.xml");
        String json = converter.listToJson(list);
        writer.writeString("./data_from_xml.json", json);
    }
}