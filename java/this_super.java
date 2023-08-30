
class A{
public A(){
    System.out.println("I'm from A.");
}
}
class B extends A{
 public B(){
    System.out.println("I'm from B.");
 }
 public B(int a){
    this();
    System.out.println("I'm from int B");
 }
}
public class this_super {
    public static void main(String s[]){
        B obj = new B(6);


    }
}
