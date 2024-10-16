package operator;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n = 7;
		boolean prime =true;
		
		if (n==0 || n==1) {
			
			prime=false;
			
		}
		
			for (int i=2; i<=n-1; i++) {
				
				if (n%1==0) {
					
					prime = false;
				
					
				}
				
				if (prime==true) {
					System.out.println(n+"is a prime number");
					
				}
				
				else {
					System.out.println(n+"is not a prime number");
				}
					
				}
					
				}
			
		}				
	
	
				
