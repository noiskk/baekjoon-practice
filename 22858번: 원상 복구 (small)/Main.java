/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 22858                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/22858                          #+#        #+#      #+#    */
/*   Solved: 2025/07/21 11:56:32 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken()); // 카드 개수
    int K = Integer.parseInt(st.nextToken()); // 카드를 섞은 횟수

    int[] S = new int[N]; // 카드 섞은 후 배치
    int[] D = new int[N]; // 셔플 정보
    int[] P = new int[N]; // 초기 배치

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      S[i] = Integer.parseInt(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      D[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < K; i++) {
      for (int j = 0; j < N; j++) {
        P[D[j] - 1] = S[j];    
      }

      S = Arrays.copyOf(P, N);
    }

    for (int i = 0; i < N; i++) {
      System.out.print(P[i] + " ");
    }

  }
}