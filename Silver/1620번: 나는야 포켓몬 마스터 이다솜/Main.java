/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1620                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1620                           #+#        #+#      #+#    */
/*   Solved: 2025/07/02 10:20:19 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    // 도감 작성
    // 번호 - 이름
    String[] strArr = new String[N + 1];
    // 이름 - 번호
    Map<String, Integer> map = new HashMap<>();

    for (int i = 1; i <= N; i++) {
      String name = br.readLine();
      strArr[i] = name;
      map.put(name, i);
    }

    // 문제 풀이
    for (int i = 0; i < M; i++) {
      String input = br.readLine();

      if(input.matches("\\d+")){
        // 입력이 숫자이면
        int num = Integer.parseInt(input);
        sb.append(strArr[num]).append("\n");
      } else {
        // 입력이 문자이면
        sb.append(map.get(input)).append("\n");
      }
    }

    System.out.println(sb);

  }
}