import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @name Question.java
 * @author Edwin Rozeski
 * Question is a class that holds a question and answer and a method to check if
 * a response is correct.
 *
 */

public class Question extends Object{
    private String question;
    private String answer;

    public Question(String q, String a){
        this.question = q;
        this.answer = a;
    }


    public String getQuestion() {
        return question;
    }

    public boolean checkAnswer(String a){
        return (a.equals(answer));
    }




}