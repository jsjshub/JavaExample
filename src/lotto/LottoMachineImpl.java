package lotto;

import java.util.*;

public class LottoMachineImpl implements LottoMachine {

    private int Max = 45;
    private int result = 6;
    private List<Integer> arr = new ArrayList<>();
    private List<Integer> arr2 = new ArrayList<>();

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
            arr2.add(arr.get(i));
        }
        arr2.sort(Comparator.naturalOrder());
        arr2.iterator().forEachRemaining(data -> System.out.println(data));

    }

    public void resultBalls() {
        setupBalls();
        getBalls();
    }
}
