/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 14467                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/14467                          #+#        #+#      #+#    */
/*   Solved: 2025/07/04 15:27:58 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    Map<Integer, Integer> map = new HashMap<>();

    int count = 0;

    for (int i = 0; i < N; i++) {
      int cow = sc.nextInt();
      int position = sc.nextInt();
      if(map.containsKey(cow)){
        if(map.get(cow) != position){
          count++;
          map.put(cow, position);
        }
      } else {
        map.put(cow, position);
      }
    }

    System.out.println(count);
  }
}