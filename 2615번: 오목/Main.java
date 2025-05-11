/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2615                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2615                           #+#        #+#      #+#    */
/*   Solved: 2025/07/22 14:11:26 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */


/*
 * 배열로 구현..?
 * 일단 배열에 저장하고
 * 검은색 -> 흰색 순서로 판별
 * 판을 다 검증하면서 검은색 돌이 있으면 오른쪽, 아래쪽을 봄 (총 4군데, 근데 있으면 그 기울기로 쭉 확인해야 됨)
 * 
 */


import java.io.*;
import java.util.*;

public class Main{
  static int[][] stage;
  static int[] dr; // 3시, 4시, 6시, 7시 방향
  static int[] dc;

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    stage = new int[19][19];
    dr = new int[]{0, 1, 1, -1}; // 3시, 4시, 6시, 7시 방향
    dc = new int[]{1, 1, 0, 1};

    StringTokenizer st;

    for (int i = 0; i < 19; i++) {
      st = new StringTokenizer(br.readLine());

      for (int j = 0; j < 19; j++) {
        stage[i][j] = Integer.parseInt(st.nextToken());
      } 
    }

    for (int i = 0; i < 19; i++) {
      for (int j = 0; j < 19; j++) {
        if(stage[i][j] != 0){
          for (int d = 0; d < 4; d++) {
            if(isWin(i, j, d)){
              System.out.println(stage[i][j]);
              System.out.println((i + 1) + " " + (j + 1));
              return;
            }
          }
          
        }     
      }
    }

    System.out.println(0);

  }

  public static boolean isWin(int i, int j, int dir){
    int stoneColor = stage[i][j];

    int prevR = i - dr[dir];
    int prevC = j - dc[dir];
    if (isInBounds(prevR, prevC) && stage[prevR][prevC] == stoneColor) {
        return false;
    }

    int count = 1;

    int r = i + dr[dir]; // 새로 확인할 돌 위치
    int c = j + dc[dir];

    while(isInBounds(r, c) && stage[r][c] == stoneColor){
      count++;
      r += dr[dir];
      c += dc[dir];
    }
    
    return count == 5;
  }

  public static boolean isInBounds(int r, int c){
    return r >= 0 && c >= 0 && r < 19 && c < 19;
  }
  
}