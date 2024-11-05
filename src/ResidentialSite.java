public class ResidentialSite extends Site{
    private int _units;
    private int _rate;
    private int base;
    public double getBillableAmount(){
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
