/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab09
 * Author: Sumeyye Acar
 * Id: 22103640
*/

public class FlashCard {
    private String question;
    private String answer;
    private int difficulty;

    //constructor
    public FlashCard(String question, String answer, int difficulty){
        this.question = question;
        this.answer = answer;
        this.setDifficulty( difficulty);
    }


    //Question part
    public void setQuestion(String question){
        this.question = question;
    }
    public String getQuestion(){
        return this.question;
    }


    //Answer part
    public void setAnswer(String answer){
        this.answer = answer;
    }
    public String getAnswer(){
        return this.answer;
    }



    //the difficulty part
    public void setDifficulty( int difficulty){
        if( difficulty >= 1 && difficulty <= 5){
            this.difficulty = difficulty;
        }
        else{
            this.difficulty = 0;
        }            
    }
    public int getDifficulty(){
        return this.difficulty;
    }


    private String formatOutput( char output ){
        String data;
        String result;

        if(output == 'Q'){
            data = this.question;
        }
        else {
            data = this.answer;
        }
        
        result = ( "*".repeat(data.length() + 10)) + "\n";
        result += (('*' + "    ") + " ".repeat(data.length()) + "    " + "*" + "\n").repeat( 1 );
        result += "*    " + data + "    " + "*" +"\n";
        result += (('*' + "    ") + " ".repeat(data.length()) + "    " + "*" + "\n").repeat( 1 );
        result += "*".repeat(data.length() + 10) + "\n";
        return result;
    }

    public void showFlashCard( ){
        System.out.println( this.formatOutput('Q'));
    }

    public void flipFlashCard(){
        System.out.println( this.formatOutput('A'));
    }

    public boolean equals( Object other){
        if( other instanceof FlashCard ){
            FlashCard otherCard = (FlashCard)other;
                return this.question.toLowerCase().equals(otherCard.question.toLowerCase()) &&
                        this.answer.toLowerCase().equals(otherCard.answer.toLowerCase());
        }
        return false;
    }

    public boolean lessThan( FlashCard other){
        return this.difficulty < other.difficulty;
    }

    public String toString( ){
        return "\n" + this.question + ":" + this.answer + "(" + this.difficulty +")";
    }

}