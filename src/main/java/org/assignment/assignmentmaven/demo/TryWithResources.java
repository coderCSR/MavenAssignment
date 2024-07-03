package org.assignment.assignmentmaven.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class TryWithResources {
    public static void main(String[] args) {
        String filePath = Paths.get("src", "main", "resources", "test.txt").toString();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
