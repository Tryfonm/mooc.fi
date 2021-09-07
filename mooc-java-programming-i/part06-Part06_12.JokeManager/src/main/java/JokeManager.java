/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
import java.util.ArrayList;
import java.lang.Math;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> listOfJokes;

    public JokeManager() {
        this.listOfJokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.listOfJokes.add(joke);
    }

    public String drawJoke() {
        if (this.listOfJokes.size() == 0) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(this.listOfJokes.size());
            return this.listOfJokes.get(index);
        }
    }

    public void printJokes(){
        for (String joke:this.listOfJokes){
            System.out.println(joke);
        }
    }
}
