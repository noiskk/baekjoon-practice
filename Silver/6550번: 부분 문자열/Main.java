/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 6550                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/6550                           #+#        #+#      #+#    */
/*   Solved: 2025/07/16 10:17:50 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    String s = br.readLine();
    while(s != null){
      st = new StringTokenizer(s);
      String subSequence = st.nextToken();
      String sequence = st.nextToken();

      int sub_i = 0;
      for (int i = 0; i < sequence.length(); i++) {
        if(sequence.charAt(i) == subSequence.charAt(sub_i)){
          sub_i++;
        }
        if(sub_i == subSequence.length()) break;
      }

      if(sub_i == subSequence.length()){
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }

      s = br.readLine();
    }
  }
}