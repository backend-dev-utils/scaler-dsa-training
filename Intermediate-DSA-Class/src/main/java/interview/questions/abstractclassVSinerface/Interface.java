package interview.questions.abstractclassVSinerface;

import java.util.StringJoiner;

public interface Interface{

    public String firstName();

    public String lastName();

    public String emailId();

    default String fullName(String firstName, String lastName){
        return new StringJoiner(firstName).add(lastName).toString();
    }
}
