import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Ball");
        list.add("Cat");
        list.add("Delhi");
        list.add("Egypt");

        System.out.println(list);
        for (String str : list){
            if (str.equals("Delhi")){
                list.remove("Delhi");
            }
        }
        System.out.println(list);
    }
}