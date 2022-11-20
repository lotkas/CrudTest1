package CRUD;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static String filename = "Data.txt";

    public static void main(String[] args) {
        File();
        display();

    }

    public static void File() {
        File datainas = new File(filename);

        try {
            if (datainas.createNewFile() == true) {

                try {
                    FileWriter writer = new FileWriter(filename, true);
                    writer.append("ID" + " Name" + " Age" + " Salary");
                    writer.append("\n");
                    writer.close();
                } catch (IOException e) {
                    System.err.println(e);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void NewInfo(Scanner input) {
        System.out.println("Enter your ID");
        String id = input.next();
        System.out.println("Enter your Name");
        String Name = input.next();
        System.out.println("Enter your Age");
        String Age = input.next();
        System.out.println("Enter your Salary");
        String Salary = input.next();
        INAS person = new INAS(id, Name, Age, Salary);

        try {
            FileWriter writer = new FileWriter(filename, true);
            writer.append(person.Info());
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void display() {
        Scanner input = new Scanner(System.in);
        while (true) {
            NewInfo(input);
            break;
        }
    }
}

