/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 20438                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/20438                          #+#        #+#      #+#    */
/*   Solved: 2025/07/24 15:18:10 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main{

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int Q = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    boolean[] sleep = new boolean[N + 3];
    boolean[] attend = new boolean[N + 3];

    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < K; i++) {
      int num = Integer.parseInt(st.nextToken());
      sleep[num] = true;   
    }

    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < Q; i++) {
      int num = Integer.parseInt(st.nextToken());
      
      if(sleep[num]) continue;

      for(int j = num; j <= N + 2; j += num){
        if(!sleep[j]) attend[j] = true;
      }
      
    }

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int S = Integer.parseInt(st.nextToken());
      int E = Integer.parseInt(st.nextToken());
      int count = 0;

      for (int j = S; j <= E; j++) {
        if(!attend[j]) count++;
      }    

      sb.append(count).append("\n");
    }

    System.out.println(sb.toString());

  }

}