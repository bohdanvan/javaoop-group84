package com.bvan.javaoop.lessons11_12.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class IOExample {

    public static void main(String[] args) {
        String inFileName = "files/users.txt";
        String outFileName = "files/users2.txt";

        copyText(inFileName, outFileName);
    }

    private static void copyText(String inFileName, String outFileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outFileName, true))) {

            String line = reader.readLine();
            while (line != null) {
                writer.write(line + "!");
                writer.newLine();

                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void testNamesIO(String fileName) {
        try {
            List<String> names = readNamesFromFile(fileName);
            System.out.println(names);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> readNamesFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return readAllNames(reader);
        }
    }

    private static List<String> readNamesFromFileJavaBefore7(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            return readAllNames(reader);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static List<String> readAllNames(BufferedReader reader) throws IOException {
        List<String> names = new ArrayList<>();
        String line = reader.readLine();
        while (line != null) {
            names.add(line);
            line = reader.readLine();
        }
        return names;
    }
}
