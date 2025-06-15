//declare class
class calc {
    public int add(int a,int b)
    {
        return a+b;
    }
}
class advcalc extends calc{
    public int add(int a,int b)
    {
        return a+b+1;
    }

}

class Method_over{
    //public 
    public static void main(String[] args)
    {
        advcalc ac=new advcalc();
        int res=ac.add(1, 2);
        System.out.println("res is "+res);

    }
}