package advanced.classes.day_44.assignment.rough_work;
/**
 * Please revise this problem again before any interview !!!
 */
public class RainWaterTrapped {
    public static void main(String[] args) {
        int array[] = {0,1,0,2};

        int volumeOfWaterTrapped = trap(array);
        System.out.println(volumeOfWaterTrapped);
    }

    private static int trap(int[] array) {
        int leftMaxArray[] = findLeftSideBuildings(array); // ----- >  [0,1,1,2]
        int rightMaxArray[] = findRightSideBuildings(array); //       [2,2,2,2] <------
        int volume = 0;
        for (int index = 0; index < array.length; index++) {
            volume += Math.min(rightMaxArray[index], leftMaxArray[index]) - array[index];
        }
        return volume;
    }

    private static int[] findLeftSideBuildings(int[] array) {
        int leftMaxArray[] = new int[array.length];
        int leftMaxElement = Integer.MIN_VALUE;
        for (int nextIndex = 0; nextIndex < array.length ; nextIndex++) {
            if (array[nextIndex] >= leftMaxElement) {
                leftMaxElement = array[nextIndex];
            }
            leftMaxArray[nextIndex] = leftMaxElement;
        }
        return leftMaxArray;
    }

    private static int[] findRightSideBuildings(int[] array) {
        int rightMaxArray[] = new int[array.length];
        int rightMaxElement = Integer.MIN_VALUE;
        for (int prevIndex = array.length-1 ; prevIndex >= 0 ; prevIndex--) {
            if (array[prevIndex] > rightMaxElement) {
                rightMaxElement = array[prevIndex];
            }
            rightMaxArray[prevIndex] = rightMaxElement;
        }
        return rightMaxArray;
    }
}
