import java.util.*;

class Question{

    private String question;
    private String opt1, opt2, opt3, opt4;
    private String answer;

    public Question(String question, String opt1, String opt2, String opt3, String opt4, String answer){
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.answer = answer;
    }

    public boolean validate(String ans){
        return ans.equals(this.answer);
    }

    public void query(){
        System.out.println(question);
        List<String> options = new ArrayList<String>(Arrays.asList(this.opt1, this.opt2, this.opt3, this.opt4));
        options.stream().forEach(arg -> System.out.println(arg));
    }

 

}
