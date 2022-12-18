package Builder;

public class Juce extends NutritionFacts{
    private final int sugar;

    public static class Builder
    {
        private final int sugar;

        public Builder sugar(int val) {
            this.sugar = val;
            return this;
        }
        public Juce build() {
            return new Juce(this);
        }

    }
    private Juce(super.Builder builder) {
        this(super.)
        sugar = builder.sugar;

    }
}
