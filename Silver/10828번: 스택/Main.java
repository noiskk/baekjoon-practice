/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10828                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10828                          #+#        #+#      #+#    */
/*   Solved: 2025/06/24 20:28:08 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    Stack<Integer> stack = new Stack<>();

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String cmd = st.nextToken();
      switch(cmd){
        case "push":
          stack.push(Integer.parseInt(st.nextToken()));
          break;

        case "pop":
          sb.append(stack.isEmpty() ? -1 : stack.pop()).append('\n');
          break;

        case "size":
          sb.append(stack.size()).append('\n');
          break;

        case "empty":
          sb.append(stack.isEmpty() ? 1 : 0).append('\n');
          break;

        case "top":
          sb.append(stack.isEmpty() ? -1 : stack.peek()).append('\n');

      }
    }

    System.out.print(sb);

  }
}