public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(2);

        machine.insertCoin(1);
        machine.selectItem();
        machine.selectItem();
        machine.insertCoin(1);
        machine.insertCoin(1);
        machine.dispenseItem();
        machine.selectItem();
        machine.insertCoin(1);
        machine.dispenseItem();
        machine.selectItem();

        machine.setOutOfOrder();
        machine.selectItem();
        machine.insertCoin(1);
    }
}