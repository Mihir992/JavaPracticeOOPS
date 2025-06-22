public class FactorialPrg {
    public static void main(String[] args) {
        int n=5,fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        // Output the result
        System.out.println("The factorial of " + n + " is: " + fact);
    }
}
