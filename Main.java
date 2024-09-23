public class Main
{
  public static void main(String[] args)
  {
    // test your functions here to make sure they work

    // testing distance formula
    double result = distance(0, 5, 0, 0);
    System.out.println("Distance: " + result);

    //testing quadratic positive solution
    double a1 = 1, b1 = -3, c1 = 2;
    double posRoot = posq(a1, b1, c1);
    System.out.println("Positive root:" + posRoot);

    //testing quadratic negative solution
    double a2 = 1, b2 = -3, c2 = 2; //don't need to type again if keep all in main
    double negRoot = negq(a2, b2, c2);
    System.out.println("Negative root: " + negRoot);
  }

  // Implement distance formula method here
  public static double distance(int x1, int y1, int x2, int y2) {
    int fx = x2 - x1;
    int fy = y2 - y1;
    return Math.sprt(fx * fy + fy + fy);
  }

  // implement one of your quadratic formula methods here
  public static double posq(double a, double b, double c) {
    double disc = Math.sqrt(b * b - 4 * a * c);
    return (-b - disc) / (2 * a);
  }

  // implement the other quadratic formula here
  public static double negq(double a, double b, double c) {
    double disc = Math.sqrt(b * b - 4 * a * c);
    return (-b + disc) / (2 * a);
  }
}
