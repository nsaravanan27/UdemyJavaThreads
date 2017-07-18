/**
 * * #   Nokia Confidential   #
 */
package blog.javappu.threads.extendThreads;

import blog.javappu.threads.ThreadColors;

/**
 * Created by s6n on 17-07-2017.
 */
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
