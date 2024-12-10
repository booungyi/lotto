package boo.lotto;

import java.util.ArrayList;
import java.util.List;

public class Lastweek {
    List<Integer> lastweek(int pay) {
        Lotto1 lotto1 = new Lotto1();


        System.out.println("지난 주 당첨 번호를 입력해 주세요.");

        List<Integer> last = new ArrayList<>();
        last.add(1);
        last.add(2);
        last.add(3);
        last.add(4);
        last.add(5);
        last.add(6);

        System.out.println("당첨통계");
        System.out.println("-------");

        return last;
    }

}
