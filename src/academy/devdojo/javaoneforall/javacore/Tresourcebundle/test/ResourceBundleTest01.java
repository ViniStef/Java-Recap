package academy.devdojo.javaoneforall.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));
        bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));

        // Order of tries exemple:
        // Locale("fr", "CA");
        // messages_fr_CA.properties
        // messages_fr.properties
        // messages_pt_BR.properties
        // messages_pt.properties
        // messages.properties
        // if not found, throws an exception
    }
}
