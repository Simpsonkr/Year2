import java.util.*;
public class Exam1 {
	
	public static void main(String[] args) {
		boolean loop=true;
		int x=0;
		Scanner keyboard = new Scanner(System.in);
		while(true) {
			loop=true;
		while(loop) {
		System.out.println("Type 1 through 4 for specific pattern to solve, or type 5 for a random pattern.");
		x=keyboard.nextInt();
		if(x>0&&x<6) {
			loop=false;
		}
		
	}
		if(x==5) {
			x=(int) (Math.random()*4)+1;
	    }
		if(x==1) {
			alg1((int) (Math.random()*10)+1, keyboard);
		}
		if(x==2) {
			alg2((int) (Math.random()*10)+1, keyboard);
		}
		if(x==3) {
			alg3((int) (Math.random()*10)+1, keyboard);
		}
		if(x==4) {
			alg4((int) (Math.random()*10)+1, keyboard);
		}
		
	}
		
		
}

	private static void alg4(int x, Scanner input) {
		for(int y=0; y<4; y++) {
			System.out.print(x+" ");
			x+=3;
		}
		int last=x;
		System.out.println("\nWhat is the next value?");
		if(last==input.nextInt()) {
			System.out.println("That's right");
		}else {
			System.out.println("That's incorrect, it should have been "+last);
		}
	}

	private static void alg3(int x, Scanner input) {
		for(int y=0; y<4; y++) {
			System.out.print(x+" ");
			x=(x*2)-3;
		}
		int last=x;
		System.out.println("\nWhat is the next value?");
		if(last==input.nextInt()) {
			System.out.println("That's right");
		}else {
			System.out.println("That's incorrect, it should have been "+last);
		}
	}

	private static void alg2(int x, Scanner input) {
		for(int y=0; y<4; y++) {
			System.out.print(x+" ");
			x*=4;
		}
		int last=x;
		System.out.println("\nWhat is the next value?");
		if(last==input.nextInt()) {
			System.out.println("That's right");
		}else {
			System.out.println("That's incorrect, it should have been "+last);
		}
	}

	public static void alg1(int x, Scanner input) {
		for(int y=0; y<4; y++) {
			System.out.print(x+" ");
			x*=x;
		}
		int last=x;
		System.out.println("\nWhat is the next value?");
		if(last==input.nextInt()) {
			System.out.println("That's right");
		}else {
			System.out.println("That's incorrect, it should have been "+last);
		}
	}
	
	
	
	
}
