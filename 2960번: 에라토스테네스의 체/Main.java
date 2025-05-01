/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2960                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2960                           #+#        #+#      #+#    */
/*   Solved: 2025/07/08 11:32:11 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    boolean[] arr = new boolean[N + 1];

    int count = 0;

    for (int i = 2; i < arr.length; i++) {

      // 지우지 않은 가장 작은 수
      if(arr[i] == false){
        // 배수를 크기 순서대로 지움
        for (int j = i; j < arr.length; j += i) {
          if(arr[j] == false){
            arr[j] = true;
            count++;

            if(count == K){
              System.out.println(j);
              return;
            }
          }
        }
      }
    }
  }
}