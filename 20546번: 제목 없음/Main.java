/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 20546                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/20546                          #+#        #+#      #+#    */
/*   Solved: 2025/07/09 17:41:22 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int cash = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] stock = new int[14];
    for (int i = 0; i < 14; i++) {
      stock[i] = Integer.parseInt(st.nextToken());
    }

    // 준현이는 매수 가능한만큼 다 사고 절대 안 팔음. 
    // 성민이는 3일 연속 하락 시 전량 매수, 상승 시 전량 매도. 

    int jun_cash = cash;
    int jun_stock = 0;
    int sung_cash = cash;
    int sung_stock = 0;
    int increase_count = 0;
    int decrease_count = 0;

    for (int i = 0; i < 14; i++) {
      // BNP 전략
      if(jun_cash >= stock[i]){
        int buy = jun_cash / stock[i];
        jun_cash -= buy * stock[i];
        jun_stock += buy;
      }

      // TIMING 전략
      if(i >= 1){

        if(stock[i] > stock[i - 1]){
          increase_count++;
          decrease_count = 0;

          if(increase_count >= 3){
            sung_cash += sung_stock * stock[i];
            sung_stock = 0;
          }
        } else if(stock[i] < stock[i - 1]){
          decrease_count++;
          increase_count = 0;

          if(decrease_count >= 3){
            int buy = sung_cash / stock[i];
            sung_cash -= buy * stock[i];
            sung_stock += buy;
          }
        } else {
          increase_count = 0;
          decrease_count = 0;
        }

      }
    }

    long jun_result = (long)stock[13] * jun_stock + jun_cash;
    long sung_result = (long)stock[13] * sung_stock + sung_cash;
    
    if(jun_result > sung_result) System.out.println("BNP");
    else if(sung_result > jun_result) System.out.println("TIMING");
    else System.out.println("SAMESAME");

  }
}