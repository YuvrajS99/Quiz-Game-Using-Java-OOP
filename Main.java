public class Main {
  public static void main(String[] args) {

    QuestionService service = new QuestionService();
    System.out.println();
    service.playQuiz();
    service.printScore();
    System.out.println();
  }
}
