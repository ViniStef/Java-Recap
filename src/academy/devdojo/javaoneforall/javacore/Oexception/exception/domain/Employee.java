package academy.devdojo.javaoneforall.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Employee extends Person{
    // Cannot throw checked exceptions if they're not being thrown in the original method
    // Can throw any of the Runtime Exceptions
    // Cannot throw an Exception that is more generic than the one declared in the original (for example, if they declare
    // FileNotFoundException, you cannot do IOException, but you can do the opposite).
    public void save() throws FileNotFoundException {

    }
}
