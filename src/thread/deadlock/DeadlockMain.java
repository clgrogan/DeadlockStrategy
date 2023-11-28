package thread.deadlock;

public class DeadlockMain {
    static Intersection intersection = new Intersection();

    public static void main(String[] args) {
        Thread trainAThread = new Thread(new TrainA(intersection));
        Thread trainBThread = new Thread(new TrainB(intersection));

        trainAThread.start();
        trainBThread.start();
    }
}
