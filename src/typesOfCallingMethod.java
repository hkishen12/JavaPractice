
class typesOfCallingMethod{  
  static int cube(int x){  
  return x*x*x;  
  }  
  
  public static void main(String args[]){  
	  
  typesOfCallingMethod b1=new typesOfCallingMethod();
  int b2=b1.cube(7);
  System.out.println(b2);
  int result=typesOfCallingMethod.cube(5);  
  System.out.println(result);  
  }  
}  
