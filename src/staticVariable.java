class staticVariable{  
int count=0;
//static int count=0;//will get memory when instance is created  
  
staticVariable(){  
count++;  
System.out.println(count);  
}  
  
public static void main(String args[]){  
  
staticVariable c1=new staticVariable();  
staticVariable c2=new staticVariable();  
staticVariable c3=new staticVariable();  

  
 }  
}  