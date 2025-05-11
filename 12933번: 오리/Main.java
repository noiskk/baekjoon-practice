/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 12933                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/12933                          #+#        #+#      #+#    */
/*   Solved: 2025/07/21 16:02:05 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */


import java.util.*;

public class Main{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String input = sc.next();

    int[] quack = new int[4]; // q, u, a, c

    int activeDucks = 0, maxDucks = 0;

    for(char ch : input.toCharArray()){
      switch (ch) {
        case 'q':
          quack[0]++;
          activeDucks++;
          if(activeDucks > maxDucks) maxDucks = activeDucks;
          break;
        
        case 'u':
          if(quack[0] > 0){ // q 가 존재
            quack[0]--;
            quack[1]++;
          } else {
            System.out.println(-1);
            return;
          }
          break;

        case 'a':
          if(quack[1] > 0){ // u 가 존재
            quack[1]--;
            quack[2]++;
          } else {
            System.out.println(-1);
            return;
          }
          break;

        case 'c':
          if(quack[2] > 0){ // a 가 존재
            quack[2]--;
            quack[3]++;
          } else {
            System.out.println(-1);
            return;
          }
          break;

        case 'k':
          if(quack[3] > 0){ // c 가 존재
            quack[3]--;
            activeDucks--;
          } else {
            System.out.println(-1);
            return;
          }
          break;

      }

    }


    if(activeDucks != 0 || maxDucks == 0){
      System.out.println(-1);
    } else {
      System.out.println(maxDucks);
    }
  }
}