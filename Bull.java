public class Bull extends Animal{
    public Bull(int bodywidth, int hornWidth){
        super(bodywidth);
        this.hornWidth = hornWidth;
    }
    int hornWidth;
    @Override
    public int getWidth() {
        return bodyWidth + 2*hornWidth;
    }
    @Override
    public String toString(){
        return "Bull width: " + getWidth();
    }
    @Override
    public boolean equals(Object object){
        if (object == null || object.getClass() != this.getClass())
            return false;
        Bull other = (Bull)object;
        return this.compareTo(other) == 0;
    }
}
