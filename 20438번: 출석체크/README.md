# 20438번: 출석체크 - <img src="https://static.solved.ac/tier_small/9.svg" style="height:20px" /> Silver II

<!-- performance -->

<!-- 문제 제출 후 깃허브에 푸시를 했을 때 제출한 코드의 성능이 입력될 공간입니다.-->

<!-- end -->

## 문제

[문제 링크](https://boj.kr/20438)

<p>코로나 바이러스로 인해 H 대학은 비대면 강의를 실시하고 있다. 조교를 담당하게 된 지환이는 출석체크 방식을 바꾸려고 한다.</p>

<p>학생들은 접속 순서대로 3번부터 N&nbsp;+ 2번까지 입장 번호를 받게 된다.</p>

<p>지환이가 한 학생에게 출석 코드를 보내게 되면, 해당 학생은 본인의 입장 번호의 배수인 학생들에게 출석 코드를 보내어 해당 강의의 출석을 할 수 있게끔 한다.</p>

<p>하지만, K명의 졸고 있는 학생들은 출석 코드를 제출하지 않고, 다른 학생들에게 보내지&nbsp;않는다.</p>

<p>지환이는 무작위로 한 명의 학생에게&nbsp;출석 코드를 보내는 행위를 Q번 반복한 뒤, 출석부 정리를 위해 특정 구간의 입장 번호를 받은 학생들 중에서 출석이 되지 않은 학생들의 수를 구하고 싶다.</p>

<p>많은 인원을 담당해서 바쁜 지환이를 위해 프로그램을 만들어주자!</p>

## 입력

<p>1번째 줄에 학생의 수 N, 졸고 있는 학생의 수 K, 지환이가 출석 코드를 보낼 학생의 수 Q, 주어질 구간의 수 M이&nbsp;주어진다. (1 ≤ K, Q&nbsp;≤ N&nbsp;≤ 5,000, 1&nbsp;≤ M&nbsp;≤ 50,000)</p>

<p>2번째 줄과 3번째 줄에 각각 K명의 졸고 있는 학생의 입장 번호들과 Q명의 출석 코드를 받을 학생의 입장 번호들이 주어진다.</p>

<p>4번째 줄부터 M개의 줄 동안&nbsp;구간의 범위 S, E가 공백을 사이에 두고&nbsp;주어진다. (3 ≤ S&nbsp;&lt; E&nbsp;≤ N&nbsp;+ 2)</p>

## 출력

<p>M개의 줄에 걸쳐서 각 구간에 대해서&nbsp;출석이 되지 않은 학생들의 수를 출력하라.</p>

## 소스코드

[소스코드 보기](Main.java)