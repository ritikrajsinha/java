
import tools.other;


class L extends other{
 public void setmarks(int marks)
 {
    this.marks = marks;
 }
  void display(){
    System.out.println(marks);
  }
}
class K extends B{
    public void print()
    {
        System.out.println(b);
    }
}
public class Demo {
    public static void main(String[] args) {
        // Create a new instance of the Scanner class
         L obj=new L();
         K obj1=new K();
         obj.setmarks(90);
         obj.display();
         obj1.print();

        
        
        
        
    
        

    }

    
}
