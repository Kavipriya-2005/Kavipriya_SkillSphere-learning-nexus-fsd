class Employee{
    void work(){
        System.out.println("Employee Working");

    }
}
class Developer extends Employee{
    @Override
    void work(){
        System.out.println("Developer Writing Code");
    }
}
public class AnnotationDemo{
    public static void main(String args[]){
        Employee e = new Developer();
        e.work();

    }

}