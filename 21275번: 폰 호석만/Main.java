/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 21275                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/21275                          #+#        #+#      #+#    */
/*   Solved: 2025/07/08 13:27:43 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

// abcde fghij klmno pqrst uvwxy z

// ep     jh
// 14 25  19 17

// 14 * a + 25 = 19 * b + 17


import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    String aStr = st.nextToken();
    String bStr = st.nextToken();

    int count = 0;
    long xSol = 0L;
    int aSol = 0, bSol = 0;

    for (int aBase = 2; aBase <= 36; aBase++) {
      for(int bBase = 2; bBase <= 36; bBase++){
        if(aBase == bBase) continue;

        long aVal = toDecimal(aStr, aBase);
        long bVal = toDecimal(bStr, bBase);

        if(aVal == -1 || bVal == -1) continue;

        if(aVal == bVal){
          count++;
          xSol = aVal;
          aSol = aBase;
          bSol = bBase;
        }

      }   
    }

    if(count == 0){
      System.out.println("Impossible");
    } else if(count == 1){
      System.out.println(xSol + " " + aSol + " " + bSol);
    } else {
      System.out.println("Multiple");
    }
    
  }

  public static long toDecimal(String str, int base){

    long result = 0L;

    for(char c : str.toCharArray()){
      int digit;
      if(c >= '0' && c <= '9') {
        digit = c -'0';
      } else {
        digit = c - 'a' + 10;
      }

      if (digit >= base) {
        return -1;
      }

      if(Long.MAX_VALUE / base < result) return -1;
      result *= base;

      if(Long.MAX_VALUE - digit < result) return -1;
      result += digit;
    }

    return result;
  }
}