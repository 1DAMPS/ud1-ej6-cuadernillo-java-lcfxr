import java.util.Scanner;
public class Ej03{
    public static void main (String[]args){
        System.out.println ("Dime tu edad");
        Scanner sc = new Scanner (System.in);
        int edad = sc.nextInt();
        System.out.print ("Tienes " +edad+ " años.");
        sc.close();
    }
}