 class Calculate{
   
    public int add(int n1,int n2)
    {
        return n1+n2;
    }

    public int sub(int n1,int n2){
        return Math.abs(n1-n2);

    }
}

class Advcalc extends Calculate{
    public int mul(int n1,int n2){
        return n1*n2;
    }
    //divide
    public int div(int n1,int n2){
        return n1/n2;
    }
        

}
class SciCalc extends Advcalc
{
    public int pow(int n1,int n2){
        return (int)Math.pow(n1,n2);
    }
    public int squareroot(int n1)
    {
        return (int)Math.sqrt(n1);

    }

}

 class Inher {
    public static void main(String[] args) {
      
        SciCalc sc = new SciCalc();
        System.out.println(sc.add(10, 20));
        System.out.println(sc.sub(10, 20));
        System.out.println(sc.mul(10, 20));
        System.out.println(sc.div(10, 2));
        System.out.println(sc.pow(10, 2));
        System.out.println(sc.squareroot(16));

      
    


    }
    
}
