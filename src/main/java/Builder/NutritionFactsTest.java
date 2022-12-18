package Builder;

public class NutritionFactsTest {
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240,8)
                .calories(1500).sodium(35).carbohydrate(27).build();
        System.out.println("cocaCola = " + cocaCola);

        NutritionFacts cakes = new NutritionFacts.Builder(500,60)
                .calories(2000).sodium(780).fat(878).carbohydrate(100).build();
        System.out.println(" cakes = " +  cakes);
        NutritionFacts juce = new Juce().Builder()
    }
}

