package blog.javappu.threads.extendThreads;

import blog.javappu.threads.ThreadColors;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ThreadColors.ANSI_GREEN + "This is from Another thread...");
        new Thread() {
            @Override
            public void run() {
                System.out.println(ThreadColors.ANSI_YELLOW + "Inner thread...");
            }
        }.start();
    }
}
