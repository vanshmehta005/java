package Android.FinancialCompany;

public class ShareAssets {

    private String symbol;
    private double totalCost;
    private double currentPrice;

    public ShareAssets(String symbol,double currentPrice)
    {
        this.symbol=symbol;
        this.currentPrice=currentPrice;
    }
    
    //adds a cost of the given amount to this asset
    public void addCost(double cost){
        totalCost+=cost;
    }

    //returns the price per share of this asset
    public double getCurrentPrice()
    {
        return currentPrice;
    }

    //returns the total price
    public double getTotalCost()
    {
        return totalCost;
    }

    //set the current price
    public void setCurrentPrice(double currentPrice)
    {
        this.currentPrice=currentPrice;
    }
}
