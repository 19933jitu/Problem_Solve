import java.util.Scanner;
class Range{	
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your Ammount = ");		
		double ammount = input.nextDouble();

	if(ammount>=100 && ammount <=300){
		
		double diccount =(ammount*.10);
		double paidAmmount=(ammount-diccount);		
		System.out.println("Discount = "+diccount+" PaidAmmount = "+paidAmmount);		
		
	}else if(ammount>=300 && ammount <=700){
		
		double diccount =(ammount*.15);
		double paidAmmount=(ammount-diccount);		
		System.out.println("Discount = "+diccount+" PaidAmmount = "+paidAmmount);		
		
	}else if(ammount>=700 && ammount <=1000){
		
		double diccount =(ammount*.20);
		double paidAmmount=(ammount-diccount);		
		System.out.println("Discount = "+diccount+" PaidAmmount = "+paidAmmount);		
		
	}else{
		
		double diccount =(ammount*.25);
		double paidAmmount=(ammount-diccount);		
		System.out.println("Discount = "+diccount+" PaidAmmount = "+paidAmmount);		
		
	}
		
		
	}
	
}