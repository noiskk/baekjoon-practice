/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1181                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1181                           #+#        #+#      #+#    */
/*   Solved: 2025/07/16 10:39:44 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    TreeSet<String> set = new TreeSet<>();

    for (int i = 0; i < N; i++) {
      set.add(sc.next());
    }

    ArrayList<String> list = new ArrayList<>(set);

    list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

    for(String s : list){
      System.out.println(s);
    }
  }
}