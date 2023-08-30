import java.util.Scanner;

public class elseif {
    public static void main(String s[]){
        float avg;
        System.out.print("Enter a avg : ");
        Scanner n = new Scanner(System.in);
        avg = n.nextFloat();
        if(avg> 90 && avg< 100){
            System.out.println(avg +" is grade A.");
        }
        else if(avg>80 && avg<89){
            System.out.println(avg +" is grade B.");
        }
            
        else if(avg>70 && avg<79){
            System.out.println(avg +" is grade C.");
        }
        else{
            System.out.println(avg +" is grade D.");
        }
            

     }
}
