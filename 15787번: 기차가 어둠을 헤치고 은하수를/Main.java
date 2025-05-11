/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 15787                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/15787                          #+#        #+#      #+#    */
/*   Solved: 2025/07/21 12:25:57 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;


public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    boolean[][] passengers = new boolean[N][20];

    Set<String> set = new HashSet<>();

    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());

      switch (Integer.parseInt(st.nextToken())) {
          case 1 :
              int train = Integer.parseInt(st.nextToken()) - 1;
              int seat = Integer.parseInt(st.nextToken()) - 1;
              passengers[train][seat] = true;
              break;
          case 2:
              train = Integer.parseInt(st.nextToken()) - 1;
              seat = Integer.parseInt(st.nextToken()) - 1;
              passengers[train][seat] = false;
              break;
          case 3:
              train = Integer.parseInt(st.nextToken()) - 1;
              for(int j = 19; j > 0; j--){
                passengers[train][j] = passengers[train][j - 1];
              }
              passengers[train][0] = false;
              break;
          case 4:
              train = Integer.parseInt(st.nextToken()) - 1;
              for(int j = 0; j < 19; j++){
                passengers[train][j] = passengers[train][j + 1];
              }
              passengers[train][19] = false;
              break;
      }
    }

    for (int i = 0; i < N; i++) {
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < 20; j++) {
        sb.append(passengers[i][j] ? "1" : "0");
      }
      set.add(sb.toString());
    }


    System.out.println(set.size());

  }

  public static List<Boolean> toList(boolean[] arr){
    List<Boolean> list = new ArrayList<>();
    for(boolean b : arr){
      list.add(b);
    }
    return list;
  }
}