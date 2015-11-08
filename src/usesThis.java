
class usesThis{  
    int id;  
    String name;  
    usesThis(){System.out.println("default constructor is invoked");}  
      
    usesThis(int id,String name){  
    this ();//it is used to invoked current class constructor.  
    this.id = id;  
    this.name = name;  
    }  
    void display(){System.out.println(id+" "+name);}  
      
    public static void main(String args[]){  
    usesThis e1 = new usesThis(111,"karan");  
    usesThis e2 = new usesThis(222,"Aryan");  
    e1.display();  
    e2.display();  
   }  
}  