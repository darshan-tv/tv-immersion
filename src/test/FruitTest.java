import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FruitTest {

    List<Fruits> fruitBasket = new ArrayList<>();
    FruitExtractor appleExtractor = new AppleExtractor();
    Fruits apple = new Apple();
    FruitExtractor bananaExtractor = new BananaExtractor();
    Fruits banana = new Banana();
    FruitExtractor orangeExtractor = new OrangeExtractor();
    Fruits orange = new Orange();

    @BeforeClass
    public void AddFruits()
    {
        fruitBasket.add(new Apple());
        fruitBasket.add(new Apple());
        fruitBasket.add(new Apple());
        fruitBasket.add(new Apple());
        fruitBasket.add(new Banana());
        fruitBasket.add(new Banana());
        fruitBasket.add(new Orange());
        fruitBasket.add(new Orange());
        fruitBasket.add(new Orange());
    }

    @Test
    public void Test001_Verify_Fruits_Count()
    {
        Assert.assertEquals(fruitBasket.size(),9);
        Reporter.log("Fruit basket contains 9 fruits",true);
    }

    @Test
    public void Test002_Verify_Apples_In_AppleBowl()
    {
        Assert.assertTrue(appleExtractor.extractFruit(fruitBasket).toString().contains("Apple")
                && !appleExtractor.extractFruit(fruitBasket).toString().contains("Orange")
                && !appleExtractor.extractFruit(fruitBasket).toString().contains("Banana")
        );
        Reporter.log("Apple bowl contains only apples",true);
    }

    @Test
    public void Test003_Verify_Bananas_In_BananaBowl()
    {
        Assert.assertTrue(bananaExtractor.extractFruit(fruitBasket).toString().contains("Banana")
                && !bananaExtractor.extractFruit(fruitBasket).toString().contains("Orange")
                && !bananaExtractor.extractFruit(fruitBasket).toString().contains("Apple")
        );
        Reporter.log("Banana bowl contains only bananas",true);
    }

    @Test
    public void Test004_Verify_Oranges_In_OrangeBowl()
    {
        Assert.assertTrue(orangeExtractor.extractFruit(fruitBasket).toString().contains("Orange")
                && !orangeExtractor.extractFruit(fruitBasket).toString().contains("Apple")
                && !orangeExtractor.extractFruit(fruitBasket).toString().contains("Banana")
        );
        Reporter.log("Orange bowl contains only oranges",true);
    }

    @Test
    public void Test005_Verify_Apple_Count_In_AppleBowl()
    {
        Assert.assertEquals(appleExtractor.extractFruit(fruitBasket).size(),4);
        Reporter.log("Count of Apples in apple bowl are 4",true);
    }

    @Test
    public void Test006_Verify_Banana_Count_In_BananaBowl()
    {
        Assert.assertEquals(bananaExtractor.extractFruit(fruitBasket).size(),2);
        Reporter.log("Count of Bananas in banana bowl are 2",true);
    }

    @Test
    public void Test007_Verify_Orange_Count_In_OrangeBowl()
    {
        Assert.assertEquals(orangeExtractor.extractFruit(fruitBasket).size(),3);
        Reporter.log("Count of Oranges in orange bowl are 3",true);
    }

    @Test
    public void Test008_Verify_Apple_Colour()
    {
        Assert.assertEquals(apple.getColour(),"red");
        Reporter.log("Colour of Apple is red",true);
    }

    @Test
    public void Test009_Verify_Banana_Colour()
    {
        Assert.assertEquals(banana.getColour(),"yellow");
        Reporter.log("Colour of Banana is yellow",true);
    }

    @Test
    public void Test010_Verify_Orange_Colour()
    {
        Assert.assertEquals(orange.getColour(),"orange");
        Reporter.log("Colour of Orange is orange",true);
    }


}
