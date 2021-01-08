public class Test {
    public static void main(String[] args) throws InterruptedException {
        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();
        Thread t1 = new Thread(odd);
        Thread t2 = new Thread(even);
        t1.start();
        t1.join();
        t2.start();

    }
}
