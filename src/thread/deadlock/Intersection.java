package thread.deadlock;

public class Intersection {
    private Object roadA = new Object();
    private Object roadB = new Object();

    public void takeRoadA(){
        synchronized (roadA) {
            System.out.println("Road A is locked by thread "
                    + Thread.currentThread().getName());
            synchronized (roadB) {
                System.out.println("Train B is passing through road A in the intersection.");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public void takeRoadB() {
        System.out.println("entering takeRoadB()");
        synchronized (roadB){
            System.out.println("Road B is locked by thread"
                    + Thread.currentThread().getName());
            synchronized (roadA) {
                System.out.println("Train A is passing through road B in the intersection.");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
