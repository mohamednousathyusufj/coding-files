class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}

public class dynamic_dispatch {
    public static void main(String s[]){
        A obj = new A(); //reference of super class and object of sub class
        obj.show();        // this thing is possibile only by inheritance.

        obj = new B();
        obj.show();
    }
}
