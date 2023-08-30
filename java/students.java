import java.util.Scanner;

class student{
 int rollno;
 String name;
 int marks; 
}

public class students{
    public static void main(String s[]){
        student o = new student();
        // System.out.print("Enter a element : ");
        // Scanner d = new Scanner(System.in);
        // int n = d.nextInt();
        // for(int i=0; i<n;i++){
        o.rollno = 1011;
        o.name = "Yusuf";
        o.marks = 100;
        
        student o1 = new student();
        o1.rollno = 1012;
        o1.name = "Yusu";
        o1.marks = 98;

        student o2 = new student();
        o2.rollno = 1013;
        o2.name = "Yus";
        o2.marks = 99;

        student stud[] = new student[3];
        
        stud[0] = o;
        stud[1] = o1;
        stud[2] = o2;
       //System.out.println(o);
        for(int i =0; i<stud.length;i++){
            System.out.println(stud[i].rollno +"->"+stud[i].name+":"+stud[i].marks);
        }
        
        
        
    }
}
