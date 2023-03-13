package receipt;

public class DiscountCashReceipt {
    private int sumOrder;
    private String dateOrder;
    private String cashierName;
    private int discount;

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

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
