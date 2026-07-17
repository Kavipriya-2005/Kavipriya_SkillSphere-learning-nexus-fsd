public class throw1 {
    public static void main(String[] args) {
        int age = 16;

        try {
            if (age < 18) {
                throw new ArithmeticException("You are not eligible to vote.");
            }
            System.out.println("Eligible to vote.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}