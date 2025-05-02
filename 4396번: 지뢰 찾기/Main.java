/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 4396                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/4396                           #+#        #+#      #+#    */
/*   Solved: 2025/07/10 12:55:58 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;

public class Main{

  static int n;
  static char[][] bombMap;
  static char[][] playerMap;

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    n = Integer.parseInt(br.readLine());

    bombMap = new char[n][n];
    playerMap = new char[n][n];

    // 폭탄 위치 입력 받기
    for (int i = 0; i < n; i++) {
      bombMap[i] = br.readLine().toCharArray();
    }

    // 게임 진행 상태 입력 받기
    for (int i = 0; i < n; i++) {
      playerMap[i] = br.readLine().toCharArray();
    }

    boolean bombTriggered = false;

    OUTER:
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if(playerMap[i][j] == 'x' && bombMap[i][j] == '*'){
          bombTriggered = true;
          break OUTER;
        }
      }
    }

    StringBuilder sb = new StringBuilder();

    if(bombTriggered){
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++){
          if(bombMap[i][j] == '*'){
            sb.append('*');
          }
          else if(playerMap[i][j] == 'x'){
            sb.append(check(i, j));
          } else {
            sb.append(".");
          }
        }
        sb.append("\n");
      }
    } else {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if(playerMap[i][j] == 'x'){
            sb.append(check(i, j));
          } else {
            sb.append(".");
          }
        }  
        sb.append("\n");
      }
    }

    System.out.println(sb);

  }

  public static int check(int x, int y){

    int count = 0;
    int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    for (int i = 0; i < 8; i++) {
      int nx = x + dx[i];
      int ny = y + dy[i];

      if(nx >= 0 && ny >= 0 && nx < n && ny < n){
        if(bombMap[nx][ny] == '*') count++;
      }
    }

    return count;
  }
}