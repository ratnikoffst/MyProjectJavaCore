package ru.ratnikoff.Participant;

public abstract class Animal implements Competitor {
    String mName = "";
    int dist = 50;
    int jump = 3;
    int swim = 30;
    boolean mRun;
    boolean mSwim;
    boolean mJump;

    //
    public int getDistance() {
        return dist;
    }

    public int getSwim() {
        return dist;
    }

    public int getWall() {
        return dist;
    }

    public void setIsDistance(Boolean check) {
        mRun = check;
    }

    public void setIsSwim(Boolean check) {
        mSwim = check;
    }

    public void setIsWall(Boolean check) {
        mJump = check;
    }

    public void info() {
        if (mRun) {
            System.out.println(mName + " Кросс пробежал");
        } else {
            System.out.println("" + mName + " Кросс не пробежал.Сдох");
        }
        if (mSwim) {
            System.out.println(mName + " Реку переплыл");
        } else {
            System.out.println("" + mName + " Реку не переплыл.Сдох");
        }
        if (mJump) {
            System.out.println(mName + " Стену перепрыгнул");
        } else {
            System.out.println("" + mName + " Стену не перепрыгнул.Убилься");
        }
    }
}
