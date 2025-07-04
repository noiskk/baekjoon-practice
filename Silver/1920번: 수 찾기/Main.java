/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1920                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1920                           #+#        #+#      #+#    */
/*   Solved: 2025/06/24 13:58:31 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main{

  static int[] A;
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    A = new int[N];

    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < N; i++){
      A[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(A);

    st = new StringTokenizer(br.readLine());
    int M = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++) {
      int num = Integer.parseInt(st.nextToken());
      System.out.println(Find(num));
    }

  }

  private static int Find(int num){
    int start = 0;
    int end = A.length - 1;
    
    while (start <= end) { 
      int mid_index = (start + end) / 2;
      int mid_value = A[mid_index];
      if(mid_value > num){
        end = mid_index - 1;
      } else if(mid_value < num){
        start = mid_index + 1;
      } else {
        return 1;
      }
    }

    return 0;
  }
}