import java.util.Scanner;
class Discount{
    public static void main(String[]args){
        System.out.ptintln("Shoping start.");
        System.out.println("Enter your bill amount:");
        double billamount=new Scanner(System.in).nextDouble();
        double disc=15;
        if(billamount>=5000){
            System.out.println("you got "+disc+"%Discount");
            billamount=(billamount/100)*disc;
            
        }

        System.out.println("Total Bill:"+billamount+"rs");
        System.out.println("Shopping ends");
    }
}