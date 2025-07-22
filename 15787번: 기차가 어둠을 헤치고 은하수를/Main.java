import java.io.*;
import java.util.*;

public class Main{
  static boolean[][] trains;
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken()); // 기차 수
    trains = new boolean[N][20]; // 기차 좌석
    int M = Integer.parseInt(st.nextToken()); // 명령 수

    // 명령어 수행
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int command = Integer.parseInt(st.nextToken());
      int train = Integer.parseInt(st.nextToken()) - 1;

      switch (command) {
        case 1: // 승차
          int seat = Integer.parseInt(st.nextToken()) - 1;
          trains[train][seat] = true;
          break;
        case 2: // 하차
          seat = Integer.parseInt(st.nextToken());
          trains[train][seat] = false;
          break;
        case 3:
          // 한칸씩 뒤로 밀기
          for (int j = 19; j > 0; j--) {
            trains[train][j] = trains[train][j - 1];
          }
          trains[train][0] = false;
          break;
        case 4:
          // 한칸식 앞으로 밀기
          for (int j = 0; j < 19; j++) {
            trains[train][j] = trains[train][j + 1];
          }
          trains[train][19] = false;
          break;
      }
    
    }

    // 건널 수 있는 기차 확인
    Set<String> set = new HashSet<>();
    for (int i = 0; i < N; i++) {
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < 20; j++) {

        sb.append(trains[i][j] ? "1" : "0");
      }
      set.add(sb.toString());
    }
    System.out.println(set.size());
  }

}