/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1546                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1546                           #+#        #+#      #+#    */
/*   Solved: 2025/06/17 17:58:28 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test_num = sc.nextInt(); // N <= 1000
        float[] score = new float[test_num];
        float max = 0;
        float avg = 0;

        // 배열에 전체 과목 점수 입력
        for(int i = 0; i < test_num; i++){
            score[i] = sc.nextFloat();

            // 최고점 구하기
            if(score[i] > max) max = score[i];
        }

        // 새로운 점수
        for(int i = 0; i < test_num; i++){
          // float 으로 들어가야함. 
          score[i] = score[i] / max * 100;
          avg += score[i];
        }

        // 새로운 평균
        avg /= test_num;

        System.out.println(avg);
    }
}