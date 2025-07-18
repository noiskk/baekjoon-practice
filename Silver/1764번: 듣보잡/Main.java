/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1764                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1764                           #+#        #+#      #+#    */
/*   Solved: 2025/07/16 11:48:48 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();

    Set<String> hashSet = new HashSet<>();
    Set<String> treeSet = new TreeSet<>();

    for (int i = 0; i < N; i++) {
      hashSet.add(sc.next());
    }

    for (int i = 0; i < M; i++) {
      String s = sc.next();
      if(hashSet.contains(s)){
        treeSet.add(s);
      }
    }

    System.out.println(treeSet.size());
    for(String s : treeSet){
      System.out.println(s);
    }

  }
}