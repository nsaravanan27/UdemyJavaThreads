/**
 * * #   Nokia Confidential   #
 */
package blog.javappu.threads.extendThreads;

import static blog.javappu.threads.ThreadColors.*;

/**
 * Created by s6n on 17-07-2017.
 */
public class ExtendThreadDemo {
    public static void main(String[] args) {

        System.out.println(ANSI_RED+"Main thread..");

        Thread thread = new AnotherThread();
        thread.start();
        System.out.println(ANSI_RED + "Exit main thread...");
    }
}
