/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 5597                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/5597                           #+#        #+#      #+#    */
/*   Solved: 2025/07/04 14:30:17 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Set<Integer> set = new TreeSet<>();

    for (int i = 1; i <= 30; i++) {
      set.add(i);   
    }

    for (int i = 0; i < 28; i++) {
      set.remove(sc.nextInt());
    }

    for(int num : set){
      System.out.println(num);
    }

  }
}