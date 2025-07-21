import java.util.*;
//import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args)
    {
       int[] arr={1,7,3,9,2,53,0};
       System.out.println(Arrays.toString(bubble(arr)));



    }
    public static int[] bubble(int arr[])
    {
      for(int i=arr.length-1;i>=0;i--)
      {
        for(int j=0;j<=i-1;j++)
        {
             if(arr[j]>arr[j+1])
             {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

             }
        }
      }
      return arr;
    }
}
