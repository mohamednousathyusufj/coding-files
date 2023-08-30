class A{
    int marks ;
    public void show(){
        System.out.println("in show methods");
    }

    class B{
        public void config(){
            System.out.println("config from inner class of B");
        }
    }
}


public class innerclass {

     static public void main(String s[]){
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B();// this is an important
        obj1.config();
    }
}
/*
To create a object of inner class.first we need object(reference variable)
of outer class. (on line 20 see) you have to mention of 
the inner class where it belongs to.
 */