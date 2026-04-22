package Arrays;
class LargestEle
{
    public static void main(String[] args)
    {
        int[] arr = {-4,-3,0,1,-8};

         int largestElement = arr[0];
         for(int i =0; i<arr.length;i++)
         {
            if(arr[i]>largestElement)
            {
                largestElement = arr[i];
            }
         }
         System.out.println(largestElement);
    }
}