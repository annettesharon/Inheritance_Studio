package FunWithQuizzesStudio;

import java.util.List;

public class MultipleChoice extends Question {

    public MultipleChoice(String question, String answer) {
        super(question, answer);
    }

    public boolean checkAnswer(String answer) {
//        super(answer);
        if (answer.toLowerCase().equals(this.getAnswer().toLowerCase())) {
            return true;
        }   else {
            return false;
        }
    }

}
