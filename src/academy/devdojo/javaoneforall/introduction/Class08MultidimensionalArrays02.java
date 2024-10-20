package academy.devdojo.javaoneforall.introduction;

public class Class08MultidimensionalArrays02 {
    public static void main(String[] args) {
        int[][] array = new int [3][];
        int[] numbers = {1, 2, 3};

        array[0] = new int[]{1, 2};
        array[1] = numbers;
        array[2] = new int[]{1, 2, 3, 4, 5 ,6};
        for (int[] numberArray: array) {
            System.out.println("\n-------------");
            for(int number: numberArray) {
                System.out.print(number + " ");
            }
        }

        int[][] baseArray = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4, 5 ,6}};
        for (int[] numberArray: baseArray) {
            System.out.println("\n-------------");
            for(int number: numberArray) {
                System.out.print(number + " ");
            }
        }
    }
}
