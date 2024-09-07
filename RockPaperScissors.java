package JavaPracticeSet01;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Rock,Paper, Scissors");
        System.out.println("Enter your Choice: Rock, Paper,Scissors...");
        String user_choice;
        user_choice = sc.nextLine();
        user_choice = user_choice.substring(0,1).toUpperCase()+
                user_choice.substring(1).toLowerCase();
        String [] producible_choice = {"Rock","Paper","Scissors"};
          int computer_index;
          computer_index = random.nextInt(3);
          String computer_choice = producible_choice[computer_index];
        System.out.println("Computer Choice: "+computer_choice);
        if (user_choice.equals(computer_choice)){
            System.out.println("It's a tie!");
        }
     else if (user_choice.equals("Rock") && computer_choice.equals("Scissors")){
            System.out.println("Congratulations you Win!!");
        }
     else if(user_choice.equals("Scissors") && computer_choice.equals("Paper")) {
            System.out.println("Congratulations you Win!!");
        }
     else if(user_choice.equals("Paper") && computer_choice.equals("Rock")) {
            System.out.println("Congratulations you Win!!");
        }
            else{
            System.out.println("Computer Win, Try again!");
        }
    }
}
