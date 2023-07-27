/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab09
 * Author: Sumeyye Acar
 * Id: 22103640
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class FlashCardQuiz {

    public static Scanner in = new Scanner(System.in);
    ArrayList<String> cardList = new ArrayList<String>();
    ArrayList<String> quizlList = new ArrayList<String>();
    Player player;

    public FlashCardQuiz(String file, Player p) throws FileNotFoundException {
        player = p;
        loadCards(file);
        initializedQuiz();
    }

    public void loadCards(String file) throws FileNotFoundException {
        Scanner inFile = new Scanner(new File(file));
        while(inFile.hasNextLine()) {
            String word = inFile.nextLine();
            cardList.add(word);
        }
        inFile.close();
    }

    public void initializedQuiz() {
        System.out.print("Please enter the number of questions you would like to have: ");
        int numberOfQuestions = in.nextInt();
        while(quizlList.size() < numberOfQuestions) {
            int i = (int) ((Math.random()) * (cardList.size() - 1) ); 
            String q1 = cardList.get(i);
            if(!quizlList.contains(q1)) {
                quizlList.add(q1); 
            }
        }
    }

    public void takeQuiz() {
        FlashCardQuiz.in = new Scanner(System.in);
        int score = 0;
        for(int i = 0; i < quizlList.size(); i++) {
            quizlList.set(i, quizlList.get(i).trim());
            String question = "";
            for(int j = 0; j < quizlList.get(i).length(); j++) {
                if(Character.isLetter(quizlList.get(i).charAt(j))) {
                    question += quizlList.get(i).charAt(j);
                }
                if(!Character.isLetter(quizlList.get(i).charAt(j))) {
                    break;
                }
            }
            quizlList.set(i, quizlList.get(i).substring(question.length(), quizlList.get(i).length()).trim());
            String correctAnswer = "";
            for(int j = 0; j < quizlList.get(i).length(); j++) {
                if(Character.isLetter(quizlList.get(i).charAt(j))) {
                    correctAnswer += quizlList.get(i).charAt(j);
                }
                if(!Character.isLetter(quizlList.get(i).charAt(j))) {
                    break;
                }
            }
            System.out.println("*".repeat(question.length() + 6) + "\n" + 
                                "*" + " ".repeat(question.length() + 4) + "*" + "\n" +
                                "*  " + question + "  *" + "\n" + 
                                "*" + " ".repeat(question.length() + 4) + "*" + "\n" +
                                "*".repeat(question.length() + 6));

            System.out.println("Answer: ");
            String answer = in.nextLine();

            if(answer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("True!");
                score++;
            }
            else if(!answer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("False, try another time! Correct Answer: " + correctAnswer);
            }
        }
        this.player.increaseGamesPlayed();
        this.player.setHighScore(score);
        System.out.println("Your Score: " + score + "/" + quizlList.size() );
    }
    
}
