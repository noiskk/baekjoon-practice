/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 20154                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/20154                          #+#        #+#      #+#    */
/*   Solved: 2025/07/15 11:37:11 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] count = {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};

    String str = sc.next();

    int sum = 0;
    for (int i = 0; i < str.length(); i++) {
      sum += count[str.charAt(i) - 'A'];
      sum %= 10;
    }

    if(sum % 2 == 0){
      System.out.println("You're the winner?");
    } else {
      System.out.println("I'm a winner!");
    }
  }
}