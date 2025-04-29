/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 5347                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/5347                           #+#        #+#      #+#    */
/*   Solved: 2025/07/06 15:13:12 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      long a = sc.nextInt();
      long b = sc.nextInt();
      long lcm = a * b / gcd(a, b);
      System.out.println(lcm);
    }
  }

  public static long gcd(long a, long b){
    return b == 0 ? a : gcd(b, a % b);
  }
}