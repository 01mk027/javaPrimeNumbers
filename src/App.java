public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 100; i++) {
            if(i == 1) continue; //Because every number is divisible with 1 and this is uneffective for detecting prime number.
            boolean isPrime = true; //Initially set to true, if indice of outer loop is divisible with indice of inner loop, would be changed to false
            for (int j = 1; j <= 100; j++) {
                if(j==1 || i == j) //As specified above 1 is useless for this case and self-divisibility is not used for detecting prime numbers.
                    continue;
                if(i % j == 0)
                {
                    isPrime = false;
                }
            }
            if(isPrime) System.out.print(i + " ");
        }
    }
}
