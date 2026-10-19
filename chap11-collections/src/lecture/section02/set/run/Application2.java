package lecture.section02.set.run;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {

    /*
    * TreeSet
    * - 데이터가 정렬된 상태로 저장되는 이진 검색 트리
    * - 검색, 추가, 삭제를 효율적으로 처리할 수 있도록 해주는 알고리즘
    * */

    public static void main(String[] args) {
        TreeSet<Integer> tset = new TreeSet<>();

        tset.add(10);
        tset.add(6);
        tset.add(23);
        tset.add(52);
        tset.add(62);
        tset.add(39);

        // 오름차순 정렬
        System.out.println("tset = " + tset);


        LinkedHashSet<String> hset = new LinkedHashSet<>();

        hset.add("java");
        hset.add("mysql");
        hset.add("jdbc");
        hset.add("html");
        hset.add("css");

        System.out.println("hset = " + hset);

        TreeSet<String> tset2 = new TreeSet<>(hset);
        System.out.println("tset2 = " + tset2);
    }
}
