package lotto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoMachineImpl implements LottoMachine {

    private Integer[] balls = new Integer[45];

    @Override
    public void setupBalls() {
        for (int i = 0; i < balls.length; i++) {
            balls[i] = i + 1;
        }
    }

    @Override
    public void getBalls() {

        Arrays.stream(balls).iterator().forEachRemaining(data -> System.out.println(data));
    }

    public void resultBalls(){

    }
}
