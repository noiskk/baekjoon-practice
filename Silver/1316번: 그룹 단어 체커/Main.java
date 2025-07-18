/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1316                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1316                           #+#        #+#      #+#    */
/*   Solved: 2025/07/16 11:24:52 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */


// 그룹 단어 : 앞에서 나온 단어가 뒤에 또 나오면 안됨. 무조건 연속해서 나와야 함. 

import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt(); 
    int count = 0;
    
    for (int i = 0; i < N; i++) {
      String str = sc.next();
      if(isGroup(str)) count++;
    }

    System.out.println(count);

  }

  public static boolean isGroup(String str){

    Set<Character> set = new HashSet<>();

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);

      if(!set.contains(c)){ // 새로운 글자
        set.add(c);
      } else if(i > 0 && c != str.charAt(i - 1)){
        // 이미 있는 글자인데 바로 앞 글자랑 다르면
        return false;
      }
    }
    
    return true;
  }
}