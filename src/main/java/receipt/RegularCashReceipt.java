package receipt;

public class RegularCashReceipt {
    private int sumOrder;
    private String dateOrder;
    private String cashierName;

    public int getSumOrder() {
        return sumOrder;
    }

    public void setSumOrder(int sumOrder) {
        this.sumOrder = sumOrder;
    }

    public String getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(String dateOrder) {
        this.dateOrder = dateOrder;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }
}
