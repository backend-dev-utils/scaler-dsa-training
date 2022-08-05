package advanced.classes.day_53.lecture;

/**
 * Find count of Indian currency notes of given input...
 */
public class IndianCurrenciesNotes {
    public static void main(String[] args) {
        System.out.println(new IndianCurrenciesNotes().countNotes(276));
    }

    private int countNotes(int amount) {
        if(amount == 0)
            return 0;
        else {
            int notes = findNotes(amount);
            return amount/notes + countNotes(amount%notes);
        }
    }

    private int findNotes(int amount) {
        int array[] = {1,2,5,10,20,50,100,200,500,2000};

        for (int i = array.length-1 ; i >= 0 ; i--) {
            if (amount >= array[i])
                return array[i];
        }
        return 0;
    }
}
