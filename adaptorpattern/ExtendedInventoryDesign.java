package DesignPatterns.adaptorpattern;

public class ExtendedInventoryDesign {

    // LegacyInventorySystemA representing the first legacy system
    public static class LegacyInventorySystemA {
        public void accessOldInventoryA() {
            System.out.println("You are able to access LegacyInventorySystemA");
        }
    }

    // LegacyInventorySystemB representing the second legacy system
    public static class LegacyInventorySystemB {
        public void accessOldInventoryB() {
            System.out.println("You are able to access LegacyInventorySystemB");
        }
    }

    // Inventory interface for modern inventory access
    public interface Inventory {
        void inventoryAccess();
    }

    // InventoryAdapter class adapting LegacyInventorySystemA to Inventory interface
    public static class InventoryAdapterA implements Inventory {
        private LegacyInventorySystemA legacyInventorySystemA;

        public InventoryAdapterA(LegacyInventorySystemA legacyInventorySystemA) {
            this.legacyInventorySystemA = legacyInventorySystemA;
        }

        @Override
        public void inventoryAccess() {
            this.legacyInventorySystemA.accessOldInventoryA();
        }
    }

    // InventoryAdapter class adapting LegacyInventorySystemB to Inventory interface
    public static class InventoryAdapterB implements Inventory {
        private LegacyInventorySystemB legacyInventorySystemB;

        public InventoryAdapterB(LegacyInventorySystemB legacyInventorySystemB) {
            this.legacyInventorySystemB = legacyInventorySystemB;
        }

        @Override
        public void inventoryAccess() {
            this.legacyInventorySystemB.accessOldInventoryB();
        }
    }

    public static void main(String[] args) {
        // Creating instances of LegacyInventorySystemA and LegacyInventorySystemB
        LegacyInventorySystemA legacyInventorySystemA = new LegacyInventorySystemA();
        LegacyInventorySystemB legacyInventorySystemB = new LegacyInventorySystemB();

        // Creating adapters to access the legacy systems via the Inventory interface
        InventoryAdapterA adapterA = new InventoryAdapterA(legacyInventorySystemA);
        InventoryAdapterB adapterB = new InventoryAdapterB(legacyInventorySystemB);

        // Using the adapters to access the legacy systems through the modern interface
        adapterA.inventoryAccess();
        adapterB.inventoryAccess();
    }
}
