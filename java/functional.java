@FunctionalInterface
interface A{
    void show(int a);
}
public class functional{
    public static void main(String s[]){
        A obj = (a)->System.out.println("in show " +a);s
        obj.show(10);
    }
}