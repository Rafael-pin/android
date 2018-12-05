package rafael.pinheiro.exerciciotarde.model;

import java.util.Random;

public class Dice {


    public static int rollD(int number) {
        Random r = new Random();
        return r.nextInt(number) + 1;
    }
}
