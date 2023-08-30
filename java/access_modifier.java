import folderpackage.A;

/**
protected --> can be used in th outside of class
but it should in the subclass of that parent class.
it is also works in the same package. 

public --> can be used in the anywhere .

private --> can be used in within the class file.

default --> can be used within package. 
but without mentioning a default keyword. 
 * */ 
class c extends A{    
    public void show(){
        System.out.println(marks);
    }
}

public class access_modifier {
    public static void main(String s[]){
        A a = new A();
        System.out.println("from A class file "+a.marks);
        demo2 d = new demo2();
        System.out.println("Hello , I'M from deom2 file "+d.marks);
    }
    


       

}
