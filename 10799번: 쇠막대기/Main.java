/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10799                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10799                          #+#        #+#      #+#    */
/*   Solved: 2025/06/26 21:48:12 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] arr = sc.next().toCharArray();

    Stack<Character> stack = new Stack<>();

    int count = 0;
    char prev = ' ';

    for(char c : arr){
      if(c == '('){
        stack.push(c);
      } else {
        stack.pop();
        if(prev == '('){
          count += stack.size();
        } else {
          count++;
        }
      }
      prev = c;
    }

    
    System.out.println(count);
  }
}