/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2753                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2753                           #+#        #+#      #+#    */
/*   Solved: 2025/07/04 13:42:50 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();

    // 2004 윤년
    // 2000 윤년
    // 2100 윤년 아님

    if(year % 4 == 0){
      if(year % 100 == 0){
        if(year % 400 == 0) System.out.println(1);
        else System.out.println(0);
      } else{
        System.out.println(1);
      }
    } else {
      System.out.println(0);
    }
  }
}