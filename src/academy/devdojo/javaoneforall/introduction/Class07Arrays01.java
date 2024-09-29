package academy.devdojo.javaoneforall.introduction;

public class Class07Arrays01 {
    public static void main(String[] args) {
        // an array is always an object
        // the new is only followed by a primitive type when creating arrays.
// reference variable = even though its of primitive type, it is an OBJECT
        int[] ages = new int[3];
        ages[0] = 12;
        ages[1] = 13;
        ages[2] = 15;
        System.out.println(ages[2]);
    }
}
