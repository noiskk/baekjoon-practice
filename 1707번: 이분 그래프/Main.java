/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1707                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1707                           #+#        #+#      #+#    */
/*   Solved: 2025/06/25 13:13:39 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;
import java.io.*;

public class Main{
  static ArrayList<Integer>[] A;
  static int[] check;
  static boolean[] visited;
  static boolean isEven;

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

    for (int t = 0; t < testCase; t++) {
      String[] s = br.readLine().split(" ");
      
      int V = Integer.parseInt(s[0]); // 정점의 개수
      int E = Integer.parseInt(s[1]); // 간선의 개수
  
      A = new ArrayList[V + 1];
      visited = new boolean[V + 1];
      check = new int[V + 1];
      isEven = true;

      for(int i = 1; i <= V; i++){
        A[i] = new ArrayList<Integer>();
      }
  
      // 그래프 저장
      for (int i = 1; i <= E; i++) {
        s = br.readLine().split(" ");
        int start = Integer.parseInt(s[0]);
        int end = Integer.parseInt(s[1]);
  
        A[start].add(end);
        A[end].add(start);
      }
  
      // 이분 그래프 판별
      // 모든 노드에서 DFS 실행
      for (int i = 1; i < V; i++) {
        if(isEven){
          DFS(i);
        } else {
          break;
        }
      }

      // 결과 출력
      if(isEven){
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }

  private static void DFS(int start){
    visited[start] = true;
    for(int i : A[start]){
      if(!visited[i]){
        check[i] = (check[start] + 1) % 2;
        DFS(i);
      } else if (check[i] == check[start]) {
        isEven = false;
      }
    }

  }
}