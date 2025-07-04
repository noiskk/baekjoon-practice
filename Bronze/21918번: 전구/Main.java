/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 21918                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/21918                          #+#        #+#      #+#    */
/*   Solved: 2025/07/04 15:10:30 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt(); // 전구 개수
    int M = sc.nextInt(); // 명령어 개수

    int[] lights = new int[N];

    for (int i = 0; i < N; i++) {
      lights[i] = sc.nextInt();  
    }

    for (int i = 0; i < M; i++) {
      int a = sc.nextInt(); // 명령어 종류
      int b = sc.nextInt() - 1;
      int c = sc.nextInt();
      switch (a) {
          case 1:
              lights[b] = c;
              break;
          case 2:
              for(int j = b; j < c; j++){
                if(lights[j] == 0) lights[j] = 1;
                else lights[j] = 0; 
              }
              break;
          case 3:
              for(int j = b; j < c; j++){
                lights[j] = 0; 
              }
              break;
          case 4:
              for(int j = b; j < c; j++){
                lights[j] = 1;
              }
              break;
      }
    }

    for (int i = 0; i < N; i++) {
      System.out.print(lights[i] + " ");
    }
  }
}