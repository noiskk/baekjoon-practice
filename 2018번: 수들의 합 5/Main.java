/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2018                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2018                           #+#        #+#      #+#    */
/*   Solved: 2025/06/18 10:58:44 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */


// 투 포인터 사용
// start_idx, end_idx

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int start_idx = 1, end_idx = 1, cnt = 1, sum = 1;

    while(end_idx != N){
      if(sum == N){
        cnt++;
        end_idx++;
        sum += end_idx;
      } else if(sum > N){
        sum -= start_idx;
        start_idx++;
      } else {
        end_idx++;
        sum += end_idx;
      }
    }

    System.out.println(cnt);
  }
}