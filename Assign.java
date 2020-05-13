import java.util.*;
import java.lang.*;

public class Assign{
    public static void main(String[] arg) throws Exception{
        
        Scanner input = new Scanner(System.in);

        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Who is president of india", "Donald Trump", "Ramnath Kovind", "Narendra Modi", "None", "Ramnath Kovind"));
        questions.add(new Question("Will the lockdown open?", "Yes", "No", "Maybe", "Maybe Not", "No"));
        questions.add(new Question("Is haskell a functional programming language?", "Yes", "No", "Maybe", "Maybe Not", "Yes"));
        questions.add(new Question("Is java a functional programming language?", "Yes", "No", "Maybe", "Maybe Not", "No"));

        for(Question question: questions){
            Thread thread = new Thread(new TimerHandler());
            question.query();
            thread.start();
            String ans = input.nextLine();

            if(question.validate(ans)){
                System.out.println("Correct answer!!");
                thread.interrupt();
            }
            else{
                System.out.println("Sorry wrong answer!");
                System.exit(0);
            }

            thread.interrupt();
        }
        
        System.out.println("Congrats, you have passed!");
        System.exit(0);
    }
}