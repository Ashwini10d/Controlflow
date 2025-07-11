import java.util.Scanner;
class Marks1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Marks of The subject:");
        float s1=sc.nextFloat();
        System.out.println("Enter The Marks of The subject:");
        float s2=sc.nextFloat();
	System.out.println("Enter The Marks of The subject:");
        float s3=sc.nextFloat();
	System.out.println("Enter The Marks of The subject:");
        float s4=sc.nextFloat();
	System.out.println("Enter The Marks of The subject:");
        float s5=sc.nextFloat();
	System.out.println("Enter The Marks of The subject:");
        float s6=sc.nextFloat();

	

	float total;
	total=s1+s2+s3+s4+s5+s6;

	float pcnt;
	 pcnt=total/6;

	if(pcnt>=90 && pcnt<=100){
		System.out.println("Grade:OutStanding.");
	}
	else if(pcnt>=75 && pcnt<=90){
		System.out.println("Grade:First Class with Distinction.");

	}
	else if(pcnt>=60 && pcnt<=75){
		System.out.println("Grade:First Class");
	}
	else if(pcnt>=50 && pcnt<=60){
		System.out.println("Grade:Second Class");
	}
	else if(pcnt>=36 && pcnt<=50){
		System.out.println("Grade:Pass");
	}
	else if(pcnt>=35 && pcnt<=0){
		System.out.println("Grade:FAIL");
	}
        

        
        
        

    }
}