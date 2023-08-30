 import java.util.Scanner;
 class calculator1 {
    public int add (int n1 ,int n2){
        return n1 + n2;
        
    }

}

public class calculator{
    public static void main(String s[]){
        System.out.print("Enter a two number : ");
        Scanner n = new Scanner(System.in);
        int num1 = n.nextInt();
        int num2 = n.nextInt();

        calculator1 cal= new calculator1();
        int result = cal.add(num1,num2);
        System.out.println(result);
        
    }
}

