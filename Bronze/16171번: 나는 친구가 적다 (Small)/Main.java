/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 16171                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/16171                          #+#        #+#      #+#    */
/*   Solved: 2025/07/15 10:49:56 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    String str = sc.next();
    String subStr = sc.next();

    for(char c : str.toCharArray()){
      if(c >= 'A' && c <= 'z'){
        sb.append(c);
      }
    }

    str = sb.toString();

    if(str.contains(subStr)){
      System.out.println(1);
    } else{
      System.out.println(0);
    }

  }
}