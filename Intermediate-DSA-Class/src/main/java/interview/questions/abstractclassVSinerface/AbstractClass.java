package interview.questions.abstractclassVSinerface;

import java.util.StringJoiner;

public abstract class AbstractClass implements Interface{

    @Override
    public String lastName() {
        return "";
    }

    public String fullName(String firstName, String lastName){
        return new StringJoiner(lastName).add(firstName).toString();
    }

}
