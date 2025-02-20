public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Please wait, dispensing in progress.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Please wait, dispensing in progress.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        if (machine.getInventory() > 0) {
            machine.setInventory(machine.getInventory() - 1);
            System.out.println("Item dispensed. Returning to idle state.");
            machine.setState(new IdleState());
        } else {
            System.out.println("No inventory left. Machine needs refill.");
            machine.setState(new OutOfOrderState());
        }
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Cannot set out of order while dispensing.");
    }
}