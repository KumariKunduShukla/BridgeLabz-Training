package com.JavaIOStream.json.handsonpracticeproblem;

import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONObject;

public class ReadJsonFile {
    public static void main(String[] args) throws Exception {

        String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\Kundu\\Desktop\\Java programming workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStream\\src\\main\\java\\com\\JavaIOStream\\json\\handsonpracticeproblem\\data.json"+ "")));

        JSONObject json = new JSONObject(content);

        for(String key : json.keySet()){
            System.out.println(key + " : " + json.get(key));
        }
    }
}