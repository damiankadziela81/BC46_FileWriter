package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        try (FileWriter writer = new FileWriter("peom.txt")){
            writer.write("Roses are red \nViolets are blue \n");
            writer.append("\nA poem by ...");
            writer.close();
        }
    }
}