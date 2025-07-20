/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1966                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1966                           #+#        #+#      #+#    */
/*   Solved: 2025/06/26 19:14:17 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main{

  static class Document{
    int index;
    int priority;

    public Document(int index, int priority) {
      this.index = index;
      this.priority = priority;
    }
    
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());

      Queue<Document> queue = new LinkedList<>();

      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        int priority = Integer.parseInt(st.nextToken());
        queue.add(new Document(j, priority));
      }
      
      int printCount = 0;

      while(!queue.isEmpty()){

        Document current = queue.poll();
        boolean isPrintable = true;

        for(Document doc : queue){
          if(current.priority < doc.priority){
            isPrintable = false;
            break;
          }
        }

        if(isPrintable){
          printCount++;
          if(current.index == M){
            sb.append(printCount).append("\n");
            break; // while 문 break
          }
        } else {
          queue.offer(current);
        }

      }

    }
    
    System.out.println(sb.toString());
  }
}