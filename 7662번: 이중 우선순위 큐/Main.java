/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 7662                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/7662                           #+#        #+#      #+#    */
/*   Solved: 2025/07/02 13:17:45 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */


// 이중 우선순위 큐. 
// deque 사용하고 입력할 때 정렬해서 입력하는 로직 작성 -> 시간초과. 입력이 O(N) 이라서


import java.io.*;
import java.util.*;

public class Main{

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    TreeMap<Integer, Integer> map;
    int T = Integer.parseInt(br.readLine());

    for(int t = 0; t < T; t++){
      map = new TreeMap<>();
      int k = Integer.parseInt(br.readLine());
      
      for (int i = 0; i < k; i++) {
        st = new StringTokenizer(br.readLine());
        char c = st.nextToken().charAt(0);
        int num = Integer.parseInt(st.nextToken());

        if(c == 'I'){
          map.put(num, map.getOrDefault(num, 0) + 1);
        } else if(!map.isEmpty()){
          // c == 'D'
          if(num == -1){
            int min = map.firstKey();
            map.put(min, map.get(min) - 1);
            if(map.get(min) == 0){
              map.remove(min);
            }
          } else if(num == 1){
            int max = map.lastKey();
            map.put(max, map.get(max) - 1);
            if(map.get(max) == 0){
              map.remove(max);
            }
          }
        }
      }

      if(map.isEmpty()){
        System.out.println("EMPTY");
      } else {
        System.out.println(map.lastKey() + " " + map.firstKey());
      }

    }
  }
  
}