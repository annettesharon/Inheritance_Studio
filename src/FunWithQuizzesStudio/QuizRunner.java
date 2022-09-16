package FunWithQuizzesStudio;

public class QuizRunner {

    public static void main(String[] args) {
        Quiz newQuiz = new Quiz();

        MultipleChoice myMultiChoiceQuestion = new MultipleChoice("Who was the first woman in space?" +
                "\nA: Sally Ride\nB: Mother Theresa\nC: Hillary Clinton", "A");
        newQuiz.addQuestion(myMultiChoiceQuestion);

        Checkbox myCheckBoxQuestion = new Checkbox("Which animals are real? Select all that apply.\nA: Cats\nB: Unicorns\nC: Centaur\nD: Mouse", "A, D");
        newQuiz.addQuestion(myCheckBoxQuestion);

        TrueOrFalse myTrueFalseQuestion = new TrueOrFalse("Coding is fun?  \n True or False?", "True");
        newQuiz.addQuestion(myTrueFalseQuestion );

        ShortAnswer myShortAnswer = new ShortAnswer("Who was the first US President?", "George Washington");
        newQuiz.addQuestion(myShortAnswer);

        LinearScale myLinearScale = new LinearScale("On a scale of 0-10 how hard was this Studio?", 0, 10);
        newQuiz.addQuestion(myLinearScale);

        Paragraph myParagraph = new Paragraph("Tell me about a time you made a mistake and what you learned from it?", "anything less than 500 characters");
        newQuiz.addQuestion(myParagraph);

        newQuiz.runQuiz();
    }
}
