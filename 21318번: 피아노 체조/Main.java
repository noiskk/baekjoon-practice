/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 21318                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/21318                          #+#        #+#      #+#    */
/*   Solved: 2025/07/25 14:46:39 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    int[] prefixSum = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());

    int prev = Integer.parseInt(st.nextToken()); // 이전 곡

    for (int i = 1; i < N; i++) {
      int cur = Integer.parseInt(st.nextToken()); // 현재 곡
      if(prev > cur){ // 이전 곡이 더 어렵다면
        prefixSum[i] = prefixSum[i - 1] + 1;
      } else {
        prefixSum[i] = prefixSum[i - 1];
      }
      prev = cur;
    }

    int Q = Integer.parseInt(br.readLine());

    for (int i = 0; i < Q; i++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken()); 
      int y = Integer.parseInt(st.nextToken()); 
      System.out.println(prefixSum[y - 1] - prefixSum[x - 1]);
    }
  }
}