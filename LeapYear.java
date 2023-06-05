import java.until.Scanner;

public class HW_LeapYear_graham.hill
{
   public static void main(String[] args)
   {
     int year;
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Enter a year: ");
     year = keyboard.nextInt();
     
     boolean leapYear = (year % 4 = 0)(year % 100 = 0)(year % 400 = 0)
     System.out.println(leapYear);
   }
}
