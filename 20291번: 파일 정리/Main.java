/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 20291                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/20291                          #+#        #+#      #+#    */
/*   Solved: 2025/07/17 10:42:08 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    TreeMap<String, Integer> treeMap = new TreeMap<>();

    for (int i = 0; i < N; i++) {
      String[] file = sc.next().split("\\.");
      String extension = file[1];
      treeMap.put(extension, treeMap.getOrDefault(extension, 0) + 1);
    }

    for(Map.Entry<String, Integer> entry : treeMap.entrySet()){
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }
}