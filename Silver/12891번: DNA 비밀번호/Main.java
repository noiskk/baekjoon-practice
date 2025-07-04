/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 12891                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/12891                          #+#        #+#      #+#    */
/*   Solved: 2025/06/19 13:32:16 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;
import java.io.*;

public class Main{

  static int[] myArr;
  static int[] checkArr;
  static int checkSecret;


  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int S = Integer.parseInt(st.nextToken());
    int P = Integer.parseInt(st.nextToken());
    int result = 0;
    checkArr = new int[4];
    myArr = new int[4];
    char[] A = new char[S];
    checkSecret = 0;

    // 문자열 저장
    A = br.readLine().toCharArray();

    // 비밀번호 조건 저장
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < 4; i++){
      checkArr[i] = Integer.parseInt(st.nextToken());
      if(checkArr[i] == 0){
        checkSecret++;
      }
    }

    // 부분 문자열 처음 받을 때 세팅
    for(int i = 0; i < P; i++){
      Add(A[i]);
    }

    if(checkSecret == 4) result++;


    // 슬라이딩 윈도우
    for(int i = P; i < S; i++){
      int j = i - P;
      Add(A[i]);
      Remove(A[j]);
      if(checkSecret == 4) result++;
    }
    
    System.out.print(result);
    br.close();
  }

  private static void Add(char c){
    switch (c) {
      case 'A':
        myArr[0]++;
        if(myArr[0] == checkArr[0]) checkSecret++;
        break;
      case 'C':
        myArr[1]++;
        if(myArr[1] == checkArr[1]) checkSecret++;
        break;
      case 'G':
        myArr[2]++;
        if(myArr[2] == checkArr[2]) checkSecret++;
        break;
      case 'T':
        myArr[3]++;
        if(myArr[3] == checkArr[3]) checkSecret++;
        break;
    }
  }

  private static void Remove(char c){
    switch (c) {
      case 'A':
        if(myArr[0] == checkArr[0]) checkSecret--;
        myArr[0]--;
        break;
      case 'C':
        if(myArr[1] == checkArr[1]) checkSecret--;
        myArr[1]--;
        break;
      case 'G':
        if(myArr[2] == checkArr[2]) checkSecret--;
        myArr[2]--;
        break;
      case 'T':
        if(myArr[3] == checkArr[3]) checkSecret--;
        myArr[3]--;
        break;
    }
  }


}