/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 5618                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/5618                           #+#        #+#      #+#    */
/*   Solved: 2025/07/03 13:47:05 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] arr = new int[n];
    
    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }

    int finalGCD;
    if(arr.length == 2){
      finalGCD = gcd(arr[0], arr[1]);
    } else {
      finalGCD = gcd(gcd(arr[0], arr[1]),arr[2]);
    }

    Set<Integer> set = new HashSet<>();

    for(int i = 1; i * i <= finalGCD; i++){
      if(finalGCD % i == 0){
        set.add(i);
        set.add(finalGCD / i);
      }
    }

    List<Integer> sortedList = new ArrayList<>(set);
    Collections.sort(sortedList);

    for(int i : sortedList){
      System.out.println(i);
    }

  }

  static int gcd(int a, int b){
    return b == 0 ? a : gcd(b, a % b);
  }
}