//Owen Lovett
//CS1400
//Assignment 4
//11/4/2021

public class Question
{
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private int correct;

    public Question(String q, String a1, String a2, String a3, String a4, int c)
    {
        question = q;
        answer1 = a1;
        answer2 = a2;
        answer3 = a3;
        answer4 = a4;
        correct = c;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

}
