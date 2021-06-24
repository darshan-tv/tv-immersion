import java.util.List;
import java.util.stream.Collectors;

public class OrangeExtractor implements FruitExtractor {
    @Override
    public List<? extends Fruits> extractFruit(List<Fruits> fruitsList) {
        return fruitsList.stream().parallel().filter(fruit ->  fruit instanceof Orange).collect(Collectors.toList());
    }
}
