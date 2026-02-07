import java.util.Scanner;

public class GetInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter an integer: ");

            try {
                n = sc.nextInt();   // tries to read integer
                valid = true;      // success → exit loop
            } catch (Exception e) {
                System.out.println("Please type an integer only.");
                sc.next(); // clear wrong input
            }
        }

        System.out.println("✅ You entered: " + n);
        sc.close();
    }
}
