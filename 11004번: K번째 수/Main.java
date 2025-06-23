/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11004                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11004                          #+#        #+#      #+#    */
/*   Solved: 2025/06/23 11:57:40 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException{
    // 퀵 정렬로 구현해보기
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    int[] arr = new int[N];
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < N; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }

    quickSort(arr, 0, arr.length - 1);

    System.out.println(arr[K - 1]);
  }

  public static void quickSort(int[] arr, int left, int right){
    if(left >= right) return;
    
    int pivot = arr[(left + right) / 2];
    int i = left;
    int j = right;

    // 1, 4, 5, 3, 6, 2, 7

    while(i <= j){
      while(arr[i] < pivot) i++;
      while(arr[j] > pivot) j--;

      if(i <= j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    }

    quickSort(arr, left, j);
    quickSort(arr, i, right);

  }
  
}
