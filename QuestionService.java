import java.util.Scanner;

public class QuestionService {
  Questions[] questions = new Questions[5];
  String selection[] = new String[5];

  public QuestionService() {
    questions[0] = new Questions(1,
        "What is the size of int in Java?",
        "2 bytes", "4 bytes", "8 bytes", "Depends on OS",
        "4 bytes");

    questions[1] = new Questions(2,
        "Which keyword is used to inherit a class in Java?",
        "this", "super", "extends", "implements",
        "extends");

    questions[2] = new Questions(3,
        "Which of these is NOT a Java primitive type?",
        "int", "boolean", "String", "double",
        "String");

    questions[3] = new Questions(4,
        "Which method is the entry point of a Java program?",
        "start()", "main()", "run()", "execute()",
        "main()");

    questions[4] = new Questions(5,
        "Which keyword is used to create an object in Java?",
        "class", "new", "object", "create",
        "new");
  }

  public void playQuiz() {
    int i = 0;
    for (Questions q : questions) {
      System.out.println(q.getId());
      System.out.println(q.getQuestion());
      System.out.println(q.getOpt1());
      System.out.println(q.getOpt2());
      System.out.println(q.getOpt3());
      System.out.println(q.getOpt4());
      Scanner sc = new Scanner(System.in);
      selection[i++] = sc.nextLine();
      System.out.println(q.getAnswer());
      System.out.println();
    }

    for (String s : selection) {
      System.out.println(s);
    }

  }

  public void printScore() {

    int score = 0;
    for (int i = 0; i < questions.length; i++) {
      Questions que = questions[i];

      String actualAns = que.getAnswer();
      String userAns = selection[i];

      if (actualAns.equals(userAns)) {
        score++;
      }
    }

    System.out.println("Your Score is : " + score);
  }
}
