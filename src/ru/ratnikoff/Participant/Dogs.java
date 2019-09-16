package ru.ratnikoff.Participant;

public class Dogs implements Competitor {
    private String mName = "";
    int dist = 200;
    int jump = 4;
    int swim = 75;
    boolean mRun = false;
    boolean mSwim = false;
    boolean mJump = false;


    public Dogs(String dog) {
        this.mName = dog;
    }

    @Override
    public void run(int dist) {
        mRun = dist <= this.dist ? true : false;
    }

    @Override
    public void swim(int swim) {
        mSwim = swim <= this.swim ? true : false;
    }

    @Override
    public void jump(int jump) {
        mJump = jump <= this.jump ? true : false;
    }

    @Override
    public boolean isOndistance() {
        return false;
    }

    @Override
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

    @Override
    public void getDistance(int dist, int swim, int heigth) {
        run(dist);
        swim(swim);
        jump(heigth);
    }
}
