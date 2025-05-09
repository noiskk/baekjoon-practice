/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 9342                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/9342                           #+#        #+#      #+#    */
/*   Solved: 2025/07/17 10:57:14 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */


import java.util.*;
import java.util.regex.Pattern;

public class Main{
  public static void main(String[] args) {
    // start : B C D E F 
    // end : A B D E F 

    Scanner sc = new Scanner(System.in);

    String pattern = "^[A-F]?A+F+C+[A-F]?$";

    int T = sc.nextInt();

    for (int i = 0; i < T; i++) {
      String str = sc.next();

      if(Pattern.matches(pattern, str)){
        System.out.println("Infected!");
      } else {
        System.out.println("Good");
      }

    }
  }

}