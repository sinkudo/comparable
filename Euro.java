public class Euro extends Currency{
    public Euro(int units){
        super(units, "euro");
    }
    @Override
    float Value() {
        return units * 1.06f;
    }
}