/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10994                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10994                          #+#        #+#      #+#    */
/*   Solved: 2025/07/11 10:09:27 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{

  static char[][] map;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    
    int N = sc.nextInt();
    
    int size = 4 * N - 3; // size = n * 2 - 1 + (n - 1) * 2 = 4n - 3
    
    map = new char[size][size];

    for (int i = 0; i < size; i++) {
      Arrays.fill(map[i], ' ');   
    }

    draw(N, 0, 0);

    for (int i = 0; i < size; i++) {
        sb.append(map[i]).append('\n');
    }
    System.out.print(sb);

    
   
  }

  static void draw(int n, int r, int c){

    if(n == 1){
      map[r][c] = '*';
      return;
    }

    int size = 4 * n - 3;

    // 위 아래
    for(int i = 0; i < size; i++){
      map[r][c + i] = '*';
      map[r + size - 1][c + i] = '*';
    }

    // 양 옆
    for(int i = 0; i < size; i++){
      map[r + i][c] = '*';
      map[r + i][c + size - 1] = '*';
    }

    draw(n - 1, r + 2, c + 2);
  }
}

// *********
// *       *
// * ***** *
// * *   * *
// * * * * *
// * *   * *
// * ***** *
// *       *
// *********