
public class SortingOfArrayElements {


	public static void main(String[] args) {

		int number[] = {20, 15, 25, 5, 10, 2, 7, 5, 89, 50, 2, 100};
		boolean loop=false;
		while(loop==false){
			loop=true;

			for(int i=0; i<number.length-1; i++){

				if (number[i] > number[i+1]){

					int temp = number[i];
					number[i]=number[i+1];
					number[i+1]=temp;

					System.out.println(number[i] +"  "+ number[i+1] );
					loop=false;

				}
			}
		}

		for(int k=0; k < number.length; k++ )
			System.out.println(number[k]);
	}


}




