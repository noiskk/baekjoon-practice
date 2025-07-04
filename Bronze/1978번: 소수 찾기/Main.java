/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1978                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1978                           #+#        #+#      #+#    */
/*   Solved: 2025/07/02 19:13:56 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int count = 0;

    for(int i = 0; i < N; i++){
      int num = sc.nextInt();
      boolean isValid = true;

      if(num < 2) continue;
      else if(num == 2) {
        count++;
        continue;
      }
      
      for(int j = 2; j < num; j++){
        if(num % j == 0) {
          isValid = false;
          break;
        }
      }

      if(isValid == true) count++;
    }

    System.out.println(count);
  }
}