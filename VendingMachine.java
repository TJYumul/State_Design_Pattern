public class VendingMachine {
    private VendingMachineState state;
    private int inventory;
    private double balance;

    public VendingMachine(int inventory) {
        this.inventory = inventory;
        this.balance = 0.0;
        this.state = new IdleState();
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void selectItem() {
        state.selectItem(this);
    }

    public void insertCoin(int amount) {
        state.insertCoin(this, amount);
    }

    public void dispenseItem() {
        state.dispenseItem(this);
    }

    public void setOutOfOrder() {
        state.setOutOfOrder(this);
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}