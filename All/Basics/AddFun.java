package Basics;
public class AddFun 
{
    public static int findSum(int a, int b)
    {
        return a+b;
    }   
    
    public static void main(String[] args) 
    {
       int num1=5;
       int num2 =10;
       int result = findSum(num1,num2);
       System.out.println("sum = "+result);
    }
}
