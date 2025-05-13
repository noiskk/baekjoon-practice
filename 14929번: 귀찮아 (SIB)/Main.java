/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 14929                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/14929                          #+#        #+#      #+#    */
/*   Solved: 2025/07/24 14:56:56 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] num = new int[n];
    long[] sum = new long[n];
    long total = 0;

    num[0] = sc.nextInt();
    sum[0] = num[0];

    for (int i = 1; i < n; i++) {
      num[i] = sc.nextInt();
      sum[i] = sum[i - 1] + num[i];
    }

    for (int i = 0; i < n; i++) {
      total += num[i] * (sum[n - 1] - sum[i]);
    }

    System.out.println(total);

    /*
     * 1  2  3  4  5  6  7  8  9
     * 1  3  6 10 15 21 28 36 45
     * 
     * 구간 합 이용하면 될 거 같은데
     *  1 * (2 ~ 10)
     *  2 * (3 ~ 10)
     */


  }
}
