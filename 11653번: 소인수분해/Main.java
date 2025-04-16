/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11653                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11653                          #+#        #+#      #+#    */
/*   Solved: 2025/07/03 15:25:28 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    int num = sc.nextInt();

    for(int i = 2; i <= Math.sqrt(num); i++){
      while(num % i == 0){
        sb.append(i).append("\n");
        num /= i;
      }
    }
    
    if(num > 1){
      sb.append(num);
    }

    System.out.println(sb);
    
  }
}