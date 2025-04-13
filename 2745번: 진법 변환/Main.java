/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2745                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2745                           #+#        #+#      #+#    */
/*   Solved: 2025/07/03 13:24:09 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] cArr = sc.next().toCharArray();
    int B = sc.nextInt();

    int result = 0;

    for(int i = 0; i < cArr.length; i++){
      int num;
      if(cArr[i] >= 'A' && cArr[i] <= 'Z'){
        num = cArr[i] - 'A' + 10;
      } else {
        num = cArr[i] - '0';
      }

      result += num * Math.pow(B, cArr.length - i - 1);
    }

    // A = 65
    // Z = 90

    System.out.println(result);
  }
}