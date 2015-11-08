class staticMethod{  
     int rollno;  
     String name;  
     static String college = "ITS";  
       
     static void change(){  
     college = "BBDIT";  
     }  
  
     staticMethod(int r, String n){  
     rollno = r;  
     name = n;  
     }  
  
     void display (){System.out.println(rollno+" "+name+" "+college);}  
  
    public static void main(String args[]){  
    staticMethod.change();  
  
    staticMethod s1 = new staticMethod (111,"Karan");  
    staticMethod s2 = new staticMethod (222,"Aryan");  
    staticMethod s3 = new staticMethod (333,"Sonoo");  
  
    s1.display();  
    s2.display();  
    s3.display();  
    }  
}  