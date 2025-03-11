public class Supplier {
    private int supplierID;
    private String companyName;
    private String phone;

    //no arg constructor
    public Supplier() {
    }

    //full constructor
    public Supplier(int ID, String c, String p) {
        supplierID = ID;
        companyName = c;
        phone = p;
    }
    
    //toSTring
    public String toString() {
        return "The item comes from " + companyName + " with the id of " + supplierID + 
               " and has a phone number of " + phone;
    }

    //getters and setters
    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
