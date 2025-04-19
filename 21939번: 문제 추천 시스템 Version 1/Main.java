import java.io.*;
import java.util.*;

public class Main{
  static TreeMap<Integer, TreeSet<Integer>> sortedProblems; // 난이도 - 문제번호
  static Map<Integer, Integer> map; // 문제번호 - 난이도
  static TreeSet<Integer> problemSet;
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int N = Integer.parseInt(br.readLine()); // 문제 개수

    sortedProblems = new TreeMap<>();
    map = new HashMap<>(); 

    // 문제 리스트 추가
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int problem = Integer.parseInt(st.nextToken());
      int level = Integer.parseInt(st.nextToken());

      add(problem, level);
    }

    int M = Integer.parseInt(br.readLine()); // 명령 개수

    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      String cmd = st.nextToken();
        switch (cmd) {
          case "add":
            int problem = Integer.parseInt(st.nextToken());
            int level = Integer.parseInt(st.nextToken());
            add(problem, level);
            break;

          case "recommend":
            if(st.nextToken().equals("1")){
              System.out.println(sortedProblems.get(sortedProblems.lastKey()).last());
            } else {
              System.out.println(sortedProblems.get(sortedProblems.firstKey()).first());
            }
            break;

          case "solved":
            int solvedProblem = Integer.parseInt(st.nextToken());
            int solvedLevel = map.get(solvedProblem);

            TreeSet<Integer> problemsAtLevel = sortedProblems.get(solvedLevel);

            problemsAtLevel.remove(solvedProblem);

            if (problemsAtLevel.isEmpty()) {
              sortedProblems.remove(solvedLevel);
            }

            map.remove(solvedProblem);
            break;
        }
    }
  }

  static void add(int problem, int level){
    problemSet = sortedProblems.get(level);

      if(sortedProblems.containsKey(level)){
        problemSet.add(problem);
      } else {
        problemSet = new TreeSet<>();
        problemSet.add(problem);
      }

      sortedProblems.put(level, problemSet);
      map.put(problem, level);
  }
}