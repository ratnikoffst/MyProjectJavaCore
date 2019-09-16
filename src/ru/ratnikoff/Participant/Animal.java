package ru.ratnikoff.Participant;

public abstract class Animal implements Competitor {
    String mName = "";
    int dist = 50;
    int jump = 3;
    int swim = 30;
    boolean mRun;
    boolean mSwim;
    boolean mJump;

    public void getDistance(int dist, int swim, int jump) {
        mRun = dist <= this.dist ? true : false;
        mSwim = swim <= this.swim ? true : false;
        mJump = jump <= this.jump ? true : false;
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
