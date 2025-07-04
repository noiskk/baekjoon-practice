/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 20053                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/20053                          #+#        #+#      #+#    */
/*   Solved: 2025/07/04 14:38:42 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for (int i = 0; i < T; i++) {
      int N = sc.nextInt();
      int num = sc.nextInt();
      int min = num;
      int max = num;
      for(int j = 1; j < N; j++){
        num = sc.nextInt();
        if(num > max) max = num;
        else if(num < min) min = num;
      }

      System.out.println(min + " " + max);
    }
  }
}