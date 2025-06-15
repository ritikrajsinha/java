class A{
    public A()
    {
        System.out.println("Inside A");
    }
     public A(int n)
    {
        System.out.println("Inside A with int");
     }
}
class B extends A{
    public B()
    {
        super();
         System.out.println("Inside B");
    }
     
     public B(int n){
        
         this();
         System.out.println("Inside B with int");
     }
}



class This_Super{
    public static void main(String[] args)
    {
        B obj=new B(10);
        

        
    

    }
}