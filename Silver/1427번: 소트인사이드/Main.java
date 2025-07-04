/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1427                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1427                           #+#        #+#      #+#    */
/*   Solved: 2025/06/21 23:45:57 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    // 선택 정렬로 구현해보기
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    int[] arr = new int[input.length()];
    
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(input.substring(i, i + 1));
    }
    
    for(int i = 0; i < arr.length - 1; i++){
      int maxIdx = i;

      for(int j = i + 1; j < arr.length; j++){
        if(arr[maxIdx] < arr[j]){
          maxIdx = j;
        }
      }

      int temp = arr[maxIdx];
      arr[maxIdx] = arr[i];
      arr[i] = temp;
    }

    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i]);
    }

  }
}