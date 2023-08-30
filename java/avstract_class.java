 /*
  -Abstract methods Should have abstract class.
  -you can not create a object of Abstract class.
  - Not abstract class should not have abstract methods.but it can contains normal method as well.
  - you can create an object with concrete class.
  */
 
 abstract class car{
    public abstract void drive();
    public void music(){
        System.out.println("and play the music");
    }
}
class tata extends car{
    public void drive(){
        System.out.println("you can drive now");
    }
}



public class avstract_class {
    public static void main(String s[]){
        car obj = new tata();
        obj.drive();
        obj.music();
    }
}
