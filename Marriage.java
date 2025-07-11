import java.util.Scanner;

import javax.print.DocFlavor.STRING;
class Marriage{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The age:");
        int age=sc.nextInt();
        System.out.println("Enter Income:");
        double property=sc.nextDouble();
        System.out.println("Enter The Surname:");
        String surname=sc.next();

        if(age>21){
            if(property>10000000){
                if(surname.equals("AMBANI")){
                }
            }

            System.out.println("The Boy is eligible");
        }
        else{
            System.out.println("The boy is not eligible");
        }

    }
}