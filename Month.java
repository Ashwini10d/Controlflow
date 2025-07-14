import java.util.Scanner;
class Month{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number:");

		int num=sc.nextInt();
		if(num<1||num>12){
			System.out.println("Invalid INPUT");
			return;
		}

		String Month=switch(num){
			case 1->"JAN";
			case 2->"FEB";
			case 3->"MAR";
			case 4->"APR";
			case 5->"MAY";
			case 6->"JUN";
			case 7->"JUL";
			case 8->"AUG";
			case 9->"SEP";
			case 10->"OCT";
			case 11->"NOV";
			case 12->"DEC";
			default->"Invalid";

		};
		System.out.println(num+":"+Month);
	}
}