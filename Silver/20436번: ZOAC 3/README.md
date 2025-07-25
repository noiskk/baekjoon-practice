# 20436번: ZOAC 3 - <img src="https://static.solved.ac/tier_small/7.svg" style="height:20px" /> Silver IV

<!-- performance -->
### 성능 요약
메모리: 17524 KB, 시간: 164 ms
<!-- end -->

## 문제

[문제 링크](https://boj.kr/20436)

<p>2020년 12월, 세 번째로 개최된 ZOAC의 오프닝을 맡은 성우는 누구보다 빠르게 ZOAC를 알리려 한다.</p>

<p>하지만 안타깝게도 성우는 독수리타법이다!</p>

<ul>
<li>독수리 타법이란 양 손의 검지손가락만을 이용해 타자를 치는 타법이다.</li>
<li>성우는 한글 자음 쪽 자판은 왼손 검지손가락으로 입력하고, 한글 모음 쪽 자판은 오른손 검지손가락으로 입력한다.</li>
<li><em>a</em>의 좌표가 (x<sub>1</sub>, y<sub>1</sub>)이고, <em>b</em>의 좌표가 (x<sub>2</sub>, y<sub>2</sub>)일 때, <em>a</em>에 위치한 성우의 손가락이 <em>b</em>로 이동하는 데에는 <em>a</em>와 <em>b</em>의 택시 거리 |x<sub>1</sub>-x<sub>2</sub>|+|y<sub>1</sub>-y<sub>2</sub>| 만큼의 시간이 걸린다.</li>
<li>각 키를 누르는 데에는 1의 시간이 걸린다.</li>
<li>성우는 두 손을 동시에 움직일 수 없다.</li>
<li>성우가 사용하는 키보드는 쿼티식 키보드이며, 아래 그림처럼 생겼다.
<p><img alt="" src="https://upload.acmicpc.net/408ea292-3a7e-4b25-b5ec-d6a85f82a6ce/-/preview/" style="height: 252px; width: 800px;"></p>
</li>
</ul>

<p>바쁜 성우를 위하여 해당 문자열을 출력하는 데 걸리는 시간의 최솟값을 구해보자.</p>

## 입력

<p>첫 번째 줄에는 두 알파벳 소문자 <em>s<sub>L</sub></em>, <em>s<sub>R</sub></em>이 주어진다. <em>s<sub>L</sub></em>, <em>s<sub>R</sub></em>은 각각 왼손 검지손가락, 오른손 검지손가락의 처음 위치이다.</p>

<p>그 다음 줄에는 알파벳 소문자로 구성된 문자열이 주어진다. 문자열의 길이는 최대 100자이다. 빈 문자열은 주어지지 않는다.</p>

## 출력

<p>입력으로 주어진 문자열을 출력하는 데에 걸리는 시간의 최솟값을 출력한다.</p>

## 소스코드

[소스코드 보기](Main.java)