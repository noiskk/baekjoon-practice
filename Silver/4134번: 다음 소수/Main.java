
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for(int i = 0; i < T; i++){
      long n = sc.nextLong();
      
      while(true){
        if(isPrime(n)) {
          System.out.println(n);
          break;
        }
        n++;
      }
      
    }
  }

  public static boolean isPrime(long n){
    
    if(n <= 1){
      return false;
    }
    if(n == 2){
      return true;
    }
    if(n % 2 == 0){
      return false;
    }
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
      if(n % i == 0){
        return false;
      }
    }
    return true;
  }
}