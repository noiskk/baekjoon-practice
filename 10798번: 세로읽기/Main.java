/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10798                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10798                          #+#        #+#      #+#    */
/*   Solved: 2025/07/15 11:20:58 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    char[][] words = new char[5][15];

    for (int i = 0; i < 5; i++) {
      String line = br.readLine();
      for (int j = 0; j < line.length(); j++) {
        words[i][j] = line.charAt(j);
      }
    }

    for (int i = 0; i < 15; i++) {
      for (int j = 0; j < 5; j++) {
        if(words[j][i] != 0){
          sb.append(words[j][i]);
        }
      }
    }

    System.out.println(sb);
    
  }
}