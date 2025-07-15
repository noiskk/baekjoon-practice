/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1244                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1244                           #+#        #+#      #+#    */
/*   Solved: 2025/07/10 10:19:13 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

// 남학생: 받은 수의 배수 번호 스위치 조작
// 여학생: 받은 수의 스위치 중심으로 좌우 대칭 확인 후 스위치 조작

import java.io.*;
import java.util.*;

public class Main{

  static boolean[] switches;

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int numberOfSwithes = Integer.parseInt(br.readLine());
    switches = new boolean[numberOfSwithes];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < numberOfSwithes; i++) {
      switches[i] = st.nextToken().equals("1");  
    }

    int numberOfStudents = Integer.parseInt(br.readLine());
    
    for(int i = 0; i < numberOfStudents; i++){
      st = new StringTokenizer(br.readLine());
      int student = Integer.parseInt(st.nextToken());
      if(student == 1){
        // 남학생 버전
        int index = Integer.parseInt(st.nextToken());
        maleStudent(index);
      } else if(student == 2){
        // 여학생 버전
        int index = Integer.parseInt(st.nextToken());
        femaleStudent(index);
      }
    }

    StringBuilder sb = new StringBuilder();
    
    for (int i = 0; i < numberOfSwithes; i++) {
      sb.append(switches[i] ? 1 : 0).append(" ");
      if((i + 1) % 20 == 0){
        sb.append("\n");
      }
    }
    System.out.println(sb);
    

  }

  public static void maleStudent(int index){
    for(int i = index - 1; i < switches.length; i += index){
      switches[i] = !switches[i];
    }
  }

  public static void femaleStudent(int index){
    index--;
    switches[index] = !switches[index];

    int i = 1;
    while(index - i >= 0 && index + i < switches.length){
      if(switches[index - i] == switches[index + i]){
        switches[index - i] = !switches[index - i];
        switches[index + i] = !switches[index + i];
        i++;
      } else {
        break;
      }
    }
  }
}