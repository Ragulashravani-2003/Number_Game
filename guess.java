import java.util.*;
public class guess {
  public static int MAX_ROUNDS=3;
  public static int MIN_RANGE=1;
  public static int MAX_ATTEMPTS=5;
  public static int MAX_RANGE=100;
  public static void main(String args[])
  {
    Random random=new Random();
    Scanner sc=new Scanner(System.in);
    int total_score=0;
    System.out.println("WELCOME TO THE GUESSING A NUMBER");
    System.out.println("TOTAL ROUNDS=3");
    System.out.println("NUMBER OF ATTEMPTS FOR EACH ROUND:5");
    for(int i=0;i<MAX_ROUNDS;i++){
    int number=random.nextInt(MAX_RANGE)+MIN_RANGE;
    int current_attempts=0;

    System.out.printf("Current Round:%d\nGuess the number between the %d and %d in %d attempts\n",i,MIN_RANGE,MAX_RANGE,MAX_ATTEMPTS);
    while(current_attempts<MAX_ATTEMPTS)
    {
        int guess_number=sc.nextInt();
        current_attempts++;
        if(guess_number==number)
        {
            int score=MAX_ATTEMPTS-current_attempts;
            total_score+=score;
            System.out.printf("Congrats! you are correctly Guessed the number.\nAttempts:%d  Round score:%d\n",current_attempts,score);
            break;
        }
        else if(guess_number<number)
        {
            System.out.printf("The number is greater then %d.\nAttempts:%d\n",guess_number,MAX_ATTEMPTS-current_attempts);
        }
         else if(guess_number>number)
        {
            System.out.printf("The number is smaller then %d.\nAttempts:%d\n",guess_number,MAX_ATTEMPTS-current_attempts);
        }
    }
    if(current_attempts==MAX_ATTEMPTS)
    {
        System.out.printf("You Lost in this ROund :%d.\nAttempts:0\n",i);
        System.out.printf("The Random number is:%d\n",number);
    }
    System.out.printf("GAME OVER!\nTotal Score:%d\n",total_score);
    sc.close();
   }
  }
}
