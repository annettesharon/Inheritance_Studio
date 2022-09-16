package FunWithQuizzesStudio;

public class Paragraph extends Question {

    public Paragraph(String question, String answer) {
        super(question, answer);
    }

    public boolean checkAnswer(String answer) {
        if (answer.length() > 500) {
            System.out.println("Answer can't be longer than 500 characters");
            return false;
        } else {
            return true;
        }
    }
}
