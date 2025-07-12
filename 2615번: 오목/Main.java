import java.io.*;
import java.util.*;

public class Main{
  
  static int[][] board;
  // 우, 하, 우-하, 우-상 대각선
  static int[] dx = {0, 1, 1, -1};
  static int[] dy = {1, 0, 1, 1};

  public static void main(String[] args) throws IOException{

    board = new int[19][19];
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    for (int i = 0; i < 19; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 19; j++) {
        board[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    // 가장 왼쪽에 있는 바둑알을 출력해야 하기 때문에 가로 방향 말고 세로 방향으로 탐색
    for (int j = 0; j < 19; j++) {
      for (int i = 0; i < 19; i++) {
        if(board[i][j] != 0){
          if(checkWin(i, j)){
            System.out.println(board[i][j]);
            System.out.println((i + 1) + " " + (j + 1));
            return;
          }
        }
      }
    }

    // 무승부
    System.out.println(0);
  }

  private static boolean checkWin(int x, int y){
    int stoneColor = board[x][y];

    for (int i = 0; i < 4; i++) {
      int count = 1;
      int nx = x + dx[i];
      int ny = y + dy[i];

      // 연속된 돌 확인
      while(isValid(nx, ny) && board[nx][ny] == stoneColor){
        count++;
        nx += dx[i];
        ny += dy[i];
      }

      // 육목 확인
      if(count == 5){
        int prevX = x - dx[i];
        int prevY = y - dy[i];

        if(!isValid(prevX, prevY) || board[prevX][prevY] != stoneColor){
          return true;
        }
      }
    }

    return false;
  }

  private static boolean isValid(int x, int y){
    return x >= 0 && x < 19 && y >= 0 && y < 19;
  }

}