import java.util.Scanner;
public class Admission{

    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       
       System.out.println("enter the physics marks");
       float physics = sc.nextFloat();
       System.out.println("enter the chemistry marks");
       float chemistry = sc.nextFloat();
       System.out.println("enter the biology marks");
       float biology = sc.nextFloat();
       float result = (physics + chemistry + biology)/3;
       if (result>=60)
          {
            System.out.println("congratulation !! you are eligible to take admission in Sgvu, jaipur");
          }
       else
         {
           System.out.println("sorry !! you are not eligible to take admission in Sgvu jaipur");
         }
         }
         }
//hello
