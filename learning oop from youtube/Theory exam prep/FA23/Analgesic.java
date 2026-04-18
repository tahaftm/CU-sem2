public class Analgesic extends Pharmaceutical implements Classificable{
    public String painType;
    public Analgesic(String medName, String expiryDate, String manufacturer, StockStatus stockStatus, String painType){
        super(medName,expiryDate,manufacturer,stockStatus);
        this.painType = painType;
    }
    @Override
    public void displaySpecs(){
        System.out.println("Analgesic details: ");
        System.out.println("Medicine Name: " + medName + ", Expiry Date: " + expiryDate + ", Manufacture: " + manufacturer + ", Stock Status: " + stockStatus + ", Pain Type: " + painType);
    }
    @Override
    public void addMedicine() {
        System.out.println("Adding Analgesic " + medName + " to system.");
    }

    @Override
    public void removeMedicine() {
        System.out.println("Removing Analgesic " + medName + " from system.");
    }

    @Override
    public void searchMedicine() {
        System.out.println("Searching for Analgesic: " + medName);
    }
}