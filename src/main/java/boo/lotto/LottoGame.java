package boo.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BuyLotto buyLotto = new BuyLotto();
        UserInput userInput = new UserInput(sc.nextInt());
//        System.out.println("구입 금액을 입력해주세요.");
        buyLotto.Lottos(userInput.getPay());
        System.out.println("usertinput:"+userInput.getPay());
    }
}
