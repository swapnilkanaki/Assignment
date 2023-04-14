package comPack.assingPack;
import java.util.*;
public class Leapyear {
    public static void main(String[] args) {
        int year;
        System.out.print("Enter an year = ");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        if(year%4==0)
        {
        System.out.println("leap year");
        }
        else
        {
        System.out.println("not leap year");
        }
        
    }
}
