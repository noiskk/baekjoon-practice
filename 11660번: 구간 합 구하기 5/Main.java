/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11660                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11660                          #+#        #+#      #+#    */
/*   Solved: 2025/07/25 13:21:40 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    long[][] prefixSum = new long[N + 1][N + 1];

    for (int i = 1; i <= N; i++) {
      st = new StringTokenizer(br.readLine());

      for (int j = 1; j <= N; j++) {
        int num = Integer.parseInt(st.nextToken());
        prefixSum[i][j] = prefixSum[i - 1][j] 
                        + prefixSum[i][j - 1]
                        - prefixSum[i - 1][j - 1]
                        + num;
      }
    }

    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());

      long answer = prefixSum[x2][y2]
                  - prefixSum[x1 - 1][y2]
                  - prefixSum[x2][y1 - 1]
                  + prefixSum[x1 - 1][y1 - 1];

      System.out.println(answer);
    }





  }
}