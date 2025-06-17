/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11659                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11659                          #+#        #+#      #+#    */
/*   Solved: 2025/06/17 22:15:40 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */


import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        // 들어오는 데이터가 100,000 개 정도로 많다. 
        // 이럴때는 scanner 보다 BufferedReader 를 사용하는게 좋다.   
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 줄에 값이 많이 들어오는 경우에는 int 형으로 받는 것보다 StringTokenizer 를 사용하는게 좋다. 
        StringTokenizer st = new StringTokenizer(br.readLine()); // 이건 딱 한 줄만 읽는 용

        Scanner sc = new Scanner(System.in); 

        int suNo = Integer.parseInt(st.nextToken()); // 수의 개수 N
        int quizNo = Integer.parseInt(st.nextToken()); // 합을 구해야 하는 횟수 M

        long[] S = new long[suNo + 1]; // 합 배열 (0번째 Index 무시하려고 suNo + 1)

        st = new StringTokenizer(br.readLine()); // 한 줄 읽기


        for(int i = 1; i <= suNo; i++){
          // 합 배열 만들기
          S[i] = S[i - 1] + Integer.parseInt(st.nextToken());;
        }

        for(int i = 0; i < quizNo; i++){
          st = new StringTokenizer(br.readLine()); // 한 줄 읽기

          int start = Integer.parseInt(st.nextToken());
          int end = Integer.parseInt(st.nextToken());

          System.out.println(S[end] - S[start - 1]);
        }

    }
}