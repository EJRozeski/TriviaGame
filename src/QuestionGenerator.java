import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionGenerator {
    public static ArrayList<Question> createFromFile(String filename){
        Scanner sc;
        try {
            sc = new Scanner(new File(filename));
        }
        catch (FileNotFoundException e){
            return new ArrayList<Question>();
        }
        ArrayList<Question> questions = new ArrayList<Question>();
        Question q;
        while(sc.hasNext()){
            q = new Question(sc.nextLine(),sc.nextLine());
            questions.add(q);
        }
        return questions;
    }
    public static void main(String[] args) {
        ArrayList<Question> questions = createFromFile(args[0]);
        for(Question q : questions){
            System.out.println(q.getQuestion());
        }
    }
}
