package lotto;

import java.util.*;

public class LottoMachineImpl implements LottoMachine {

    private int Max = 45;
    private int result = 6;
    private List<Integer> arr = new ArrayList<>();

    @Override
    public void setupBalls() {
        for (int i = 0; i < Max; i++) {
            arr.add(i + 1);
        }
    }

    @Override
    public void getBalls() {
        Collections.shuffle(arr);
        for (int i = 0; i < result; i++) {
            System.out.println(arr.get(i));
        }

    }

    public void resultBalls() {
        setupBalls();
        getBalls();
    }
}
