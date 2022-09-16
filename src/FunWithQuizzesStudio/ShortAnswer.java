package FunWithQuizzesStudio;

public class ShortAnswer extends Question {

    public ShortAnswer(String question, String answer) {
        super(question, answer);
    }

    public boolean checkAnswer(String answer) {
        if (answer.length() > 80) {
            System.out.println("Answer is too long. No more than 80 characters");
            return false;
        }
        if (answer.toLowerCase().equals(this.getAnswer().toLowerCase())) {
            return true;
        }   else {
            return false;
        }
    }
}