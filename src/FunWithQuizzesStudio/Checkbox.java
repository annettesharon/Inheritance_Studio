package FunWithQuizzesStudio;

import java.util.List;

public class Checkbox extends Question {

    public Checkbox(String question, String answer) {
        super(question, answer);
    }

    public boolean checkAnswer(String answer) {
        if (answer.toLowerCase().equals(this.getAnswer().toLowerCase())) {
            return true;
        }   else {
            return false;
        }
    }

}