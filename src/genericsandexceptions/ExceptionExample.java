package genericsandexceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author  tbhadauria <tarun.kumar.bhadauria@zalando.de>
 */
public class ExceptionExample {

    // No exception handling
    public double divideAndDontHandleException(final int a, final int b) {
        return a / b;
    }

    // catch the exception
    public double divideAndHandleException(final int a, final int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            // always executed
        } finally {
            System.out.println("free system resources");
        }

        return 0;
    }

    // specify the exception
    public void writeToFile() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
        System.out.println("Successfully written to file");
    }

}
