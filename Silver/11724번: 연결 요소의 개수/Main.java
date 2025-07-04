/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11724                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11724                          #+#        #+#      #+#    */
/*   Solved: 2025/06/23 14:14:39 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main{

  static boolean[] visited;
  static ArrayList<Integer>[] A;
  static int count;
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    A = new ArrayList[N];
    visited = new boolean[N];

    for (int i = 0; i < N; i++) {
      A[i] = new ArrayList<>();
    }

    for(int i = 0; i < M; i++){
      st = new StringTokenizer(br.readLine());
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());
      A[start - 1].add(end - 1);
      A[end - 1].add(start - 1);
    }

    count = 0;

    for (int i = 0; i < N; i++) {
      if(!visited[i]){
        DFS(i);
        count++;
      }
    }

    System.out.println(count);
  }

  private static void DFS(int v){
    if(visited[v]) return;

    visited[v] = true;
    for(int i : A[v]){
      if(!visited[i]){
        DFS(i);
      }
    }
  }
}