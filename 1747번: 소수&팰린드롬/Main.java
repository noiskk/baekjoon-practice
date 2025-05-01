/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1747                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1747                           #+#        #+#      #+#    */
/*   Solved: 2025/07/09 12:02:12 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

// 1. 소수인지 판별
// 2. 팰린드롬인지 판별 -> str reverse 할까? 아니면 int[] 이용??

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    while(!(isPrime(num) && isPalin(num))){
      num++;
    }

    System.out.println(num);

  }

  public static boolean isPrime(int n){
    if(n < 2) return false;
    if(n == 2) return true;
    if(n % 2 == 0) return false;

    for(int i = 3; i <= Math.sqrt(n); i += 2){
      if(n % i == 0) return false;
    }

    return true;
  }

  public static boolean isPalin(int n){
    String str= Integer.toString(n);
    String reverse = new StringBuilder(str).reverse().toString();
    
    if(str.equals(reverse)) return true;
    else return false;    
  }
}

