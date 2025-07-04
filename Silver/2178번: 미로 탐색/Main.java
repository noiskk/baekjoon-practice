/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2178                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2178                           #+#        #+#      #+#    */
/*   Solved: 2025/06/24 13:19:30 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main{

  static int[] dx = {0, 1, 0, -1};
  static int[] dy = {1, 0, -1, 0};

  static int[][] A;
  static boolean[][] visited;

  static int N;
  static int M;

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    A = new int[N][M];
    visited = new boolean[N][M];

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      String line = st.nextToken();
      for (int j = 0; j < M; j++) {
        A[i][j] = Integer.parseInt(line.substring(j, j + 1));
      }   
    }

    BFS(0, 0);
    System.out.println(A[N - 1][M - 1]);

  }

  private static void BFS(int i, int j){
    // 상하좌우 보기
    // 0이거나 이미 방문한 노드면 안가도됨. 
    // 이동하고 나면 해당 칸의 값++

    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[]{i, j});

    while(!queue.isEmpty()){
      int now[] = queue.poll();
      visited[i][j] = true;
      for(int k = 0; k < 4; k++){
        int x = now[0] + dx[k];
        int y = now[1] + dy[k];
        if(x >= 0 && y >= 0 && x < N && y < M){
          if(A[x][y] != 0 && !visited[x][y]){
            visited[x][y] = true;
            A[x][y] = A[now[0]][now[1]] + 1;
            queue.add(new int[]{x, y});
          }
        }
      }
    }

  }
}