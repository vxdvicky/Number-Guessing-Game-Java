import java.util.Arrays;
import java.util.Scanner;
class app {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        
        int number = (int)(Math.random()*100);
        
        System.out.println("Welcome in the number gussing game ");

        int guess = 0;
        

        while (guess != number) {
            System.out.println("enter the number in Range 1-100:");
         guess = sc.nextInt();
        

        if (number  > guess) {
            System.out.println("your number is too low ");

        }
        else if(guess > number ){
            System.out.println("your number is too high");
        }
        else if (guess==number) {
            System.out.println("its the true number");
        }
        else{
            System.out.println("enter the valid number!");
        }
    }

    }
}
