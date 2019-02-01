import java.util.ArrayList;

public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){

    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){

    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
      return mS(n,0);
    }

    public static ArrayList<Integer> mS(int n, int sum) {
      ArrayList<Integer> sums = new ArrayList<Integer>();
      if (n == 0) {
        sums.add(sum);
      }

    }

}
