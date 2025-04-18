/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2609                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2609                           #+#        #+#      #+#    */
/*   Solved: 2025/07/03 16:40:03 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    int GCD = gcd(A, B);
    int LCM = A * B / GCD;

    System.out.println(GCD);
    System.out.println(LCM);
    
  }

  static int gcd(int a, int b){
    return b == 0 ? a : gcd(b, a % b);
  }
}