import java.io.*;
import java.util.Scanner;

public class FileExample {

    public static void main(String[] args) {

        try {

            FileWriter fw = new FileWriter("student.txt");

            fw.write("Name : Kavi\n");
            fw.write("Department : CSE\n");
            fw.write("CGPA : 9.2");

            fw.close();

            System.out.println("Data Written Successfully\n");

            File file = new File("student.txt");

            Scanner sc = new Scanner(file);

            System.out.println("Reading File");

            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }

            sc.close();

        }

        catch(Exception e){

            System.out.println(e);

        }

    }

}