package Polymorphism.Overriding;
import java.util.Scanner;

class Cat{
    public void animals(){
        System.out.println("I am a cat");
    }
}

class Dog{
    public void animals(){
        System.out.println("I am a dog");
    }   
}

public class Animal {
     public static void main(String args[]){
        Cat c = new Cat();

        Dog d = new Dog();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter animal name:");
        String n = sc.nextLine();
        // int len = n.length();
        // for (int i = 0; i < len; i++){
        //     if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z'){
        //         n = n.substring(0, i) + (char)(n.charAt(i) + 32) + n.substring(i + 1);
        //     }
        // }

        String name = n.toLowerCase();

        if (name.equals("cat")){
            c.animals();
        }
        else if (name.equals("dog")){
            d.animals();
        }
        else{
            System.out.println("Invalid animal name");
        }
    }
}