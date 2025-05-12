/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 21921                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/21921                          #+#        #+#      #+#    */
/*   Solved: 2025/07/23 11:41:39 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int X = sc.nextInt();

    int[] visitors = new int[N];

    for (int i = 0; i < N; i++) {
      visitors[i] = sc.nextInt();   
    }

    int start = 0;
    int end = X - 1;

    int sum = 0;
    int count = 1;

    for (int i = start; i <= end; i++) {
      sum += visitors[i];
    }

    int max = sum;

    while(end < N - 1){
      sum -= visitors[start];
      sum += visitors[end + 1];

      start++;
      end++;
      
      if(sum > max){
        max = sum;
        count = 1;
      } else if (sum == max){
        count++;
      }
    }

    if(max == 0){
      System.out.println("SAD");
    } else {
      System.out.println(max);
      System.out.println(count);
    }
    
  }
}