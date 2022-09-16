package FunWithQuizzesStudio;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions = new ArrayList<Question>();
    private int Score = 0;
    private Scanner scanner = new Scanner(System.in);

    public Quiz() {
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    private String getInputAnswers() {
        String inputAnswer = scanner.nextLine();
        return inputAnswer;
    }

    public void runQuiz() {
        for (Question question : questions) {
            System.out.println(question.getQuestion());
            boolean questionCorrect = question.checkAnswer(getInputAnswers());
            if (questionCorrect) {
                this.Score++;
            }
        }
        double percentCorrect = ((double) this.Score / (double) this.questions.size()) * 100;
        System.out.println("User's Grade: " + percentCorrect + "%");

    }
}
