class A{
    public void show1(){
        System.out.println("in A show.");
    }
}
class B extends A{
    public B(){
        System.out.println("constructor of B ");
    }
    public void show2(){
        System.out.println("in B show.");
    }
}

public class casting {
    public static void main (String s[]){
        new B();
        new B().show2();  // Anonymous Object
        A obj = new B();
        obj.show1();
        B obj1 = (B)obj; 
        obj1.show2();
        
    }
}
