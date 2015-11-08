
public class NumberPrintingSenquence {

	public static void main(String[] args) {
		
		//Print in ascending order 1 12 123 1234 12345
		for(int i=1 ; i<=5 ; i++) {
			for(int j=1 ; j<=i; j++){
				System.out.println(j);
			}
			System.out.println("\n");
		}
		
		//print in reverse order 54321 5432 543 54 5
		for (int i=1; i<=5; i++) {
			for (int j=5; j>=i; j--) {
				System.out.println(j);
			}
			System.out.println("\n");
		}
			
	}

}
