package academy.devdojo.javaoneforall.javacore.Oexception.runtime.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Inside ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Inside RuntimeException");
        }

        try {
            mayThrowException();
            // Can only do this catch when they are not in the same inheritance tree
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        try {
//            mayThrowException();
//        } catch (SQLException e) {
//            System.out.println("Inside SQLException");
//        } catch (IOException e) {
//            System.out.println("Inside IOException which also handles FileNotFoundException as it is its superclass!");
//        }

    }

    private static void mayThrowException() throws SQLException, FileNotFoundException {

    }
}
