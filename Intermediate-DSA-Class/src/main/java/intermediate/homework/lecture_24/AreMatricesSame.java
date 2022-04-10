package intermediate.homework.lecture_24;

public class AreMatricesSame {
    public static void main(String[] args) {
        int firstArray[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int secondArray[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int isSameMatrices = matricesAreSame(firstArray, secondArray);
        System.out.println("Both Matrices are : "+isSameMatrices);
    }

    private static int matricesAreSame(int[][] firstArray, int[][] secondArray) {
        for (int rows = 0; rows < firstArray.length; rows++) {
            for (int columns = 0; columns < firstArray[rows].length; columns++) {
                if(firstArray[rows][columns] != secondArray[rows][columns])
                    return 0;
            }
        }
        return 1;
    }
}
