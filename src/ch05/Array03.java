package ch05;

import java.util.HashSet;

// https://school.programmers.co.kr/learn/courses/30/lessons/68644?language=java
public class Array03 {
    public static int[] solution(int[] numbers){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length-1; i++){
            for(int j=1; j<numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
/*
- 중복값 제거를 위한 HashSet
 */