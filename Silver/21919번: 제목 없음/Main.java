/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 21919                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/21919                          #+#        #+#      #+#    */
/*   Solved: 2025/07/08 11:57:13 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());

    long result = 1;

    for (int i = 0; i < N; i++) {
      long num = Long.parseLong(st.nextToken());
      if(isPrime(num)){
        result = lcm(result, num);
      }
    }

    if(result == 1) System.out.println(-1);
    else System.out.println(result);

  }

  public static long gcd(long a, long b){
    return b == 0 ? a : gcd(b, a % b);
  }

  public static long lcm(long a, long b){
    return a * b / gcd(a, b);
  }

  public static boolean isPrime(long num){

    if(num < 2) return false;
    if(num == 2) return true;
    if(num % 2 == 0) return false;

    for (int i = 3; i <= Math.sqrt(num); i += 2) {
      if(num % i == 0) return false;
    }

    return true;

  }
}