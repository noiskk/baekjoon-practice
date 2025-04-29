/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11365                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11365                          #+#        #+#      #+#    */
/*   Solved: 2025/07/04 17:01:48 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb;

    String s = br.readLine();
    while(!s.equals("END")){
      sb = new StringBuilder();
      sb.append(s).reverse();
      System.out.println(sb);
      s = br.readLine();
    }
  }
}