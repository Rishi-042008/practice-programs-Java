package com.company.Abstract.Abstract_Beginner_problems;

abstract class OnlineGame{
    abstract public void startGame();
    abstract public void endGame();
    public void showRules(){
        System.out.println("Follow game objectives and survive against opponents, The last one standing is the winner ");
    }
}

class BGMI extends OnlineGame{
    public void startGame(){
        System.out.println("Click start button to start and play in the given map with provided weapons and accessories");
    }
    public void endGame(){
        System.out.println("When your character is Killed by other player then you are out of the game and the game is COMPLETED");
    }
}

class freefire extends OnlineGame{
    public void startGame(){
        System.out.println("Invite 3 friends make a squad Click start button to start and play in the given map with provided weapons and accessories in Clash squad game");
    }
    public void endGame(){
        System.out.println("When your team wins over the opposite team by leading in rounds then your team is WIN and Game is completed ");
    }
}
public class Online_game_using_abstract{
    public static void main(String[] args){
    BGMI rahul = new BGMI();
    rahul.showRules();
    rahul.startGame();
    rahul.endGame();

    freefire maxim = new freefire();
    maxim.showRules();
    maxim.startGame();
    maxim.endGame();

    }

}