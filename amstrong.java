// amstrong


public class amstrong
{
    public static void main(String args[])
    {
        int num,number,temp,total;
        
        System.out.println("the amstrong number between 1 to 1000 are :");
        
        for(num = 1; num <=1000; num++){
            temp = 0;
            total = 0;
            number= num;
            
            while(number != 0){
                temp = number % 10;
                total = total + temp * temp * temp;
                number = number / 10;
            }
            if(total == num){
                System.out.println(num);
            }
        }
    }
}
