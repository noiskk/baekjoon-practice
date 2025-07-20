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

import java.io.*;
import java.util.*;

public class Main{

  static class Balloon {
    int index;
    int move;

    Balloon(int index, int move) {
      this.index = index;
      this.move = move;
    }
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    Deque<Balloon> deque = new ArrayDeque<>();
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 1; i <= N; i++) {
      int move = Integer.parseInt(st.nextToken());
      deque.offer(new Balloon(i, move));
    }

    StringBuilder sb = new StringBuilder();

    while(!deque.isEmpty()){
      Balloon current = deque.pollFirst();
      sb.append(current.index).append(" ");

      if(deque.isEmpty()) break;

      if(current.move > 0){
        int moves = current.move - 1;
        for (int i = 0; i < moves; i++) {
          deque.offerLast(deque.pollFirst());
        }

      } else {
        int moves = -current.move;
        for (int i = 0; i < moves; i++) {
          deque.offerFirst(deque.pollLast());
        }

      }
    }

    System.out.println(sb.toString().trim());

  }
}