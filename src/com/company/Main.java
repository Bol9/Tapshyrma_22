package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        try(FileWriter writer = new FileWriter("Alphabet.txt")){
            char c;
            char p = 'a';
            for (c = 'A'; c <= 'Z'; ++c) {
                writer.write(c);
                if (p <= 'z') {
                    writer.write(p + "\n");
                    p++;
                }
            }
            for (c = '0'; c <= '9'; ++c) {
                writer.write(c + "\n");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(FileReader reader = new FileReader("Alphabet.txt")){
            Scanner scanner = new Scanner(reader);
            int counter=1;
            while (scanner.hasNextLine()){
                System.out.println(counter+":"+scanner.nextLine());
                counter++;
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}

