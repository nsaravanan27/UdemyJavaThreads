package blog.javappu.threads.runnableThreads;

import blog.javappu.threads.ThreadColors;

public class RunnableThreadDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new RunnableDemo());
        t.start();
    }
}

class RunnableDemo implements Runnable {

    public void run() {
        System.out.println(ThreadColors.ANSI_BLUE+"Runnable thread");
    }
}
