
import java.util.Scanner;

public class Month {

    public static void main(String args[]) {
        // int age = 2;
        // String result = age >= 18 ? "Adult" : "Minor";
        // System.out.println(result);



        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", "Sam"};

        if ((n > 0) && (n <= arr.length)) {
            System.out.println(arr[n - 1]);
        } else {
            System.err.println("Invalid input");
        }

    }

}
