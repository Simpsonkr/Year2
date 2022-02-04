import java.util.*;
public class Exam2 {

	public static void main(String[] args) {
		double amountOwed=0;
		double amountPaid=0;
		double change=0;
		
		amountOwed=generateAmount(amountOwed);
		System.out.println("Amount owed is $"+amountOwed);
		amountPaid=generateAmount(amountOwed);
		System.out.println("Amount paid is $"+amountPaid);//Main Method
		change=amountPaid-amountOwed;
		change=Math.round(change*100.0)/100.0;
		System.out.println("Change is $"+change+"\n");
		findExactChange(change);
	}

	private static double generateAmount(double amountOwed) {//Generates amount paid and amount owed, will keep
		double generatedAmnt=-1;							//running until amount paid>amount owed
			while(generatedAmnt<amountOwed) {
			generatedAmnt=(Math.random()*101);
			generatedAmnt=Math.round(generatedAmnt*100.0)/100.0;
				if(generatedAmnt>100) {
				generatedAmnt=100;
			}
		}
		return generatedAmnt;
	}
	
	private static double findExactChange(double change) {//finds change values
		System.out.println("Twenties "+(int)change/20);
		change=change%20;
		System.out.println("Fives "+(int)change/5);
		change=change%5;
		System.out.println("Ones "+(int)change/1);
		change=change-((int)change/1);
		change=Math.round(change*100.0)/100.0;
		change=change*100;
		System.out.println("Quarters "+(int)change/25);
		change=change%25;
		System.out.println("Dimes "+(int)change/10);
		change=change%10;
		System.out.println("Nickels "+(int)change/5);
		change=change%5;
		System.out.println("Pennies "+(int)change/1);
		
		return 0;
	}

}
