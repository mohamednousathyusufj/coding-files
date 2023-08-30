class car{
    private int price;
    private String name;

    public car (int price , String name)
    {
        this.price = price;
        this.name  = name;
    }

    public car (){
        System.out.println("oops we can't find anything pass the parameter .");
    }

    public void show (){
        System.out.println("car name : "+ this.name);
        System.out.println("car price : "+this.price);
    }
}
public class statics_var {
    public static void main(String s[]){
        car o = new car(1500000,"mg car");
        //car o1 =new car();
        o.show();
        
        
    }
}
