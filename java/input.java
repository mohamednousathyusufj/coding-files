import java.util.Scanner;

public class input {
    public static void main(String s[]){
        Scanner name =new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a,b,c;
        a = name.nextInt();
        b = name.nextInt();
        c = (a*a) + (b*b) + (2*a*b);
        System.out.println(c);
    }
    
}
