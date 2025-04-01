/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11279                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11279                          #+#        #+#      #+#    */
/*   Solved: 2025/07/02 12:59:56 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Queue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());

    int N = sc.nextInt();
    for (int i = 0; i < N; i++) {
      int input = sc.nextInt();

      if(input == 0){
        if(pQueue.isEmpty()) System.out.println(0);
        else System.out.println(pQueue.poll());
      } else {
        pQueue.offer(input);
      }
    }
  }
}