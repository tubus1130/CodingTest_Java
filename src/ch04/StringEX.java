package ch04;

public class StringEX {
    public static void main(String[] args) {
        // 문자열은 이뮤터블 객체이다
        // 값을 변경할 수 없다

        String string = "Hello, World!";

        // 문자열은 기존 객체를 수정하는 것이 아니라 새로운 객체를 반환한다
        String str = "He";
        str += "llo";
        System.out.println(str);

        str = str.replace("l", "");
        System.out.println(str);

        String s = "abc";
        System.out.println(System.identityHashCode(s));
        s += "def";
        System.out.println(System.identityHashCode(s));

        long start = System.currentTimeMillis();
        String s1 = "";
        for(int i=1; i<=50000; i++){
            s1 += i;
        }
        long end = System.currentTimeMillis();
        System.out.println((end-start) / 1000.0 + "초");

        long start2 = System.currentTimeMillis();
        StringBuilder s2 = new StringBuilder();
        for(int i=1; i<=50000; i++){
            s2.append(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println((end2-start2) / 1000.0 + "초");

        // StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append("ABC");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.insert(1, 2);
        System.out.println(sb);
    }
}
/*
Hello
Heo
460141958
1163157884
4.694초
0.001초
10ABC
10AC
120AC
 */