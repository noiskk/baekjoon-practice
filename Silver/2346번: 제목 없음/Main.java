/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2346                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2346                           #+#        #+#      #+#    */
/*   Solved: 2025/06/25 17:06:54 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    Deque<int[]> deque = new ArrayDeque<>();

    for(int i = 1; i <= N; i++){
      int card = sc.nextInt();
      deque.offer(new int[]{i, card});
    }

    // first     last
    // 1  2  3  4  5 
    // 3  2  1 -3 -1

    StringBuilder sb = new StringBuilder();
    while(!deque.isEmpty()){
      int[] cur = deque.pollFirst();
      sb.append(cur[0]).append(" ");

      if(deque.isEmpty()) break;

      int cnt = cur[1];
      int size = deque.size();

      if(cnt > 0){
        cnt %= size;
        if(cnt == 0) cnt = size;
        for (int i = 0; i < cnt - 1; i++) {
          deque.offerLast(deque.pollFirst());    
        }
      } else {
        cnt = (-cnt) % size;
        if(cnt == 0) cnt = size;
        for (int i = 0; i < cnt; i++) {
          deque.offerFirst(deque.pollLast());    
        }

      }
    }

    System.out.println(sb);

  }
}