
public class Program {

    public static void main(String[] args) {

        // Test your method here
        int rows = 2;
        int columns = 3;
//        int[][] matrix = new int[rows][columns];
        int[][] matrix = {
            {1},
            {2, 2},
            {3, 3, 3},
            {4, 4, 4, 4}
        };
        System.out.println(arrayAsString(matrix));
    }

    public static String arrayAsString(int[][] array) {
        String tempString = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                tempString += String.valueOf(array[i][j]);
            }
            tempString += "\n";
        }
        return tempString;
    }
}
