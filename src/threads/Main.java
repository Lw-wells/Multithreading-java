package threads;

class Main implements Runnable { // Changed to a non-public class
    public static void main(String[] args) {
        Main obj = new Main();
        Thread thread = new Thread(obj);
        thread.start();

        
       
    }
    
    public void run() {
        System.out.println("This code is running outside the thread.");
    }
}

class ThreadExample extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Thread: " + i); 
        }
    }
}
