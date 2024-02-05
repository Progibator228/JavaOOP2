package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {



    public static void main(String[] args) {


        Participants player1 = new Human();
        Participants player2 = new Human();
        Participants player3 = new Human();

        Participants player4 = new Cat();
        Participants player5 = new Cat();

        Participants player6 = new Robot();

        Wall let1 = new Wall();
        Track let2 = new Track();

        List<Participants> participantsList = new ArrayList<>(Arrays.asList
                (player1,player2,player3,player4,player5,player6));


        List<Integer> let = new ArrayList(Arrays.asList(let1,let2));

        for (Participants elem : participantsList) {
            if (true == elem.jump(let1.getMAX_HIGHT_DISTANCE())){
                System.out.println(elem.getInfo()+"Препрыгнул");
                if (true == elem.run(let2.getMAX_MAX_DISTANCE())){
                    System.out.println(elem.getInfo()+ "Финишировал");
                }
                else {
                    System.out.println(elem.getInfo()+"Выбыл");
                }
            }
            else {
                System.out.println(elem.getInfo()+"Выбыл");
            }
        }

    }
    
}