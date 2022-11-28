public class threadclass extends Thread {
    public void run() {
        System.out.println("i am running");
    }

    public static void main(String[] args) {
        threadclass t1 = new threadclass();
        threadclass t2 = new threadclass();
        threadclass t3 = new threadclass();
        t1.start();
        t2.start();
        t3.start();
        t1.stop();
        System.out.println(t1.getState());
    }

}



