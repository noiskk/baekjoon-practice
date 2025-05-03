/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 20436                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/20436                          #+#        #+#      #+#    */
/*   Solved: 2025/07/10 21:52:21 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

// 자판 그대로 배열에 저장?
// 배열 말고 Map 이용?

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Map<Character, int[]> map = new HashMap<>();

    char[] line1 = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
    char[] line2 = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
    char[] line3 = {'z', 'x', 'c', 'v', 'b', 'n', 'm'};
    char[][] rows = {line1, line2, line3};

    for (int i = 0; i < rows.length; i++) {
      for (int j = 0; j < rows[i].length; j++) {
        map.put(rows[i][j], new int[]{i, j});
      }
    }

    Set<Character> left_hand = new HashSet<>();
    char[] arr = {'q', 'w', 'e', 'r', 't', 'a', 's', 'd', 'f', 'g', 'z', 'x', 'c', 'v'};
    
    for(char c : arr){
      left_hand.add(c);
    }

    char left = sc.next().charAt(0);
    char right = sc.next().charAt(0);

    int[] currentLeft = map.get(left);
    int[] currentRight = map.get(right);

    char[] word = sc.next().toCharArray();

    int time = word.length;

    for(char c : word){
      if(left_hand.contains(c)){
        int[] dest = map.get(c);
        int x = dest[0] - currentLeft[0];
        int y = dest[1] - currentLeft[1];
        currentLeft = dest;

        int distance = Math.abs(x) + Math.abs(y);
        time += distance;
      } else {
        int[] dest = map.get(c);
        int x = dest[0] - currentRight[0];
        int y = dest[1] - currentRight[1];
        currentRight = dest;

        int distance = Math.abs(x) + Math.abs(y);
        time += distance;
      }
    }

    System.out.println(time);


  }
}
