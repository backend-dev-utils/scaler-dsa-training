package intermediate.homework.lecture_20;

public class MinimumPicks {
    public static void main(String[] args) {
        int array[] = {-15, -45, 43, 23, -63, 69, 35, 19, 37, -52};

        System.out.println(minimumPicks(array));
    }

    private static int minimumPicks(int array[]){
        int maxEven = Integer.MIN_VALUE;
        int minOdd = Integer.MAX_VALUE;

        if(array.length == 1) return array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                if(array[i] > maxEven)
                    maxEven = array[i];
            }else{
                if (array[i] < minOdd)
                    minOdd = array[i];
            }
        }
        return maxEven - minOdd;
    }
}
