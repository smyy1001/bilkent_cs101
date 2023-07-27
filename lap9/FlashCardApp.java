/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab09
 * Author: Sumeyye Acar
 * Id: 22103640
*/

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class FlashCardApp {
    public static void main(String[] args) throws FileNotFoundException {
        FlashCardQuiz.in = new Scanner( System.in );
        ArrayList<Player> players = new ArrayList<Player>();
        int choice = 0;
        do {
            String menu = "1-Play Game\n2-View Player Information\n3-Quit\nChoice: ";
            System.out.print(menu);
            choice = FlashCardQuiz.in.nextInt();
            if(choice == 1) {
                FlashCardQuiz.in = new Scanner( System.in );
                System.out.print("Enter playername: ");
                String playerName = FlashCardQuiz.in.nextLine();
                Player playerWhoWillPlay = new Player(playerName);
                if (!players.contains(playerWhoWillPlay) ) {
                    players.add(playerWhoWillPlay);
                }
                FlashCardQuiz quiz1 = new FlashCardQuiz("turkish_english_words.txt", playerWhoWillPlay);
                quiz1.takeQuiz();
            }
            else if(choice == 2) {
                FlashCardQuiz.in = new Scanner( System.in );
                System.out.print("Enter Username: " );
                String  userNmae = FlashCardQuiz.in.nextLine();
                for( int i = 0; i < players.size(); i++ ) {
                    if(players.get(i).getPlayerName().equalsIgnoreCase(userNmae)) {
                        System.out.println(players.get(i));
                    }
                }
            }
            else if(choice == 3) {
                FlashCardQuiz.in = new Scanner( System.in );
                System.out.println("Good Bye!");
            }
        }while( choice != 3 );
        FlashCardQuiz.in.close();
        
    }
}