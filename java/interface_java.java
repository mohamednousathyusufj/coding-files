interface computer{
    void code();
   
}

class desktop implements computer{
    public void code(){
        System.out.println("code,compile,run : faster");
    }
}

class laptop implements computer{
    public void code(){
        System.out.println("code,compile,run");
    }
}

class developer{
    public void code(computer lap){
        lap.code();
    }
}


public class interface_java {
    public static void main(String s[]){
        computer lap = new laptop();
        computer desk = new desktop();
        developer yusuf = new developer();
        yusuf.code(desk);
    }
}
