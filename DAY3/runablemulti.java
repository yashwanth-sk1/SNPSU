package DAY3;

class  runablemulti implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void main(String[] args) {

    	runablemulti d = new runablemulti();

        Thread t1 = new Thread(d, "Thread-1");
        Thread t2 = new Thread(d, "Thread-2");

        t1.start();
        t2.start();
    }
}