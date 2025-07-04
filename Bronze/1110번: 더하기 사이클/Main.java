/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1110                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1110                           #+#        #+#      #+#    */
/*   Solved: 2025/07/03 14:51:17 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    int count = 0;
    int num = input;

    do {
      if(num >= 10){
        int first = num / 10;
        int second = num % 10;

        num = second * 10 + (first + second) % 10;
      } else {
        num += num * 10;
      }
      count++;
    } while (input != num);

    System.out.println(count);

  }
}