package Arrays;
public class SecondLargestEle 
{
   public static void main(String[] args)
   {
     int[] arr = {3,2,1,5,6};
     int largestele = Integer.MIN_VALUE;
     int secondlargestele = Integer.MIN_VALUE;

     for(int i=0; i<arr.length; i++)
     {
        if(arr[i]>largestele)
        {
          secondlargestele=  largestele;
          largestele = arr[i];
        }
        else if(arr[i]>secondlargestele && arr[i]!=largestele)
        {
            secondlargestele = arr[i];
        }
        
     }
     System.out.println(secondlargestele);
   }    
}
