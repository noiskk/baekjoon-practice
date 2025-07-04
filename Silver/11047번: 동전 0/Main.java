/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11047                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11047                          #+#        #+#      #+#    */
/*   Solved: 2025/06/24 16:27:01 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    int[] A = new int[N];

    for(int i = 0; i < N; i++) {
      A[i] = sc.nextInt();  
    }

    int result = 0;

    for(int i = N - 1; i >= 0; i--){
      if(A[i] <= K){
        result += K / A[i];
        K %= A[i];
      }
    }

    System.out.print(result);
  }
}