package se.iths.romeo.Prob;

public class Player {
private String firstName;
private String lastName;
private int score;
public int getScore(){
    return score;
}
public String getFullName() {
    return firstName + " " + lastName;
}
public void addToScore(int score) {
    this.score = this.score + score;
}
public Player(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName =  lastName;
}
    }

