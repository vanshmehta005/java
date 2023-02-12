package Android.FinancialCompany;

public class Cash implements Asset{


    private double amount;
    
    public Cash(double amount)
    {
        this.amount=amount;
    }

    @Override
    public double getMarketValue()
    {
        return amount;
    }

    //Since Cash is a fixed asset no profit

    @Override
    public double getProfit()
    {
        return 0;
    }
    
    public void setAmount(double amount)
    {
        this.amount=amount;
    }
}
