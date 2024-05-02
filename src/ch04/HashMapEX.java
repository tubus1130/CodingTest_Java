package ch04;

import java.util.HashMap;

public class HashMapEX {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // 해시맵 데이터 추가
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        System.out.println(map);

        // 해시맵 검색
        String key = "apple";
        if(map.containsKey(key)){
            int value = map.get(key);
            System.out.println(key + " : " + value);
        }else{
            System.out.println(key + "는 해시맵에 없습니다");
        }

        // 해시맵 수정
        map.put("banana", 4);
        System.out.println(map);

        // 해시맵 삭제
        map.remove("orange");
        System.out.println(map);


        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("apple", 1);
        myMap.put("banana", 2);
        map.put("cherry", 3);

        String myKey = "orange";
        if(map.containsKey(myKey)){
            System.out.println("값 : " + map.get(myKey));
        }else{
            System.out.println(myKey + "는 해시맵에 없습니다");
        }
    }
}
/*
{banana=2, orange=3, apple=1}
apple : 1
{banana=4, orange=3, apple=1}
{banana=4, apple=1}
orange는 해시맵에 없습니다
 */
