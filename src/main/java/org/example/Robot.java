package org.example;

public class Robot extends Participants {


    private final int MAX_RUN_DISTANCE = 500;
    private final int MAX_JUMP_DISTANCE = 20;

    public Robot() {
        super("Участник номер " + number);
    }

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

