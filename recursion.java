import java.util.ArrayList;

public class Recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      double guest = 1;
      if (n == 0) {
        return 0;
      }
      return sqrts(n,tolerance,guest);
    }

    public static double guesser(double n, double g){
      return (n / g + g) / 2;
    }

    public static double sqrts(double n, double tolerance, double guess) {
      if ((((guess * guess - n) / n) > -tolerance) && (((guess * guess - n) / n) < tolerance)){
        return guess;
      }
      else {
        return sqrts (n, tolerance, guesser(n,guess));
      }
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      return fibtimer(0,1,n);
    }

    public static int fibtimer(int backtwo, int backone, int more){
      if (more == 0) {
        return backtwo;
      }
      return fibtimer(backone,backone+backtwo,more-1);
    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> sums = new ArrayList<Integer>();
      mS(n,0, sums);
      return sums;
    }

    public static void mS(int n, int sum, ArrayList<Integer> sums) {
      if (n == 0 && !sums.contains(sum)) {
        sums.add(sum);
      }
      else {
        mS(n-1,sum+n,sums);
        mS(n-1,sum,sums);
      }

    }
    //Courtesy of class group list
    public static void main(String[] args) {
            System.out.println("sqrt()");
            System.out.println("-----------------------\n");

            System.out.println("sqrt(4, 0.00001)");
            System.out.println("EXPECTED: 2");
            System.out.println(sqrt(4, 0.00001));         // 2

            System.out.println("----");

            System.out.println("sqrt(8, 0.00001)");
            System.out.println("EXPECTED: ~2.8284");
            System.out.println(sqrt(8, 0.00001));         // ~2.8284

            System.out.println("----");

            System.out.println("sqrt(0, 0.00001)");
            System.out.println("EXPECTED: 0");
            System.out.println(sqrt(0, 0.00001));         // 0

            System.out.println("\n");

            System.out.println("fib()");
            System.out.println("-----------------------\n");

            System.out.println("fib(0)");
            System.out.println("EXPECTED: 0");
            System.out.println(fib(0));                   // 0

            System.out.println("----");

            System.out.println("fib(1)");
            System.out.println("EXPECTED: 1");
            System.out.println(fib(1));                   // 1

            System.out.println("----");

            System.out.println("fib(7)");
            System.out.println("EXPECTED: 13");
            System.out.println(fib(7));                   // 13

            System.out.println("makeAllSums()");
            System.out.println("-----------------------\n");

            System.out.println("makeAllSums(0)");
            System.out.println("EXPECTED: [0]");
            System.out.println(makeAllSums(0));           // [0]

            System.out.println("----");

            System.out.println("makeAllSums(1)");
            System.out.println("EXPECTED: [1, 0]");
            System.out.println(makeAllSums(1));           // [1, 0]

            System.out.println("----");

            System.out.println("makeAllSums(3)");
            System.out.println("EXPECTED: [0, 3, 2, 5, 1, 4, 3, 6]");
            System.out.println(makeAllSums(3));           // [0, 3, 2, 5, 1, 4, 3, 6]

    }

}
