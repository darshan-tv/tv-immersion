import java.util.List;

public interface FruitExtractor {
    List<? extends Fruits> extractFruit(List<Fruits> fruitsList);
}