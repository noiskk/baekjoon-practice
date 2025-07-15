/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2578                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2578                           #+#        #+#      #+#    */
/*   Solved: 2025/07/10 21:09:26 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

// 2차원 배열을 만들고 숫자를 넣음. 
// 숫자가 불리면 지워야 되니까 boolean[][] 도 만들어. 
// 지워질때마다 한 줄이 되었는지 확인해.
// 줄을 어떻게 표현할 것인가... row3 이런식으로 해야되나


import java.io.*;
import java.util.*;

public class Main{

  static int[][] bingo;
  static boolean[][] isDeleted;
  static int[][] position;
  static int line;

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    bingo = new int[5][5];
    isDeleted = new boolean[5][5];
    position = new int[26][2];
    line = 0;

    // 빙고판 만들기
    for(int i = 0; i < 5; i++){
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 5; j++) {
        int num = Integer.parseInt(st.nextToken());
        bingo[i][j] = num;
        position[num][0] = i;
        position[num][1] = j;
      }
    }

    int count = 0;

    for (int i = 0; i < 5; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 5; j++) {
        int num = Integer.parseInt(st.nextToken());
        int row = position[num][0];
        int col = position[num][1];
        isDeleted[row][col] = true;

        count++;
        
        checkBingo(row, col);
        if(line >= 3){
          System.out.println(count);
          return;
        }
      }
    }


  }
  
  public static void checkBingo(int row, int col){
    int count = 0;

    for (int i = 0; i < 5; i++) {
      if(isDeleted[row][i] == true) count++;
    }
    if(count == 5) line++;
    count = 0;

    for (int i = 0; i < 5; i++) {
      if(isDeleted[i][col] == true) count++;
    }
    if(count == 5) line++;
    count = 0;

    if(row == col){
      for (int i = 0; i < 5; i++) {
        if(isDeleted[i][i] == true) count++;
      }
      if(count == 5) line++;
      count = 0;
    }

    if(row + col == 4){
      for (int i = 0; i < 5; i++) {
        if(isDeleted[i][4 - i] == true) count++;
      }
      if(count == 5) line++;
    }
    
  }
}