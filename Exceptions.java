
public class Exceptions {

    public static void main(String[] args) {
        try {
            int n = 9;
            System.out.println(n / 0);
        } catch (Exception e) {
            System.out.println("Division by zero is not allowed.");
        }

        System.out.println("This line will not be executed due to the exception above.");
    }
}
