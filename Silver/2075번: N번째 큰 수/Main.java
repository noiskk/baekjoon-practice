/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2075                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2075                           #+#        #+#      #+#    */
/*   Solved: 2025/07/02 11:20:14 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException{
    
    /*
     * 1 <= N <= 1500
     * 시간 제한 1초 : 100,000,000
     * N^2 가능, N^3 불가능
     */

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    

    int[][] board = new int[N][N];
    for(int i = 0; i < N; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      for (int j = 0; j < N; j++) {
        board[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    
    // 최대 힙: b[0] - a[0] -> 내림차순 정렬
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);

    // 맨 아랫줄을 [값, 행, 열] 형태로 저장
    for (int j = 0; j < N; j++) {
      pq.add(new int[]{board[N - 1][j], N - 1, j});
    }

    // pq 는 항상 사이즈 5 유지

    // 한 칸 위의 값도 하나씩 확인
    for (int i = 0; i < N - 1; i++) {
      int[] current = pq.poll(); // 현재 가장 큰 수
      int row = current[1];
      int col = current[2];

      // 해당 수의 윗 칸을 큐 추가 (그 다음으로 큰 수)
      if (row > 0) {
          pq.add(new int[]{board[row - 1][col], row - 1, col});
      }
    }
  
    System.out.println(pq.peek()[0]);

  
  }
}