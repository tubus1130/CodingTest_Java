package ch05;

// https://school.programmers.co.kr/learn/courses/30/lessons/12949?language=java
public class Array05 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int r1 = arr1.length;
        int c1 = arr1[0].length;
        int r2 = arr2.length;
        int c2 = arr2[0].length;

        int[][] answer = new int[r1][c2];

        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<c1; k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];  // 이 부분을 생각하지 못했음
                }
            }
        }

        return answer;
    }
}
/*
- 3중 반복문도 써야하는 경우
i 0
j 0
k 0

2 3 2      5 4 3
4 2 4      2 4 1
3 1 4      3 1 1
 */