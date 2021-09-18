import java.util.*;

public class Question {

    int qid;
    String question;
    List<String> answerList = new ArrayList<>();
    Set<String> answerSet= new HashSet<>();
    Map<Integer,String> answerMap = new HashMap<>();

    public void setAnswerList(List<String> answerList) {
        this.answerList = answerList;
    }

    public void setAnswerSet(Set<String> answerSet) {
        this.answerSet = answerSet;
    }

    public void setAnswerMap(Map<Integer, String> answerMap) {
        this.answerMap = answerMap;
    }

    public Question(int qid, String question) {
        this.qid = qid;
        this.question = question;
    }

    public Question(int qid, String question, Set<String> answerSet) {
        this.qid = qid;
        this.question = question;
        this.answerSet = answerSet;
    }

    public Question(int qid, String question, Map<Integer, String> answerMap) {
        this.qid = qid;
        this.question = question;
        this.answerMap = answerMap;
    }

    public void display(){
        System.out.println("Question id: "+this.qid+"\nquestion: "+this.question+"\nanswers:"+this.answerSet);
        //this.answerSet.forEach(System.out::println);
    }
}
