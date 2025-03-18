/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1158                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1158                           #+#        #+#      #+#    */
/*   Solved: 2025/06/24 22:06:28 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();

    StringBuilder sb = new StringBuilder();

    Queue<Integer> queue = new LinkedList<>();
    for (int i = 1; i <= N; i++) {
      queue.offer(i);
    }
    // 1 2 3 4 5 6 7
    
    int count = 1;

    while(!queue.isEmpty()){
      
      if(count == K){
        sb.append(queue.poll()).append(", ");
        count = 1;
      } else {
        queue.offer(queue.poll());
        count++;
      }
    }

    sb.delete(sb.length() - 2, sb.length());

    System.out.println("<" + sb + ">");

  }
}