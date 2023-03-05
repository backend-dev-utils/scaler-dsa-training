package beginner.homework.lecture_13;

public class RowsColumnSum {
    public static void main(String[] args) {
        int array[][] = {{1,2},{4,5},{8,9}};

        int result[] = solve(array);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }

    private static int[] solve(int[][] array) {
        int result[] = new int[array.length + array[0].length];
        int index = 0;
        for (int rows = 0; rows < array.length; rows++) {
            int sum = 0;
            for (int columns = 0; columns < array[rows].length; columns++) {
                sum = sum + array[rows][columns];
            }
            result[index] = sum;
            index++;
        }
        for (int rows = 0; rows < array[0].length; rows++) {
            int sum = 0;
            for (int columns = 0; columns < array.length; columns++) {
                sum = sum + array[columns][rows];
            }
            result[index] = sum;
            index++;
        }
        return result;
    }
}
/*
Input :
A = [[1, 2],[4, 5],[8, 9]]

Output:
[3, 9, 17, 13, 16]
 */