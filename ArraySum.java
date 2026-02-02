import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static void main(String args[]) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = sc.nextInt();
        // System.out.println(length);

        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter number" + (i+1) + ":");
            int a = sc.nextInt();
            arr[i] = a;
            sum += a;
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Sum" + sum);

        sc.close();
    }

}

//test
