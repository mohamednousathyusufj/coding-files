
import java.util.Scanner;

public class array {
    public static void main (String s[]){
    System.out.print("Enter the total no of elements :");    
    Scanner n = new Scanner(System.in);
    int r = n.nextInt();  
    int a[] = new int[r];
    
    for (int i=0; i<a.length; i++)
    {
        System.out.print("Enter the value of a["+i+"] :");
        a[i] = n.nextInt();
    }
    for(int element :a) 
    {
        System.out.println(element);
    }
}
    
}
