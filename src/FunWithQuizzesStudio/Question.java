package FunWithQuizzesStudio;

public abstract class Question {
    private String Question;
    private String Answer;


    public Question(String question, String answer) {
        Question = question;
        Answer = answer;
    }

    public abstract boolean checkAnswer(String answer); //{
//        Answer = answer;
//        if (answer.toLowerCase().equals(this.getAnswer().toLowerCase())) {
//            return true;
//        }   else {
//            return false;
//        }
//    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }
}