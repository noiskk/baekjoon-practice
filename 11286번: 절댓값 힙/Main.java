/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11286                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11286                          #+#        #+#      #+#    */
/*   Solved: 2025/06/20 11:56:38 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    PriorityQueue<Integer> pQueue = new PriorityQueue<>((o1, o2) -> {
      int first_abs = Math.abs(o1);
      int second_abs = Math.abs(o2);

      // 절댓값이 같다면 음수 먼저 출력
      if(first_abs == second_abs){
        return o1 - o2;
      }

      // 절댓값이 작은 순서대로 출력
      return first_abs - second_abs;
    });


    for(int i = 0; i < N; i++){
      int input = Integer.parseInt(br.readLine());
      if(input == 0){
        if(!pQueue.isEmpty()){
          System.out.println(pQueue.poll());
        } else {
          System.out.println(0);
        }
      } else {
        pQueue.offer(input);
      } 
    }

  }
}