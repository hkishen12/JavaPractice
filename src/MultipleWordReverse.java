import java.util.Scanner;


public class MultipleWordReverse {
	 public static int count;
	
	public static void main(String[] args) {
		
	  
		Scanner In = new Scanner(System.in);
		System.out.println("Enter a word");
		String s=In.nextLine();
		
		
		int len =s.length();
		
		int i;
		for ( i=0 ; i<=len-1 ; i++)
			for (int j=i+1 ; j<=len-1; j++)
				
				if (s.charAt(i)==s.charAt(j));
		            count=count+1;
		            System.out.println(count);

	}

}
