package testclasses.genericsandexceptions;

import java.io.IOException;

import genericsandexceptions.ExceptionExample;

public class TestClass {

    public static void main(final String[] args) throws IOException {
        ExceptionExample exceptionExample = new ExceptionExample();

        // Throws run time exception because of division by 0
        exceptionExample.divideAndDontHandleException(1, 0);

        exceptionExample.divideAndHandleException(1, 0);
        System.out.println("Executed after exception");

        // handle the exception
        try {
            exceptionExample.writToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // throw the exception
        exceptionExample.writToFile();

    }

}
