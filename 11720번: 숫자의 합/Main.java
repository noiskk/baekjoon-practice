/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11720                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11720                          #+#        #+#      #+#    */
/*   Solved: 2025/06/17 17:50:04 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        
        long result = 0;
        
        for(int i = 0; i < N; i++){
            result += cNum[i] - '0';
        }
            
        System.out.println(result);
    }
}