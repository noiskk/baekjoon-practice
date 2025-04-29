/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 16916                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/16916                          #+#        #+#      #+#    */
/*   Solved: 2025/07/04 20:34:11 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String S = br.readLine();
    String P = br.readLine();

    System.out.println(kmp(S, P));

  }

  static int kmp(String parent, String pattern){
    int[] pi = getPi(pattern);
    int n = parent.length();
    int m = pattern.length();
    int j = 0; // 패턴 포인터

    // i: 본문 포인터
    for (int i = 0; i < n; i++) {
      while(j > 0 && parent.charAt(i) != pattern.charAt(j)){
        j = pi[j - 1];
      }

      if(parent.charAt(i) == pattern.charAt(j)){
        if(j == m - 1){ // 검색 성공
          return 1;
        } else { // 다음 문자 비교
          j++;
        }
      }
    }

    return 0;
  }
  

  /*
   * pi[] 배열 생성
   */
  static int[] getPi(String pattern){
    int m = pattern.length();
    int[] pi = new int[m];
    int j = 0; // 접두사 포인터

    // i: 접미사 포인터
    for (int i = 1; i < m; i++) {
      while(j > 0 && pattern.charAt(i) != pattern.charAt(j)){
        j = pi[j - 1];
      }

      if(pattern.charAt(i) == pattern.charAt(j)){
        pi[i] = ++j;
      }
    }

    return pi;
  }
}