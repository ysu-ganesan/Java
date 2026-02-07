import java.util.Scanner;

public class hello {
    public static void main(String args[]){
        System.out.println("Hello!");
        System.out.print("World!");
        hello h = new hello();
        h.hello2();
        h.hello3();
    }

    public void hello2(){
        System.out.println("Hello2!");
    }

    public void hello3(){
        System.out.println("Hello3!");
    }

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

}


