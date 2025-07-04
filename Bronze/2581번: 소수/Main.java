/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2581                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2581                           #+#        #+#      #+#    */
/*   Solved: 2025/07/02 16:42:10 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int N = sc.nextInt();

    int result = 0;
    int min = 10000;

    for (int i = M; i <= N; i++) {
      if(i == 1) continue;

      boolean isValid = true;

      for(int j = 2; j <= Math.sqrt(i); j++){
        if(i % j == 0){
          isValid = false;
          break;
        }
      }

      if(isValid == true) {
        result += i;
        if(i < min) min = i;
      }

    }

    if(result != 0){
      System.out.println(result);
      System.out.println(min);
    } else {
      System.out.println(-1);
    }
    
  }
}