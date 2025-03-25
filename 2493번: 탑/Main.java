/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2493                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2493                           #+#        #+#      #+#    */
/*   Solved: 2025/06/27 19:49:44 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    StringBuilder sb = new StringBuilder();

    Stack<int[]> stack = new Stack<>();

    // 3 4 7 5

    for (int i = 0; i < N; i++) {
      int height = Integer.parseInt(st.nextToken());
      int[] a = new int[]{i, height};
      
      // 처음 들어가는 경우
      if(stack.isEmpty()){
        sb.append(0).append(" ");
        stack.push(a);
        
      } else if(stack.peek()[1] < height) {
        // peek 값보다 큰 값이 들어오는 경우
        // 그 전 값도 확인해야됨. 
        while(!stack.isEmpty()){
          if(stack.peek()[1] >= height) break;
          stack.pop();
        }

        if(stack.isEmpty()){
          sb.append(0).append(" ");
        } else {
          sb.append(stack.peek()[0] + 1).append(" ");
        }

        stack.push(a);
        
      } else{
        // peek 값보다 작은 값이 들어오는 경우
        sb.append(stack.peek()[0] + 1).append(" ");
        stack.push(a);
      }
    }

    System.out.println(sb);
    
  }
}