package piggyBank;

public abstract class AbstractCollection
{
    protected int amt;

    public AbstractCollection (int amt)
    {
        this.amt = amt;
    }

    public AbstractCollection()
    {
        amt = 1;
    }

    public abstract String getName();
    public abstract Double getWorth();

    public int getAmt()
    {
        return amt;
    }

    public void addCoin(int i)
    {
        amt = amt + 1;
    }

    public void removeCoin(int i)
    {
        amt = amt - 1;
    }

}