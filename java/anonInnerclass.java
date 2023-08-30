class A{
    public void show(){
        System.out.println("in show of A");
    }
}

public class anonInnerclass{
    public static void main(String s[])
    {
        A obj = new A(){
            public void show(){
            System.out.println("in show of B");
            }
        };
        obj.show();
    }
}