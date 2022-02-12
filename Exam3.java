import java.util.*;
public class Exam3 {
	public static void main(String args[]){
		int x=1;
		while(x<2||x>100000000) {
		System.out.println("Enter the range of prime numbers you want to find");
		System.out.println("Please be more than 1 and no greater than 100000000");
		Scanner Scan = new Scanner(System.in);
		x=Scan.nextInt();
		}
		int primesFound=sieveOfEratosthenes(x);
		System.out.println("There were "+primesFound+" primes found in that range.");
		
    }
	
	 private static int sieveOfEratosthenes(int n) {
	 int numberOfPrimes=0;
	    {
	        boolean prime[] = new boolean[n + 1];
	        for (int i = 0; i <= n; i++)
	            prime[i] = true;
	        for (int x = 2; x * x <= n; x++) {
	            if (prime[x] == true) {
	                for (int i = x * x; i <= n; i += x)
	                    prime[i] = false;
	            }
	        }
	  for (int i = 2; i <= n; i++)
	        {
	            if (prime[i] == true)
	                numberOfPrimes++;
	        }
	    }
	    return numberOfPrimes;
	 }
}
