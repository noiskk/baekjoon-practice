/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 17609                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/17609                          #+#        #+#      #+#    */
/*   Solved: 2025/07/18 10:52:00 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for(int i = 0; i < N; i++){
      String str = sc.next();

      System.out.println(isPalindrome(str, 0, str.length() - 1));

      
    }
  }

  public static int isPalindrome(String str, int left, int right){

    // ababa
    // summuus

    while(left < right){
      if(str.charAt(left) != str.charAt(right)){
        if(isSimilarPalindrome(str, left + 1, right) || isSimilarPalindrome(str, left, right - 1)){
          return 1;
        } else {
          return 2;
        }

      }
      left++;
      right--;
    }
      
    return 0;

  }

  public static boolean isSimilarPalindrome(String str, int left, int right){

    while(left < right){
      if(str.charAt(left++) != str.charAt(right--)) return false;
    }

    return true;
  }
}