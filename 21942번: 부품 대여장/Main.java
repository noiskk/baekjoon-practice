/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 21942                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: zionzion00 <boj.kr/u/zionzion00>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/21942                          #+#        #+#      #+#    */
/*   Solved: 2025/07/03 21:58:33 by zionzion00    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main{

  static int[] daysOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    String L = st.nextToken(); // 대여할 수 있는 기간
    long rentalLimitMinutes = rentalPeriodToMinutes(L); // 대여기간 분으로 환산

    int F = Integer.parseInt(st.nextToken()); // 1분당 벌금

    Map<String, Long> rentals = new HashMap<>(); // 유저명_부품명 : 대여 시간
    Map<String, Long> fines = new TreeMap<>();   // 유저명 : 벌금


    // 부품 종류가 여러 개
    // 각각 개수도 여러 개
    // 한 사람이 같은 거 여러 개 못 빌림. 

    for(int i = 0; i < N; i++){
      st = new StringTokenizer(br.readLine());
      String date = st.nextToken();
      String time = st.nextToken();
      String partName = st.nextToken();
      String userName = st.nextToken();

      long currentMinutes = timeToMinutes(date + " " + time);
      String rentalKey = userName + " " + partName;

      if(rentals.containsKey(rentalKey)){ // 반납 처리
        long rentalStartTime = rentals.get(rentalKey);
        rentals.remove(rentalKey);

        long rentalDuration = currentMinutes - rentalStartTime;
        if(rentalDuration > rentalLimitMinutes){ // 벌금 부과
          long fine = (rentalDuration - rentalLimitMinutes) * F;
          fines.put(userName, fines.getOrDefault(userName, 0L) + fine);
        }

      } else { // 대여 처리
        rentals.put(rentalKey, currentMinutes);
      }
    }

    // 결과 출력
    if(fines.isEmpty()){
      System.out.println(-1);
    } else {
      StringBuilder sb = new StringBuilder();
      for(Map.Entry<String, Long> entry : fines.entrySet()){
        sb.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
      }
      System.out.println(sb);
    }

  }

  public static long rentalPeriodToMinutes(String rentalPeriodStr){
    String[] a = rentalPeriodStr.split("/");
    int days = Integer.parseInt(a[0]);
    
    String[] b = a[1].split(":");
    int hours = Integer.parseInt(b[0]);
    int minutes = Integer.parseInt(b[1]);

    return (long)days * 24 * 60 + (long)hours * 60 + minutes;
  }


  public static long timeToMinutes(String dateTiemStr){
    // 공백을 기준으로 날짜와 시간 분리
    String[] parts = dateTiemStr.split(" ");
    String datePart = parts[0];
    String timePart = parts[1];

    // "-" 를 기준으로 날짜 분리
    String[] dateTokens = datePart.split("-");
    int month = Integer.parseInt(dateTokens[1]);
    int day = Integer.parseInt(dateTokens[2]);

    // ":" 를 기준으로 시간 분리
    String[] timeTokens = timePart.split(":");
    int hour = Integer.parseInt(timeTokens[0]);
    int minute = Integer.parseInt(timeTokens[1]);

    long totalMinutes = 0;

    // month 를 분으로 변환
    for (int i = 1; i < month; i++) {
      totalMinutes += daysOfMonth[i] * 24 * 60;   
    }

    // day 를 분으로 변환
    totalMinutes += (day - 1) * 24 * 60;

    // hour 를 분으로 변환
    totalMinutes += hour * 60;

    // minute 더하기
    totalMinutes += minute;

    return totalMinutes;
  }
}