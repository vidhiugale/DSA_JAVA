package Arrays;
public class CheckSorted
 {
    public static void main(String[] args) {
        
    
   int[] arr= {1,2,1,3,4};

   for(int i=1;i>=arr[i-1];i++)
    {
        if(arr[i]>=arr[i=1])
        {
            
        }
        else
        {
            System.out.println("Array is not sorted");
        }
    }    
}
}
