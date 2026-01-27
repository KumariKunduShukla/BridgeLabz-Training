package com.JavaIOStream.csvhandling;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

public class JsonToCsv {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Kundu\\Desktop\\Java programming workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStream\\src\\main\\java\\com\\JavaIOStream\\csvhandling\\student.json"));
        StringBuilder jsonData = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            jsonData.append(line);
        }
        br.close();

        JSONArray array = new JSONArray(jsonData.toString());
        FileWriter writer = new FileWriter("C:\\Users\\Kundu\\Desktop\\Java programming workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStream\\src\\main\\java\\com\\JavaIOStream\\csvhandling\\student.csv");

        // Header
        writer.write("ID,Name,Age,Marks\n");

        // Data
        for (int i = 0; i < array.length(); i++) {
            JSONObject obj = array.getJSONObject(i);
            writer.write(
                    obj.getInt("id") + "," +
                    obj.getString("name") + "," +
                    obj.getInt("age") + "," +
                    obj.getInt("marks") + "\n"
            );
        }

        writer.close();
        System.out.println("JSON converted to CSV successfully");
    }
}