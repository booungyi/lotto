package boo.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lotto1 lotto1 = new Lotto1();
        System.out.println("구입 금액을 입력해주세요.");
        int pay = sc.nextInt();
        lotto1.Lottos(pay);
    }
}
