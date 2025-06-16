class Parent{
    public void show1()
    {
        System.out.println("Parent class method");
    }

}
class Child extends Parent
{
    public void show2()
    {
        System.out.println("Child class method");

    }
}




public class Up_Do {
    public static void main(String[] args)
    {
        Parent obj=new Child();//Upcasting
        obj.show1();

        Child obj1=(Child)obj;//Downcasting
        obj1.show2();
        


    }
    
    
}
