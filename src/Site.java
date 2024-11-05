public abstract class Site {
    protected static int TAX_RATE = 10;

    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }

    public abstract double getBaseAmount();

    public abstract double getTaxAmount();

}
