import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int count=0;
        Random x = new Random();
        Scanner sc = new Scanner(System.in);

        int number = x.nextInt(101);                 //number between 0 to 100
        ArrayList<Integer>array = new ArrayList<Integer>();

        for(int i=0 ;i<10 ;i++){
            System.out.print("Enter your " + i +"th guess :");
            array.add(sc.nextInt()) ;
         
             if( number == array.get(i))
            {
                System.out.println("you guessed it correct");
                count++;
                break;
            }
            else if(number < array.get(i))
                System.out.println("too high..!,try again");
            else if (number > array.get(i))
                System.out.println("too low..!,try again"); 
            else
                System.out.println("invalid");          
            
        }
        System.out.println("\n\n\n");
        int score = (11 - array.size());
        System.out.println("you used "+ array.size()+ " attempt");
            if (count==0){
                score=0;
                System.out.println("your score:"+ score + " (out of 10)");
            } 
            else
                System.out.println("your score is :"+score + " ( out of 10)");           
        System.out.print("random number is :" + number);
        sc.close();
    }
    
}
