package baseball.domain;

import java.util.List;

public class BaseBalls {
    private List<BaseBall> numbers;
    public static final int SIZE = 3;

    public BaseBalls(List<BaseBall> numbers){
        validateSize();
        validateDuplication();
        this.numbers = numbers;
    }

    public static BaseBalls getBaseBallNumbers(){
        return new BaseBalls(NumberGenerator.generateAnswerNumbers());
    }

    private void validateSize(){
        if(numbers.size() != SIZE){
            throw new IllegalArgumentException("숫자의 길이는 3이여야합니다.");
        }
    }

    private void validateDuplication(){
        if(numbers.stream().distinct().count() != SIZE){
            throw new IllegalArgumentException("중복되는 숫자없이, 서로 다른 3개의 숫자를 입력해야합니다.");
        }
    }
}
