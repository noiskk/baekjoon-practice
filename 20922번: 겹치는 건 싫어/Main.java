

/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 20922                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/20922                          #+#        #+#      #+#    */
/*   Solved: 2025/07/23 12:32:37 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    int[] count = new int[100001];

    int start = 0;
    int length = 0;

    for (int end = 0; end < N; end++) {
      count[arr[end]]++;
      
      while(count[arr[end]] > K){
        count[arr[start]]--;
        start++;
      }

      length = Math.max(length, end - start + 1);

    }

    System.out.println(length);

  }
}