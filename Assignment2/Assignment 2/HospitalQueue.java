import java.util.PriorityQueue;

public class HospitalQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> patients = new PriorityQueue<>();

        patients.add(5);
        patients.add(1);
        patients.add(3);
        patients.add(2);

        System.out.println("Patient Treatment Order");

        while(!patients.isEmpty()){

            System.out.println("Priority : " + patients.poll());

        }

    }

}