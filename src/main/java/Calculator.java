public class Calculator {
  public int evaluate(String expression) {
    int sum = 0;
    for (String summand: expression.split("\\+"))
		/*Syste.out.println("rajaseKH");*/
      sum += Integer.valueOf(summand);
      System.out.println(sum);

    return sum;
  }
}
