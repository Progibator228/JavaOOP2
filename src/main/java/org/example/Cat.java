package org.example;

public class Cat extends Participants {


    private final int MAX_RUN_DISTANCE = 400;
    private final int MAX_JUMP_DISTANCE = 10;


    public Cat() {
        super("Участник номер " + number);
    }

    @Override
    public boolean jump(int height) {
        if (MAX_JUMP_DISTANCE >= height) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean run(int height) {
        if (MAX_RUN_DISTANCE >= height) {
            return true;
        } else {
            return false;
        }
    }

    public String getInfo() {
        return String.format("%s ", super.getInfo());
    }
}
