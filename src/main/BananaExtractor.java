import java.util.List;
import java.util.stream.Collectors;

public class BananaExtractor implements FruitExtractor {
    @Override
    public List<? extends Fruits> extractFruit(List<Fruits> fruitsList) {
        return fruitsList.stream().parallel().filter(fruit ->  fruit instanceof Banana).collect(Collectors.toList());
    }
}
