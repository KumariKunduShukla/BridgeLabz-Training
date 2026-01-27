package com.JavaIOStream.csvhandling;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class CsvToJson {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Kundu\\Desktop\\Java programming workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStream\\src\\main\\java\\com\\JavaIOStream\\csvhandling\\student.csv"));
        JSONArray jsonArray = new JSONArray();

        String header = br.readLine(); // skip header
        String line;

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            JSONObject obj = new JSONObject();
            obj.put("id", Integer.parseInt(data[0]));
            obj.put("name", data[1]);
            obj.put("age", Integer.parseInt(data[2]));
            obj.put("marks", Integer.parseInt(data[3]));

            jsonArray.put(obj);
        }
        br.close();

        FileWriter writer = new FileWriter("C:\\Users\\Kundu\\Desktop\\Java programming workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStream\\src\\main\\java\\com\\JavaIOStream\\csvhandling\\student.json");
        writer.write(jsonArray.toString(2)); // pretty print
        writer.close();

        System.out.println("CSV converted to JSON successfully");
    }
}