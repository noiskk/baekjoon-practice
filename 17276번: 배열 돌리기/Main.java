/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 17276                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/17276                          #+#        #+#      #+#    */
/*   Solved: 2025/07/22 15:29:53 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

/*
 * 일단 배열에 저장
 * 
 * 옮겨야 되는 좌표인지 확인하고
 * 각도 x 중앙에서 떨어진 정도 계산 -> 새로운 배열에 저장
 */

import java.util.*;

public class Main{

  static int[][] arr;
  static int[][] newArr;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int testcase = sc.nextInt();

    for (int t = 0; t < testcase; t++) {
      int arrSize = sc.nextInt();
      int degree = sc.nextInt();

      arr = new int[arrSize][arrSize];
      newArr = new int[arrSize][arrSize];

      for (int i = 0; i < arrSize; i++) {
        for (int j = 0; j < arrSize; j++) {
            arr[i][j] = sc.nextInt();
        }
      }

      for (int i = 0; i < arrSize; i++) {
        newArr[i] = arr[i].clone();   
      }


      /*
       * degree = -45 --> 7
       * degree = 90 --> 2
       * 
       * degree + 360
       */

      int time = (degree + 360) % 360 / 45;

      for (int i = 0; i < time; i++) {
        rotate(arrSize);
      }


      for (int i = 0; i < arrSize; i++) {
        for (int j = 0; j < arrSize; j++) {
          System.out.print(newArr[i][j] + " ");
        }
        if(!(t == testcase - 1 && i == arrSize - 1)) System.out.println();
      }
    }

    


  }

  public static void rotate(int size){
    int half = size / 2;
    for (int i = 0; i < size; i++) {
      newArr[i][i] = arr[half][i];
      newArr[i][half] = arr[i][i];
      newArr[i][size - i - 1] = arr[i][half];
      newArr[half][size - i - 1]  = arr[i][size - i - 1]; 
    }

    for (int i = 0; i < size; i++) {
      arr[i] = newArr[i].clone();   
    }

  }
}