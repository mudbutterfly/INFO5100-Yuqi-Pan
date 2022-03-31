public class MyThread extends Thread {

    private SafeQueue<Integer> queue;

    public MyThread(SafeQueue q) {
        this.queue = q;
    }

    @Override
    public void run() {
        try {
            this.queue.add(1);
            System.out.println("add");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
