public class Yuan extends Currency{
    public Yuan(int units){
        super(units, "yuan");
    }
    @Override
    float Value() {
        return units * 0.136645f;
    }
}
