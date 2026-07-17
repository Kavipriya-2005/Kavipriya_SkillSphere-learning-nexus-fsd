import java.util.ArrayList;
public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add(0,"Kavi");
        students.add("Priya");
        students.add("Ruthish");
        students.add("Anu");
        System.out.println("Student List");
        System.out.println(students);
        students.remove("Ruthish");
        System.out.println("\nAfter Removal");
        System.out.println(students);
        System.out.println("\nContains Priya? " + students.contains("Priya"));
        System.out.println("\nUsing Loop");
        students.add("Ruthish");
        for(String s : students){
            System.out.println(s);
        }
        System.out.println("\nTotal Students : " + students.size());
    }
}