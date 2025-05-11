
import java.util.Scanner;

/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 22858                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/22858                          #+#        #+#      #+#    */
/*   Solved: 2025/07/21 11:56:32 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

public class Main{

  static int N;
  static int K;

  static int[] S;
  static int[] D;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();
    K = sc.nextInt();

    S = new int[N];
    D = new int[N];

    for (int i = 0; i < N; i++) {
      S[i] = sc.nextInt();
    }

    for (int i = 0; i < N; i++) {
      D[i] = sc.nextInt();
    }

    for (int i = 0; i < K; i++) {
      unshuffle();   
    }

    for (int i = 0; i < N; i++) {
      System.out.print(S[i] + " ");   
    }

  }

  public static void unshuffle(){
    int[] temp = new int[N];
    for (int i = 0; i < N; i++) {
      temp[D[i] - 1] = S[i];
    }

    S = temp;
  }
}