import java.util.Scanner;

public class Hcf {
    public static void main(String[] args){

        // int n1 = 36;
        // int n2 = 24;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int a = Math.max(n1, n2);
        int b = Math.min(n1, n2);

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }
}


// test-vaishu
// test-vaishu2
