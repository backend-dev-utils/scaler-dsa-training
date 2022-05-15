

public class MainApplication {
    public static void main(String[] args) {
        boolean check = validateIP("12.34.5.6");
        System.out.println(check);
    }
    static boolean validateIP(String ip) {
        // your code goes here

        String array[] = ip.split("\\.");
        if( array.length != 4)
            return false;
        for(int index = 0; index < array.length; index++){
            try{

                int element = Integer.valueOf(array[index]);

                System.out.println(element);
                if(element > 255 || element < 0)
                    return false;
            }catch(NumberFormatException nfe){
                return false;
            }
        }
        return true;
    }
}
