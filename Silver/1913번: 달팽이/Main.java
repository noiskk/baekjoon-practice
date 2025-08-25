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

import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); // 홀수인 자연수
    int target = Integer.parseInt(br.readLine()); // 위치를 찾고자 하는 자연수

    int[][] snail = new int[N][N];

    // 방향 배열: 하, 우, 상, 좌
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};

    int x = 0, y = 0; // 시작 위치
    int targetX = 0, targetY = 0; // 찾는 숫자 좌표
    int num = N * N;
    int direction = 0; // 아래쪽 방향부터 시작

    for (int i = 0; i < N * N; i++) {
      snail[x][y] = num;   

      if(num == target){
        targetX = x + 1;
        targetY = y + 1;
      }

      num--;

      int nx = x + dx[direction];
      int ny = y + dy[direction];

      if(nx >= N || nx < 0 || ny >= N || ny < 0 || snail[nx][ny] != 0){
        direction = (direction + 1) % 4;
        nx = x + dx[direction];
        ny = y + dy[direction];
      }

      x = nx;
      y = ny;
    }

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        sb.append(snail[i][j]).append(" ");

      }
      sb.append("\n");
    }

    System.out.print(sb.toString());
    System.out.print(targetX + " " + targetY);
  }
}
