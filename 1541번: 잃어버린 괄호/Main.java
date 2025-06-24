/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1541                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1541                           #+#        #+#      #+#    */
/*   Solved: 2025/06/24 17:03:19 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    String[] str = input.split("-");

    int result = 0;

    for(int i = 0; i < str.length; i++){
      int temp = mySum(str[i]);
      if(i == 0){
        result += temp;
      } else {
        result -= temp;
      }
    }

    System.out.println(result);
  }

  private static int mySum(String str){
    int sum = 0;
    String[] num = str.split("\\+");

    for(int i = 0; i < num.length; i++){
      sum += Integer.parseInt(num[i]);
    }

    return sum;
  }
}