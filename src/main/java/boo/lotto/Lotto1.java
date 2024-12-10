package boo.lotto;

import java.util.*;

import static java.lang.Math.random;

public class Lotto1 {
    Random rand = new Random();
    int paytolotto = 0;
    int pay = 0;

    List<List<Integer>> Lottos(int pay) {
        paytolotto = pay / 1000;
        System.out.printf("%d개를 구매하셧습니다.\n" ,paytolotto);
        List<List<Integer>> list1 = new ArrayList<>();
        int game = pay / 1000;
        if (game >= 1) {
            for (int i = 0; i < game; i++) {
                List<Integer> list2 = new ArrayList<>();
                for (int j = 0; j < 6; j++) {
                    list2.add(rand.nextInt((45) + 1));
                }
                Collections.shuffle(list2, rand);
                list1.add(list2);
            }
        }
        for (List<Integer> integers : list1) {
            System.out.println(integers);
        }
        return list1;
    }

}
