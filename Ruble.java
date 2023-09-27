public class Ruble extends Currency{
    public Ruble(int units){
        super(units, "ruble");
    }
    @Override
    float Value() {
        return units * 0.0103f;
    }
}
