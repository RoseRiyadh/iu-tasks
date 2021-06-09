package tech.mervinity;

import java.io.File;

/**
 * hello
 */
public class HelloWorld {
    /**
     * Hello world class
     * implementation of task :
     * Please write a program using listRoots()-static method from the class File, to list the root directories.
     * @param argv - Argument vector
     */
    public static void main(String[] argv) {
        File[] roots = File.listRoots();
        for (File rootDir : roots) {
            System.out.println(rootDir);

            File[] files = rootDir.listFiles();
            for (File file : files) {
                System.out.print(file.getAbsolutePath() + "\t");
            }
        }
    }
    /*
    OUTPUT :
    /
/cdrom	/etc	/usr	/mnt	/media	/dev	/sys	/lost+found	/home	/libx32	/run	/lib	/proc	/srv	/tmp	/boot	/var	/root	/swapfile	/lib32	/lib64	/bin	/snap	/opt	/.dotnet	/sbin
Process finished with exit code 0

     */
}
