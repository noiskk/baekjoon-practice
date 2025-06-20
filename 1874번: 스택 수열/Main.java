/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1874                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1874                           #+#        #+#      #+#    */
/*   Solved: 2025/06/20 10:36:37 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
        A[i] = sc.nextInt();
    }

    Stack<Integer> stack = new Stack<>();
    StringBuilder result = new StringBuilder();

    int current = 1;
    boolean possible = true;
    
    for(int i = 0; i < A.length; i++){
      int num = A[i];

      // 현재 수보다 크거나 같을 때까지 push
      while(current <= num){
        stack.push(current++);
        result.append("+\n");
      }

      // 스택의 top이 현재 수와 같으면 pop
      if(stack.peek() == num){
        stack.pop();
        result.append("-\n");
      } else {
        // 수열 만들 수 없음
        possible = false;
        break;
      }
    }

    if(possible){
      System.out.println(result.toString());
    } else {
      System.out.println("NO");
    }
    
  }

}