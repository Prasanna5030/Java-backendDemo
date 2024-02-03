package com.filehandling;

import java.io.*;


public class FilesDemo {
    public static void main(String[] args) {
        // File path
        String filePath = "C:\\Users\\HP\\Java Backend\\src\\Notes.txt";

        // Writing data to the file
        writeToFile(filePath);

        // Reading and printing each line from the file
        readAndPrintFile(filePath);
    }

    // Method to write data to the file
    private static void writeToFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Writing data to the file
            writer.write("Line 1: Hello, this is the first line.");
            writer.newLine();
            writer.write("Line 2: This is the second line.");
            writer.newLine();
            writer.write("Line 3: Writing data to a file in Java.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read and print each line from the file
    private static void readAndPrintFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Reading and printing each line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


