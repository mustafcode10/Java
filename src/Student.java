import java.util.Scanner;
import java.util.Random;

public class Student {


    public void printMsg(String msg){
        System.out.println(msg);
    }

    public void guessMyNumber(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Your number: ");
        int number = reader.nextInt();
        Random rand=new Random();
        int guess=rand.nextInt();
        int i=0;
        do {


            if (guess==number) {
                System.out.println("Congratulation!! You win!!");
                i=5;
            }
            else {
                System.out.println("Guess again please ...!!!");
                number = reader.nextInt();
                i++;
            }




            // statements
        } while (i<3);

        System.out.println("You are stupid Man ...!!!");





    }

}
