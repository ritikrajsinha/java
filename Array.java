import java.util.Scanner;

public class Array {
    public static void main(Strings_[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a=Math.random();
    
        // int[] array = {1, 2, 3, 4, 5,};
        // int[] array2 = {1, 2, 3, 4, 5};
        // //run a for loop on array 1
        // for (int i = 0; i<array.length;i++)
        // {
        //     System.out.print(array[i]+" ");


        // }
        // int [] arr=new int[4];
        // //inser element in this array
        // //using sc.nextLine se
        // for(int i=0;i<4;i++)
        // {
        //     int num=sc.nextInt();
        //     arr[i]=num;
        // }
        // //print the array
        // for(int i=0;i<4;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
      int arr[][]=new int[3][3];
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
            arr[i][j]=(int)(Math.random()*100);
        }
      }
      // print the array
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }





    }


    
    
}
