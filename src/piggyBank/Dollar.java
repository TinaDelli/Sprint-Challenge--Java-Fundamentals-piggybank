package piggyBank;

public class Dollar extends AbstractCollection
{
    public String name;
    public Double worth;

    public Dollar (int amt, String name, Double worth)
    {
        super(amt);
        this.name = name;
        this.worth = worth;
    }

    public void totalAmt(Double worth, int amt)
    {
     this.worth = amt * worth;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public Double getWorth()
    {
        return worth;
    }
    

    @Override
    public String toString()
    {
        return "$" + amt;
    }


}