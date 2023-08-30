

class A{
    public void show(){
        System.out.println("hello from A class");
    }
}
class B extends A{
    // public void show(){
    //     //System.out.println("Hello from B class");
    // }
}

public class overriding {
    public static void main(String s[]){
        B obj = new B();
        obj.show();
    }
    
}
