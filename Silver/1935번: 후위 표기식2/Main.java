/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1935                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1935                           #+#        #+#      #+#    */
/*   Solved: 2025/06/26 18:09:42 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;


public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String s = sc.next();
    double[] values = new double[26];

    for (int i = 0; i < N; i++) {
      values[i] = sc.nextDouble();
    }

    Stack<Double> stack = new Stack<>();
    double num1;
    double num2;
    
    // 1 * 2 + 3 - 4 % 2

    for(char c : s.toCharArray()){
      if(c >= 'A' && c <= 'Z'){
        stack.push(values[c - 'A']);
      } else {
        num2 = stack.pop();
        num1 = stack.pop();
        switch (c) {
            case '+':      
              stack.push(num1 + num2);
              break;
            case '-':
              stack.push(num1 - num2);
              break;
            case '*':
              stack.push(num1 * num2);
              break;
            case '/':
              stack.push(num1 / num2);
              break;
        }
      }
    }

    double result = stack.pop();
    System.out.printf("%.2f", result);
  }
}