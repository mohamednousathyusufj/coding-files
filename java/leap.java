
import java.util.Scanner;

class leap{
    public static void main(String s[]){
        int year;
        System.out.print("Enter a year : ");
        Scanner n = new Scanner(System.in);
        year = n.nextInt();
        if(year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)){
            System.out.println(year +" is a leap year.");
        }else{
            System.out.println(year +" is not a leap year.");
        }
    }
}