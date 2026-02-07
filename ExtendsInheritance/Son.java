package ExtendsInheritance;

public class Son extends Father {

    public void PocketMoney() {
        System.out.println("I get pocket money from my father");
    }

    public static void main(String args[]) {
        Son a = new Son();
        a.PocketMoney();
        a.Fatherpocketmoney();
        a.Grandfatherpocketmoney();
    }

}
