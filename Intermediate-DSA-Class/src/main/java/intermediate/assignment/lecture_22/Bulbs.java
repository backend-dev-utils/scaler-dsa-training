package intermediate.assignment.lecture_22;

import java.util.Arrays;

public class Bulbs {
    public static void main(String[] args) {
        int array[] = {0, 0, 1, 1, 1, 0};

        int minimumTimesToPressTheSwitch = choriKiyaHuaApproach(array);//switchOnAllTheBulbs(array);
        System.out.println(minimumTimesToPressTheSwitch);
    }

    /**
     * Let's figure out the logic behind the code
     * @param array
     * @return
     */
    private static int choriKiyaHuaApproach(int[] array) {
        int count = 0;
        for (int index = 0; index < array.length; index++) {
            if((count == 0 || count % 2 == 0) && array[index] == 0)
                count++;
            else if (count % 2 != 0 && array[index] == 1)
                count++;
        }
        return count;
    }

    private static int switchOnAllTheBulbs(int[] array) {
        int count = 0;
        for (int index = 0; index < array.length; index++) {
            int bulbOn = 1, bulbOff = 0;
            if(array[index] == bulbOn){
                continue;
            }else {
                array[index] = bulbOn;
                for (int pressSwitch = index + 1; pressSwitch < array.length ; pressSwitch++) {
                    if (array[pressSwitch] == bulbOn)
                        array[pressSwitch] = bulbOff;
                    else if (array[pressSwitch] == bulbOff)
                        array[pressSwitch] = bulbOn;
                }
                count++;
            }
            System.out.println(Arrays.toString(array));
        }
        return count;
    }
}
