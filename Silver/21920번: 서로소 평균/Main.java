/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 21920                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/21920                          #+#        #+#      #+#    */
/*   Solved: 2025/07/06 21:17:45 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] A = new long[N];

    for(int i = 0; i < N; i++){
      A[i] = sc.nextLong();
    }

    long X = sc.nextLong();

    long sum = 0L, count = 0L;

    for (int i = 0; i < N; i++) {
      if(gcd(A[i], X) == 1){
        sum += A[i];
        count++;
      }
    }

    if(count == 0){
      System.out.println(0);
    } else {
      System.out.println((double)sum / count);
    }


  }

  public static long gcd(long a, long b){
    return b == 0 ? a : gcd (b, a % b);
  }

}