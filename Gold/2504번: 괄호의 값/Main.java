/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2504                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2504                           #+#        #+#      #+#    */
/*   Solved: 2025/06/26 23:19:34 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] arr = sc.next().toCharArray();

    Stack<Object> stack = new Stack<>();  // 괄호와 숫자를 함께 담을 스택

    int result = 0;

    for(char c : arr){
      if(c == '(' || c == '['){
        // 여는 괄호는 그대로 스택에 push
        stack.push(c);
      } else {

        int temp = 0;

        // 숫자가 위에 있다면 전부 꺼내서 더함
        while(!stack.isEmpty() && stack.peek() instanceof Integer){
          temp += (int) stack.pop();
        }
        
        // 숫자만 있는 경우
        if(stack.isEmpty()){
          System.out.println(0);
          return;
        }

        // 여는 괄호 꺼냄
        char top = (char) stack.pop();

        // 짝이 안맞는 경우
        if(c == ')' && top != '('){
          System.out.println(0);
          return;
        }
        if(c == ']' && top != '['){
          System.out.println(0);
          return;
        }

        // temp 가 0 이면 기본값 2, 3
        // 0 이 아니면 곱셈
        if(temp == 0){
          if(c == ')') stack.push(2);
          else stack.push(3);
        } else {
          if(c == ')') stack.push(temp * 2);
          else stack.push(temp * 3);
        }

      }
    }

    // 스택에 남은 숫자 모두 더함
    while(!stack.isEmpty()){
      if(!(stack.peek() instanceof Integer)){
        System.out.println(0);
        return;
      }
      result += (int) stack.pop();
    }

    System.out.println(result);

  }
}