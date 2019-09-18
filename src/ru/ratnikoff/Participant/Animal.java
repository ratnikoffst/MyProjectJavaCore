package ru.ratnikoff.Participant;

public abstract class Animal implements Competitor {
    String mName = "";
    int dist;
    int jump;
    int swim;
    boolean mRun = false;
    boolean mSwim = false;
    boolean mJump = false;

    //
    Animal(String name, int dist, int jump, int swim) {
        mName = name;
        this.dist = dist;
        this.jump = jump;
        this.swim = swim;
    }

    public void isOnDistance(int type, boolean mIsOn) {
        switch (type) {
            case 0:
                mRun = mIsOn;
                break;
            case 1:
                mSwim = mIsOn;
                break;
            case 2:
                mJump = mIsOn;
                break;
        }
    }

    public void info() {
        if (mRun) {
            System.out.println(mName + " дистанцию пробежал !!");
        } else {
            System.out.println(mName + " дистанцию не пробежал !!");
        }
        if (mSwim) {
            System.out.println(mName + " дистанцию проплыл !!");
        } else {
            System.out.println(mName + " дистанцию не проплыл !!");
        }
        if (mJump) {
            System.out.println(mName + " дистанцию перепрыгнул !!");
        } else {
            System.out.println(mName + " дистанцию не перепрыгнул !!");
        }

    }

    public int getDist() {
        return dist;
    }

    public int getSwim() {
        return swim;
    }

    public int getWall() {
        return jump;
    }

}
