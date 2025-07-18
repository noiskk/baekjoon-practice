/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 17413                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/17413                          #+#        #+#      #+#    */
/*   Solved: 2025/07/16 11:56:17 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */


// tag 는 그대로 출력
// 단어는 공백을 기준으로 나누고 거꾸로 출력

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder output = new StringBuilder();
    StringBuilder words = new StringBuilder();

    String str = sc.nextLine();

    boolean isTag = false;
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);

      // 태그 처리
       
      if(c == '<'){
        isTag = true;
        output.append(words.reverse()).append(c);
        words.setLength(0);
        
      } 
      else if(isTag) {
        output.append(c);
        if(c == '>'){
          isTag = false;
        }
      } 
      else if(c == ' ') {
        output.append(words.reverse()).append(" ");
        words.setLength(0);
      } 
      else {
        words.append(c);
      }

      
      if(i == str.length() - 1 && c != '>'){
        output.append(words.reverse());
      }
      
    }


    System.out.print(output);
  }
}