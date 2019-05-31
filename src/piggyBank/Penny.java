package piggyBank;

public class Penny extends AbstractCollection
{
    public String name;
    public Double worth;

    public Penny (int amt, String name, Double worth)
    {
        super(amt);
        this.name = name;
        this.worth = worth;
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
        return amt + " " + name;
    }


}