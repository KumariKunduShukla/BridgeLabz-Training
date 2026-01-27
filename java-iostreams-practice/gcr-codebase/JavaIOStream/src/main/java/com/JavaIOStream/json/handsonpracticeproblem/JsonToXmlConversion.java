package com.JavaIOStream.json.handsonpracticeproblem;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonToXmlConversion {

    public static void main(String[] args) {

        try {
            // JSON input
            String json = """
                    {
                      "name": "AvikaShukla",
                      "email": "avika@gmail.com",
                      "age": 22,
                      "skills": ["Java", "Selenium", "Spring"]
                    }
                    """;

            // ObjectMapper for JSON
            ObjectMapper jsonMapper = new ObjectMapper();

            // Parse JSON into JsonNode
            JsonNode jsonNode = jsonMapper.readTree(json);

            // XmlMapper for XML
            XmlMapper xmlMapper = new XmlMapper();

            // Convert JSON to XML
            String xml = xmlMapper.writerWithDefaultPrettyPrinter()
                                  .writeValueAsString(jsonNode);

            // Print XML
            System.out.println("Converted XML:");
            System.out.println(xml);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
