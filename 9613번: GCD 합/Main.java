/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 9613                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/9613                           #+#        #+#      #+#    */
/*   Solved: 2025/07/06 21:32:45 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // 테스트 케이스
    int T = sc.nextInt();
    for (int i = 0; i < T; i++) {

      // 수의 개수
      int N = sc.nextInt();
      Long[] arr = new Long[N];

      // 수 입력 받기
      for(int j = 0; j < N; j++){
        arr[j] = sc.nextLong();
      }

      long sum = 0;

      for(int j = 0; j < N - 1; j++){
        for(int k = j + 1; k < N; k++){
          sum += gcd(arr[j], arr[k]);
        }
      }
      
      System.out.println(sum);

    }
  }

  public static long gcd(long a, long b){
    return b == 0 ? a : gcd(b, a % b);
  }
}