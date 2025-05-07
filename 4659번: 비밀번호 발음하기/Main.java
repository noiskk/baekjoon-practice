/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 4659                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/4659                           #+#        #+#      #+#    */
/*   Solved: 2025/07/16 11:00:14 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */


import java.util.*;



public class Main{

  static Set<Character> vowelSet;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();

    vowelSet = new HashSet<>();
    vowelSet.add('a');
    vowelSet.add('e');
    vowelSet.add('i');
    vowelSet.add('o');
    vowelSet.add('u');

    while(!str.equals("end")){

      if(isValid(str)){
        System.out.println("<" + str + "> is acceptable.");
      } else {
        System.out.println("<" + str + "> is not acceptable.");
      }



      str = sc.nextLine();
    }
  }

  public static boolean isValid(String str){

    int vowelCount = 0; // 모음 
    int consonantCount = 0; // 자음
    boolean hasVowel = false;

    for (int i = 0; i < str.length(); i++) {
      if(vowelSet.contains(str.charAt(i))){
        hasVowel = true;
        vowelCount++;
        consonantCount = 0;
      } else {
        consonantCount++;
        vowelCount = 0;
      }

      if(vowelCount >= 3 || consonantCount >= 3){
        return false;
      }

      if(i > 0 && str.charAt(i) == str.charAt(i - 1)){
        if(str.charAt(i) != 'e' && str.charAt(i) != 'o')
          return false;
      }

    }

    if(!hasVowel) return false;

    return true;
  }
}