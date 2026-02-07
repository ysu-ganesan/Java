package Polymorphism.Overloading;

public  class Student {

     public void add(int a, int b){
        System.out.println(a+b);
     }

     public int add(int a, int b, int c){
        return a+b+c;
     }
    public static void main(String args[]){
        Student s = new Student();
        s.add(10, 20);
        
        
        System.out.println(s.add(20, 10, 20));
    }

}
