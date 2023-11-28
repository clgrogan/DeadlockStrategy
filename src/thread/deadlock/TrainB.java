package thread.deadlock;

public class TrainB extends Train{
    public TrainB(Intersection intersection) {
        super(intersection);
    }

    @Override
    public void run(){
        long sleepDuration = random.nextInt(5);
        while(true) {
            try {
                Thread.sleep(sleepDuration);
            } catch (InterruptedException e) {
            }
            intersection.takeRoadA();
        }
    }
}
