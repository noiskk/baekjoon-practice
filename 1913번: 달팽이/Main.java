/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1913                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1913                           #+#        #+#      #+#    */
/*   Solved: 2025/07/12 12:42:12 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */


import java.util.*;

public class Main{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    int N = sc.nextInt();
    int M = sc.nextInt();

    int[][] map = new int[N][N];

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    int x = N / 2, y = N / 2;

    int num = 1;
    int len = 1;
    int dir = 0;
    int targetX = 0, targetY = 0;
    
    OUTER:
    while(true){
      for (int i = 0; i < 2; i++) {
        for (int j = 0; j < len; j++) {
          map[x][y] = num;

          if(num == M) {
            targetX = x + 1;
            targetY = y + 1;
          }

          if(num == N * N) break OUTER;

          num++;
          x += dx[dir];
          y += dy[dir];
        }

        dir = (dir + 1) % 4;
          
      }

      len++;
    }

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        sb.append(map[i][j]);
        
        if (j < N - 1) {
          sb.append(" ");
        }
      }
      sb.append("\n");
    }

    sb.append(targetX).append(" ").append(targetY);

    System.out.print(sb);
  }
}
