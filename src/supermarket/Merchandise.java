package supermarket;

public class Merchandise {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;
    public double buy(){
        return buy(1);
    }
    public double buy(int count){
        return buy(count, false);

    }
    public double buy(int count, boolean isVip){
        if (this.count<count){
            return -1;
        }
        this.count -= count;
        double totalCost = soldPrice * count;
        if (isVip){
            return totalCost *= 0.8;
        }else {
            return totalCost;
        }
    }


}
