package blog.javappu.threads.extendThreads;

import static blog.javappu.threads.ThreadColors.*;

public class ExtendThreadDemo {
    public static void main(String[] args) {

        System.out.println(ANSI_RED+"Main thread..");

        Thread thread = new AnotherThread();
        thread.start();
        System.out.println(ANSI_RED + "Exit main thread...");
    }
}
