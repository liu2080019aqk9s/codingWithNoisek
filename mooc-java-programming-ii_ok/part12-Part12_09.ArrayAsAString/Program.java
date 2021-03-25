
public class Program {

    public static void main(String[] args) {
        // Test your method here
//        int[][] matrix = {
//            {3, 2, 7, 6},
//            {2, 4, 1, 0},
//            {3, 2, 1, 0}
//        };
//
//        System.out.println(arrayAsString(matrix));
        int number = (0 + 4) % 5;
        System.out.println(number);
        for (int i = 0; i < 10; i++) {
           number = (number + 4) % 5;
           System.out.println(number);
        }
    }
    
    public static String arrayAsString(int[][] array) {
        StringBuilder matrix = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                matrix.append(array[i][j]);
            }
            matrix.append("\n");
        }
        return matrix.toString();
    }
}
