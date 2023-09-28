public abstract class Animal implements Comparable<Animal> {
    public Animal(int bodyWidth){
        this.bodyWidth = bodyWidth;
    }
    int bodyWidth;
    public abstract int getWidth();
    @Override
    public int compareTo(Animal a)
    {
        if (a == null)
            return 1;
        if (this.getWidth() > a.getWidth())
            return 1;
        else if (this.getWidth() < a.getWidth())
            return -1;
        else return 0;
    }
}
