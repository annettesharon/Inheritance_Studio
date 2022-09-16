package FunWithQuizzesStudio;

public class LinearScale extends Question {

    private int lowNumber;
    private int highNumber;

    public LinearScale(String question, int lowNumber, int highNumber) {
        super(question, null);
        this.lowNumber = lowNumber;
        this.highNumber = highNumber;
    }

    public boolean checkAnswer(String answer) {
        int answerInt = Integer.parseInt(answer);
        if (answerInt >= lowNumber && answerInt <= highNumber) {
            return true;
        } else {
            return false;
        }
    }

    public int getLowNumber() {
        return lowNumber;
    }

    public void setLowNumber(int lowNumber) {
        this.lowNumber = lowNumber;
    }

    public int getHighNumber() {
        return highNumber;
    }

    public void setHighNumber(int highNumber) {
        this.highNumber = highNumber;
    }
}