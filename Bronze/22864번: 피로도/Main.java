/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 22864                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/22864                          #+#        #+#      #+#    */
/*   Solved: 2025/07/02 18:53:11 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt(); // 시간 당 피로도
    int B = sc.nextInt(); // 시간 당 업무량
    int C = sc.nextInt(); // 시간 당 회복량
    int M = sc.nextInt(); // 최대 피로도 

    int x = 0; // 피로도
    int result = 0; // 업무량
    
    for (int time = 0; time < 24; time++) {
      if(x + A <= M){
        x += A;
        result += B;
      } else {
        x -= C;
        if(x < 0) x = 0;
      }
    }

    System.out.println(result);
  

  }
}