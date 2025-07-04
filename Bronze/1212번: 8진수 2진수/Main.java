/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1212                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1212                           #+#        #+#      #+#    */
/*   Solved: 2025/07/04 14:48:22 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String octal = sc.next();

    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < octal.length(); i++){
      int num = octal.charAt(i) - '0';
      String binary = Integer.toBinaryString(num);

      if(i == 0) {
        sb.append(binary);
      } else {
        while(binary.length() < 3){
          binary = "0" + binary;
        }
        sb.append(binary);
      }
    }

    System.out.println(sb.toString());
  }
}