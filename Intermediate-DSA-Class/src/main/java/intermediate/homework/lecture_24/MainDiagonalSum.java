package intermediate.homework.lecture_24;

public class MainDiagonalSum {
    public static void main(String[] args) {
        int array[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int mainDiagonalSum = findMainDiagonalSum(array);
        System.out.println("Main Diagonal Sum : "+mainDiagonalSum);
    }

    private static int findMainDiagonalSum(int[][] array) {
        int sum = 0;
        for (int rows = 0; rows < array.length; rows++) {
            for (int columns = 0; columns < array[0].length; columns++) {
                if (rows == columns)
                    sum += array[rows][columns];
            }
        }
        return sum;
    }
}
