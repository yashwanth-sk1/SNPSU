package DAY3;

class SharedResource {

    synchronized void firstMethod(SharedResource resource) {

        System.out.println(Thread.currentThread().getName()
                + " entered firstMethod()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()
                + " is waiting for secondMethod()");

        resource.secondMethod();
    }

    synchronized void secondMethod() {

        System.out.println(Thread.currentThread().getName()
                + " entered secondMethod()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class deadlck {

    public static void main(String[] args) {

        SharedResource resourceA = new SharedResource();
        SharedResource resourceB = new SharedResource();

        Thread threadOne = new Thread(() -> {
            resourceA.firstMethod(resourceB);
        }, "Thread 1");

        Thread threadTwo = new Thread(() -> {
            resourceB.firstMethod(resourceA);
        }, "Thread 2");

        threadOne.start();
        threadTwo.start();
    }
}