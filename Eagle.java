public class Eagle extends Animal{
    int wingWidth;
    public Eagle(int bodyWidth, int wingWidth){
        super(bodyWidth);
        this.wingWidth = wingWidth;
    }
    @Override
    public String toString(){
        return "Eagle width: " + getWidth();
    }
    @Override
    public boolean equals(Object object){
        if (object == null || object.getClass() != this.getClass())
            return false;
        Eagle other = (Eagle) object;
        return this.compareTo(other) == 0;
    }
    @Override
    public int getWidth() {
        return bodyWidth + 2 * wingWidth;
    }
}
