public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        SafeQueue<Integer> sq = new SafeQueue<Integer>(5);
        for (int i = 0; i < 10; i++) {
            MyThread thread = new MyThread(sq);
            thread.start();
        }
        for (int i = 0; i < 5; i++) {
            MyThread2 thread = new MyThread2(sq);
            thread.start();
        }

        Thread.sleep(5000);
        System.out.println(sq.isEmpty());
    }
}
