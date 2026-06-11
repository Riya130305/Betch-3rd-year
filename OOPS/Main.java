class User {
    // Encapsulation
    private string name;
    private int solvedQuestions;

    public void setName(string name){
        name=this.name;
    }
    public string getName(string name){
        return name;
    }
     public int getSolvedQuestions() {
        return solvedQuestions;
    }

    public void solveQuestion() {
        solvedQuestions++;
    }

}
public class Main {

    public static void main(String[] args) {

        User user = new User();

        user.setName("Riya");

        user.solveQuestion();
        user.solveQuestion();
        user.solveQuestion();

        System.out.println(user.getName());
        System.out.println(user.getSolvedQuestions());
    }
}
