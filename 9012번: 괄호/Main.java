/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 9012                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/9012                           #+#        #+#      #+#    */
/*   Solved: 2025/06/24 20:50:28 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < N; i++) {
      char[] cArr = sc.next().toCharArray();
      String valid = "YES";

      for(char c : cArr){
        if(c == '('){
          stack.push(c);
        } else if (!stack.isEmpty() && stack.peek() == '('){
          stack.pop();
        } else {
          valid = "NO";
          break;
        }
      }

      if (valid.equals("YES") && !stack.isEmpty()) {
        valid = "NO";
      }

      System.out.println(valid);

      stack.clear();
    }
  }
}