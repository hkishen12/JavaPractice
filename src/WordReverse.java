
public class WordReverse {

	
	public static void main(String[] args) {
	  
	
		 String demo="Hi I Am Fine";
		 
		 String[] str= demo.split(" ", 12);
		 
		 int len= str.length;
			for(int i=len-1;i>=0;i--){
				System.out.println(str[i]);
				
				}
					
			
	} 
	
	
		   /* String demo = "DOT TOD...";
		    int len = demo.length();
		    char[] tempCharArray = new char[len];//An array
		    char[] charArray = new char[len];// an Array
		    
		    // put original string in an array of chars
		    for (int i = 0; i < len; i++) {
		        tempCharArray[i] = demo.charAt(i);
		    } 
		    
		    // reverse array of chars
		    for (int j = 0; j < len; j++) {
		        charArray[j] =   tempCharArray[len - 1 - j];
		    }
		    
		    String reversedemo = new String(charArray); //Convert  Char array to String without using toString
		    System.out.println(reversedemo);
		}*/

}
