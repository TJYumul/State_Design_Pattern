public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected. Insert coins to proceed.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Coin inserted. Dispensing item...");
        machine.setBalance(machine.getBalance() + amount);
        machine.setState(new DispensingState());
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Insert coin first.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Vending machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}