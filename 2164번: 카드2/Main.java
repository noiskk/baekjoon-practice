/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2164                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2164                           #+#        #+#      #+#    */
/*   Solved: 2025/06/20 11:04:12 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */


// 큐로 해결
// 일단 큐에 다 넣어
// while(큐 > 1)
//  하나 버리고 하나 넣고 반복
// 큐 출력


import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    Queue<Integer> queue = new LinkedList<>();

    for(int i = 1; i <= N; i++){
      queue.offer(i);
    }

    while(queue.size() > 1){
      queue.poll();
      queue.offer(queue.poll());
    }

    System.out.println(queue.poll());
  }
}