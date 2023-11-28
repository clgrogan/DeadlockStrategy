package thread.deadlock;

public class TrainA extends Train{
    public TrainA(Intersection intersection) {
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
            intersection.takeRoadB();
        }
    }
}
