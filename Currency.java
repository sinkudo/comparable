public abstract class Currency implements Comparable<Currency>{
    public Currency(int units, String name){
        this.units = units;
        this.name = name;
    }
    abstract float Value();
    int units;
    String name;
    @Override
    public int compareTo(Currency currency){
        if(currency == null)
            return 1;
        else if (this.Value() > currency.Value())
            return 1;
        else if (this.Value() < currency.Value())
            return -1;
        else return 0;
    }
}
