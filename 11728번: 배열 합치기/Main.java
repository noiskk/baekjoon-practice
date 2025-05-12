/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11728                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11728                          #+#        #+#      #+#    */
/*   Solved: 2025/07/23 11:16:51 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int aSize = sc.nextInt();
    int bSize = sc.nextInt();

    int[] aArr = new int[aSize];
    int[] bArr = new int[bSize];

    for (int i = 0; i < aSize; i++) {
      aArr[i] = sc.nextInt();   
    }

    for (int i = 0; i < bSize; i++) {
      bArr[i] = sc.nextInt();
    }

    StringBuilder sb = new StringBuilder();

    int a = 0;
    int b = 0;

    while(a < aSize && b < bSize){
      if(aArr[a] < bArr[b]){
        sb.append(aArr[a]).append(" ");
        a++;
      } else {
        sb.append(bArr[b]).append(" ");
        b++;
      }
    }

    while(a < aSize){
      sb.append(aArr[a]).append(" ");
      a++;
    }

    while(b < bSize){
      sb.append(bArr[b]).append(" ");
      b++;
    }
    
    System.out.println(sb.toString());

  }
}