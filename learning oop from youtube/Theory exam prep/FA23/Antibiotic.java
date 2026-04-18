public class Antibiotic extends Pharmaceutical implements Classificable{
    public String spectrum;
    public Antibiotic(String medName, String expiryDate, String manufacturer, StockStatus stockStatus, String spectrum){
        super(medName,expiryDate,manufacturer,stockStatus);
        this.spectrum = spectrum;
    }
    @Override
    public void displaySpecs(){
        System.out.println("Antibiotics details: ");
        System.out.println("Medicine Name: " + medName + ", Expiry Date: " + expiryDate + ", Manufacture: " + manufacturer + ", Stock Status: " + stockStatus + ", spectrum: " + spectrum);
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