/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10866                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10866                          #+#        #+#      #+#    */
/*   Solved: 2025/06/25 16:50:37 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    Deque<Integer> deque = new ArrayDeque<>();

    StringBuilder sb = new StringBuilder();
    
    StringTokenizer st;
    int input;

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      String cmd = st.nextToken();
      switch(cmd){
        case "push_front":
          input = Integer.parseInt(st.nextToken());
          deque.offerFirst(input);
          break;

        case "push_back":
          input = Integer.parseInt(st.nextToken());
          deque.offerLast(input);
          break;

        case "pop_front":
          sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
          break;

        case "pop_back":
          sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
          break;

        case "size":
          sb.append(deque.size()).append("\n");
          break;

        case "empty":
          sb.append(deque.isEmpty() ? 1 : 0).append("\n");
          break;

        case "front":
          sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
          break;

        case "back":
          sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
          break;
      }   
    }
    
    System.out.println(sb);
  }
}