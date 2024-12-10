package boo.lotto;

import java.util.List;

public class grade {

    public void grades(UserInput userInput) {
        System.out.println("당첨통계");
        System.out.println("---------");
        BuyLotto buyLotto = new BuyLotto();
        Lastweek lastweek = new Lastweek();

        int i = 0;
        for (List<Integer> lotto : buyLotto.Lottos(userInput.getPay())) {
            int grade = 0;
            if (lotto.contains(lastweek)) {
                if (lotto.get(i).equals(lastweek.lastweek().get(i))) {
                    grade++;
                }
            }

            switch (grade) {
                    case 3 -> {
                        System.out.println("3개 일치 (5000원)- 1개\n" +
                                            "4개 일치 (50000원)- 0개\n" +
                                            "5개 일치 (1500000원)- 0개\n" +
                                            "6개 일치 (2000000000원)- 0개");
                    }
                }

        }
    }

}