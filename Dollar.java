public class Dollar extends Currency{
    public Dollar(int units){
        super(units, "dollar");
    }
    @Override
    float Value() {
        return units;
    }
}
