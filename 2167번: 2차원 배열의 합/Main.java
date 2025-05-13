/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2167                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2167                           #+#        #+#      #+#    */
/*   Solved: 2025/07/24 14:31:45 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();

    int[][] arr = new int[N][M];

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        arr[i][j] = sc.nextInt();   
      }
    }

    int K = sc.nextInt();

    for (int k = 0; k < K; k++) {
      int i = sc.nextInt();
      int j = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      int total = 0;

      for(int row = i - 1; row < x; row++){
        for(int col = j - 1; col < y; col++){
          total += arr[row][col];
        }
      }

      System.out.println(total);
    }


  }
}