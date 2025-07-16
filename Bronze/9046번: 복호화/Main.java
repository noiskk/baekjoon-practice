/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 9046                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/9046                           #+#        #+#      #+#    */
/*   Solved: 2025/07/15 10:01:22 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int T = Integer.parseInt(sc.nextLine());


    for (int i = 0; i < T; i++) {
      int[] count = new int[26];

      for(char c : sc.nextLine().toCharArray()){
        if(c != ' '){
          count[c - 'a']++;
        }
      }

      int max = 0;
      int sameChar = 0;
      int maxIndex = -1;

      for(int j = 0; j < 26; j++){
        if(count[j] > max){
          sameChar = 0;
          max = count[j];
          maxIndex = j;
        } else if(count[j] == max){
          sameChar++;
        }
      }

      if(sameChar == 0){
        System.out.println((char)(maxIndex + 'a'));
      } else {
        System.out.println('?');
      }
      
    }

  }
}