package org.example;

public abstract class Participants {


    protected static int number;

    protected String name;


    public Participants(String name) {
        this.name = "Участник номер " + number;
        number++;
    }


    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Participants.number = number;
    }


    public abstract boolean jump(int height);

    public abstract boolean run(int height);

    public String getInfo() {
        return String.format(" %s ", name);
    }


}
