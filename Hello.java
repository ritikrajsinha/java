class Computer{


   public void playMusic()
   {
    System.out.println("Playing music..");

   }

   public String giveMeApen(int cost)
   {
    if(cost>=10)
    {
        return "You can buy a pen";

    }
    else{
        return "You can't buy a pen";
        
    }

   } 

}

public class Hello
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        
        Computer comp = new Computer();
        comp.playMusic();
        String result=comp.giveMeApen(2);
        System.out.println(result);




    }
}
