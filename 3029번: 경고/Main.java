/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 3029                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/3029                           #+#        #+#      #+#    */
/*   Solved: 2025/07/04 16:10:11 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String start = sc.next();
    String end = sc.next();

    long totalSeconds = calculateTotalSeconds(start, end);

    long waitHours = totalSeconds / 60 / 60;
    totalSeconds = totalSeconds % (60 * 60);

    long waitMinutes = totalSeconds / 60;
    totalSeconds = totalSeconds % 60;

    long waitSeconds = totalSeconds;

    System.out.printf("%02d:%02d:%02d", waitHours, waitMinutes, waitSeconds);
  }

  public static long calculateTotalSeconds(String start, String end){
    String[] s = start.split(":");
    String[] e = end.split(":");
    
    long startTotal = Long.parseLong(s[0]) * 3600 + Long.parseLong(s[1]) * 60 + Long.parseLong(s[2]);
    long endTotal = Long.parseLong(e[0]) * 3600 + Long.parseLong(e[1]) * 60 + Long.parseLong(e[2]);

    long diffSeconds = endTotal - startTotal;

    if (diffSeconds <= 0) {
      diffSeconds += 24 * 3600;
    }

    return diffSeconds;
  }
}