package academy.devdojo.javaoneforall.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Inside IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Inside ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Inside RuntimeException");
        }

        try {
            mayThrowException();
        } catch (SQLException e) {
            System.out.println("Inside SQLException");
        } catch (IOException e) {
            System.out.println("Inside IOException which also handles FileNotFoundException as it is its superclass!");
        }
    }

    private static void mayThrowException() throws SQLException, FileNotFoundException {

    }
}
