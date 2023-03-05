package intermediate.homework.lecture_20;

public class LittlePonyMaxElement {
    public static void main(String[] args) {
        int array[] = {1,4,2};
        int keyElement = 3;

        System.out.println(findLittlePonyMaxElement(array, keyElement));
    }

    private static int findLittlePonyMaxElement(int[] array, int keyElement) {
        int count = 0;
        boolean search = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == keyElement) {
                search = true;
            }
            if(array[i] > keyElement){
                count++;
            }
        }

        if(search) return count ;
        else return -1;
    }
}
