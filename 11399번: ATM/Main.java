/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11399                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11399                          #+#        #+#      #+#    */
/*   Solved: 2025/06/22 17:16:44 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args){
    // 삽입 정렬로 구현해보기

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] P = new int[N];

    for(int i = 0; i < N; i++){
      P[i] = sc.nextInt();
    }

    for (int i = 1; i < N; i++) {
      int key = P[i];
      int j = i - 1;

      while(j >= 0 && P[j] > key){
        P[j + 1] = P[j];
        j--;
      }

      P[j + 1] = key;
    }

    int result = 0;

    for (int i = 0; i < N; i++) {
      result += P[i] * (N - i);   
    }

    System.out.println(result);

  }
}