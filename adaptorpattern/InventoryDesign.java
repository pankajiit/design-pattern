package DesignPatterns.adaptorpattern;

public class InventoryDesign{


    public class LegacyInventorySystem{
        public void accessOldInventory(){
            System.out.println("You are able to access LegacyInventorySystem ");
        }
    }

    public interface Inventory {
        public void inventoryAccess();
    
    }

    public class InventoryAdapter implements Inventory{
        private LegacyInventorySystem legacyInventorySystem;

        public InventoryAdapter(LegacyInventorySystem  legacyInventorySystem){
            this.legacyInventorySystem = legacyInventorySystem;
        }

        @Override
        public void inventoryAccess(){
            this.legacyInventorySystem.accessOldInventory();
        } 

    }


    public static void main(String[] args) {
        // Creating an instance of LegacyInventorySystem
        LegacyInventorySystem legacyInventorySystem = new InventoryDesign().new LegacyInventorySystem();

        // Creating an adapter instance to access the legacy system via the Inventory interface
        InventoryAdapter inventoryAdapter = new InventoryDesign().new InventoryAdapter(legacyInventorySystem);

        // Using the adapter to access the legacy system through the modern interface
        inventoryAdapter.inventoryAccess();
    }

}