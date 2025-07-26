public class Factorial {
    public static void main(String[] args){
        int n;
        int i;
        // loop for 1 to 4
        for(n = 1; n <= 4; n++)
        {
            int fact = 1;
            // calculate factorial of current n
            for(i = 1; i <= n; i++)
            {
                fact *= i; // fact = fact * i
            }
            // print the factorial
            System.out.println("Factorial of " + n + " = " + fact);
        }
    }
}
