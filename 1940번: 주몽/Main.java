/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1940                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1940                           #+#        #+#      #+#    */
/*   Solved: 2025/06/18 14:12:14 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

// Scanner 사용 시 -> 메모리: 35060, 시간: 392
// BufferedReader 사용 시 -> 메모리: 16420, 시간: 168

import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());

    int[] num = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());

    for(int i = 0; i < N; i++){
      num[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(num);

    int cnt = 0;

    int i = 0; // A[0] -> Min
    int j = N - 1; // A[N - 1] -> Max

    while(i < j){
      if(num[i] + num[j] == M){
        cnt++;
        i++;
        j--;
      } else if(num[i] + num[j] > M) {
        j--;
      } else{
        i++;
      }
    }

    System.out.println(cnt);

  }
}