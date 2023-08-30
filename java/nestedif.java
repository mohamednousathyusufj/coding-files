import java.util.Scanner;

public class nestedif {
    public static void main(String s[]){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the marital stauts M/U ");
        char marital = n.next().charAt(0);
        
        if (marital == 'u' || marital == 'U'){
            System.out.println("Enter a gender either male(m) or female(f) ? ");
            char gender = n.next().charAt(0);
            System.out.println("Enter a years : ");
            int years = n.nextInt();
            if((gender == 'm' || gender =='M') && years >=30){
                System.out.println("Insurance will be provided for male. ");
            }else if((gender == 'f' || gender == 'F') && years >=26){
                System.out.println("Insurance will be provided for female. ");
            }else{
                System.out.println("you are not eligible for insurance. ");
  
            }

        }else if(marital == 'm' || marital == 'M'){
            System.out.println("Insurance will be provided for married person. ");
        }else {
            System.out.println("Invalid input. please try again! ");  
        }
    }
}
