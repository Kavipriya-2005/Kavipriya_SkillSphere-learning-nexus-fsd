class Employee {
    void work() {
        System.out.println("Employee is working.");
    }
}
class Manager extends Employee {
    void manageTeam() {
        System.out.println("Manager manages the team.");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.work();
        m.manageTeam();
    }
}