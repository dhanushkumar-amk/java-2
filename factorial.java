// factorial

import java.util.Scanner;

public class factorial
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value :");
        
        int num = s.nextInt();
        int factorial = fact(num);
        System.out.println("The factorial value is :" + factorial);
    }


static int fact( int n)
{
    int output;
    if(n == 1)
    {
        return 1;
    }
     output = fact(n - 1)*n;
     return output;
} 
}