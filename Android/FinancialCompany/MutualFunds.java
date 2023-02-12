package Android.FinancialCompany;

public class MutualFunds extends ShareAssets implements Asset{
    
    private double totalShares;

    public MutualFunds(String symbol , double currentPrice )
    {
        super(symbol,currentPrice);
        totalShares=0.0;
    }

    @Override
    public double getMarketValue()
    {
        return totalShares*getCurrentPrice();
    }

    public double getTotalShares() {
        return totalShares;
    }

    @Override
    public double getProfit()
    {
        return getMarketValue()-getTotalCost();
    }

    //records purchase of the given shares at a given price
    public void purchase(double shares , double pricePerShare)
    {
        totalShares += shares;
        addCost(shares*pricePerShare);
    }
    
}
