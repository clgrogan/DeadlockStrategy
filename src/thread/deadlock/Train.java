package thread.deadlock;

import java.util.Random;

public abstract class Train implements Runnable{
    Intersection intersection;
    Random random = new Random();

    public Train(Intersection intersection){
        this.intersection = intersection;
    }

    @Override
    public void run() {

    }
}
