package intermediate.homework.lecture_24;

public class MinorDiagonalSum {
    public static void main(String[] args) {
        int array[][] = {{1,-2,-3},{-4,5,-6},{-7,-8,9}};

        int mainDiagonalSum = findMinorDiagonalSum(array);
        System.out.println("Minor Diagonal Sum : "+mainDiagonalSum);
    }

    private static int findMinorDiagonalSum(int[][] array) {
        int sum = 0, lastIndex = array[0].length - 1;
        for (int rows = 0; rows < array.length; rows++) {
            for (int columns = 0; columns < array[0].length; columns++) {
                if (lastIndex == columns){
                    sum += array[rows][columns];
                    lastIndex--;
                }
            }
        }
        return sum;
    }
}
