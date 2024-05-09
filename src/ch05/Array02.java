package ch05;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Array02 {
    public static void main(String[] args) {
        int[] arr1 = {4,2,2,1,3,4};
        int[] arr2 = {2,1,1,3,2,5,4};

        System.out.println(Arrays.toString(solution(arr1)));
        System.out.println(Arrays.toString(solution(arr2)));
    }
    public static int[] solution(int[] arr){
        // 중복값 제거
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        // 내림차순 정렬
        Arrays.sort(result, Collections.reverseOrder());
        // int형 배열로 변경 후 반환
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }
    public static int[] solution2(int[] arr){
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int num : arr){
            set.add(num);
        }
        int[] result = new int[set.size()];
        for(int i=0; i<result.length; i++){
            result[i] = set.pollFirst();
        }
        return result;
    }
}
/*
[4, 3, 2, 1]
[5, 4, 3, 2, 1]
 */