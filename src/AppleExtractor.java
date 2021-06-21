import java.util.List;
import java.util.stream.Collectors;

public class AppleExtractor implements FruitExtractor {


    @Override
    public List<? extends Fruits> extractFruit(List<Fruits> fruitsList) {
        return fruitsList.stream().parallel().filter(fruit ->  fruit instanceof Apple).collect(Collectors.toList());
    }
}
