/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab09
 * Author: Sumeyye Acar
 * Id: 22103640
*/

public class Player {
    private String playerName;
    private int highScore;
    private int gamesPlayed;
    
    public Player( String playerName ){
        this.playerName = playerName;
        gamesPlayed = 0;
        highScore = 0;
    }


    //Name part 
    public void setPlayerName( String playerName ){
        this.playerName = playerName;
    }
    public String getPlayerName(){
        return playerName;
    }


    //High Score part
    public void setHighScore( int score ){
        if( score > highScore ){
            this.highScore = score;
        }
    }
    public int getHighScore(){
        return highScore;
    }


    //count of games played + 1
    public void increaseGamesPlayed(){
        this.gamesPlayed++;
    }


    //equals method
    public boolean equals( Object obj ){
        if( obj instanceof Player){
            Player p = (Player) obj;
            return this.playerName.equalsIgnoreCase( p.playerName );
        }
        return false;
    }


    //to string method
    public String toString(){
        return "Player Name: "+playerName + "\nGames Played: " + this.gamesPlayed +
                "\nHigh Score: " + this.highScore;
    }
}
