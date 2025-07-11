import java.util.Scanner;

class Curr{
    public static void main(String[]args){
        Scanner sc =new Scanner (System.in);
        for(;;){
            System.out.println("");
            System.out.println("Welcome");
            System.out.println("");
            System.out.println("List of Currency");
            System.out.println("1.USD");
            System.out.println("2.EUR");
            System.out.println("3.ADA");
            System.out.println("4.AED");
            System.out.println("5.AFN");
            System.out.println("6.ALL");
            System.out.println("7.AMD");
            System.out.println("For EXIT ENTER 0");
            System.out.println();
            

            System.out.println("Enter Your Amount:");
            float inr =sc.nextFloat();

            System.out.println("Enter The currency Code:");
            String code=sc.next().toUpperCase();
            boolean asump=true;

            float con=0;

            if(code.equals("USD")){
                con =inr/85.5950f;
            }
            else if(code.equals("EUR")){
                con=inr/100.427f;

            }
            else if(code.equals("ADA")){
                con =inr/56.1825f;
            }
            else if(code.equals("AED")){
                con=inr/23.3069f;

            }
            else if(code.equals("AFN")){
                con =inr/1.22573f;
            }
            else if(code.equals("ALL")){
                con=inr/1.02576f;

            }
            else if(code.equals("AMD")){
                con =inr/0.222772f;
            }
            else if(code.equals("0")){
                System.out.println();
                System.out.println("Thank you visit Again.");
                return;

            }
            else{
                System.out.println();
                System.out.println("Invalid Currency i.e:"+code);
                asump=false;
            }
            if(asump){
                System.out.println(inr+"INR:"+con+" "+code);
            }
            

            }
            
            
            
            


        }
    }
