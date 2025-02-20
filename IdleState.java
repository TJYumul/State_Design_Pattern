public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        if (machine.getInventory() > 0) {
            System.out.println("Item selected.");
            machine.setState(new ItemSelectedState());
        } else {
            System.out.println("No items available.");
        }
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Please select an item first.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("No item selected.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Vending machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}