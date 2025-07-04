/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1966                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1966                           #+#        #+#      #+#    */
/*   Solved: 2025/06/26 19:14:17 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();

    for (int i = 0; i < test; i++) {

      // 입력 받기
      int N = sc.nextInt();
      int M = sc.nextInt();

      Queue<int[]> queue = new LinkedList<>();
      for(int j = 0; j < N; j++){
        int priority = sc.nextInt();
        queue.offer(new int[]{j, priority});
      }

      int count = 0;

      while(!queue.isEmpty()){
        // 제일 앞에 있는 문서의 중요도 확인
        // 중요도 가장 높으면 출력, 아니면 맨 뒤로 다시 넣음. 
        
        // 중요도 최댓값 계산
        int max_priority = 0;
        for(int[] a : queue){
          if(a[1] > max_priority){
            max_priority = a[1];
          }
        }
        
        // 제일 앞에 있는 문서의 중요도 확인
        int[] current = queue.poll();
        if(current[1] != max_priority){
          queue.offer(current);
        } else {
          count++;
          if(current[0] == M){
            System.out.println(count);
            break;
          }
        }
      }

    }
  }
}