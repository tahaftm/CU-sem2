public abstract class Pharmaceutical{
    protected String medName;
    protected String expiryDate;
    protected String manufacturer;
    StockStatus stockStatus;
    public Pharmaceutical(String medName, String expiryDate, String manufacturer, StockStatus stockStatus){
        this.medName = medName;
        this.expiryDate = expiryDate;
        this.manufacturer = manufacturer;
        this.stockStatus = stockStatus;
    }
    public void displaySpecs(){
        System.out.println("Medicine Name: " + medName + ", Expiry Date: " + expiryDate + ", Manufacture: " + manufacturer + ", Stock Status: " + stockStatus);
    }
    public boolean isEquivalent(String manufacture, String expiryDate){
        if (manufacture == this.manufacturer && expiryDate == this.expiryDate){
            return true;
        } else{
            return false;
        }
    }
}