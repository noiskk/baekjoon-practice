/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 4358                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/4358                           #+#        #+#      #+#    */
/*   Solved: 2025/07/02 12:44:51 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    Map<String, Integer> map = new TreeMap<>();

    String input;
    int count = 0;
    while((input = br.readLine()) != null){
      map.put(input, map.getOrDefault(input, 0) + 1);
      count++;
    }

    for(Map.Entry<String, Integer> entry : map.entrySet()){
      sb.append(entry.getKey()).append(" ").append(String.format("%.4f", (float)entry.getValue() / count * 100)).append("\n");
    }

    System.out.println(sb);

  }
}