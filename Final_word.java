 class A{
    public final void show()
    {
        System.out.println("Hello, I am A");

    }
    public  int add(int a,int b)
    {
        return a+b;

    }
}
// final world agar class ke sath lagae to wo class ko extend nhi karne dega matlab simply inheritance rok dega.
// agar method ke sath final lagae to wo method ko override nhi karne dega
class B extends A{
    public void show(){
        System.out.println("Hello, I am B");
    }
}

public class Final_word {
    public static void main(String[] args) {    
        final int a=4;//variable ko constant kardeta hai;
        B obj=new B();
        obj.show();
        System.out.println(obj.add(3,4));
    
    }
    
}
