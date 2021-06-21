import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Fruits> fruitBasket = new ArrayList<>();

        fruitBasket.add(new Apple());
        fruitBasket.add(new Apple());
        fruitBasket.add(new Orange());

        FruitExtractor extractor = new AppleExtractor();
        Fruits fruitColor = new Apple();

        System.out.println("These are in Apple bowl: "+extractor.extractFruit(fruitBasket)+", Count: "+extractor.extractFruit(fruitBasket).size());
        System.out.println("Fruit colour: "+fruitColor.getColour());

        extractor = new BananaExtractor();
        fruitColor = new Banana();
        System.out.println("These are in Banana bowl: "+extractor.extractFruit(fruitBasket)+", Count: "+extractor.extractFruit(fruitBasket).size());
        System.out.println("Fruit colour: "+fruitColor.getColour());

        extractor = new OrangeExtractor();
        fruitColor = new Orange();
        System.out.println("These are in Orange bowl: "+extractor.extractFruit(fruitBasket)+", Count: "+extractor.extractFruit(fruitBasket).size());
        System.out.println("Fruit colour: "+fruitColor.getColour());

    }

}
