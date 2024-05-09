package ch05;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
        int[] arr1 = {1,-5,2,4,3};
        int[] arr2 = {2,1,1,3,2,5,4};
        int[] arr3 = {6,1,7};
        System.out.println(Arrays.toString(solution(arr1)));
        System.out.println(Arrays.toString(solution(arr2)));
        System.out.println(Arrays.toString(solution(arr3)));
    }
    public static int[] solution(int[] arr){
        Arrays.sort(arr); // 원본 배열 자체를 정렬시킨다
        return arr;
    }

    public static int[] solution2(int[] arr){
        int[] clone = arr.clone();
        Arrays.sort(clone); // 배열을 복사하여 새로운 배열을 정렬, 원본배열에 영향x
        return clone;
    }
}

/*
[-5, 1, 2, 3, 4]
[1, 1, 2, 2, 3, 4, 5]
[1, 6, 7]
 */

/*
- 원본 배열의 상태를 유지하면서 원본 배열로부터 새로운 배열을 복사해서 사용해야 되는 상황에서는 clone() 메서드를 사용
- Arrays.sort()는 퀵소트이며 시간복잡도는 O(NlogN)
 */