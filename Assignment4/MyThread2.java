public class MyThread2 extends Thread{

    private SafeQueue<Integer> queue;

    public MyThread2(SafeQueue q) {
        this.queue = q;
    }

    @Override
    public void run() {
        try {
            this.queue.remove();
            System.out.println("remove");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
