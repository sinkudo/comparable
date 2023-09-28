public class Carp extends Animal{
    public Carp(int bodyWidth, int finWidth){
        super(bodyWidth);
        this.finWidth = finWidth;
    }
    int finWidth;
    @Override
    public int getWidth() {
        return bodyWidth + 2*finWidth;
    }
    @Override
    public String toString(){
        return "Carp width: " + getWidth();
    }
    @Override
    public boolean equals(Object object){
        if (object == null || object.getClass() != this.getClass())
            return false;
        Carp other = (Carp) object;
        return this.compareTo(other) == 0;
    }
}
