public class Main extends Thread {


    public void run() {
     System.out.println(Thread.currentThread().getName());
     }


    public static void main(String args[]) {
     Thread t1= new Main();
     t1.start();
    }
}
