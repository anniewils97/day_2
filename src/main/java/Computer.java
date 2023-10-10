public class Computer {
        private int storage;
        private String printer;

// Constructor to initialise a computer with storage and no printer
        public Computer() {
            this.storage = 500; // default storage is 500GB
            this.printer = "None";
        }


// Getter for storage
        public int getStorage() {
                return storage;
        }

// method to add storage
        public void addStorage(int moreStorage) {
                this.storage += moreStorage;
        }

 // Getter for printer
        public String getPrinter() {
            return printer;
        }

 // Setter for printer
        public void setPrinter(String printer) {
            this.printer = printer;
        }
      
 // Method to print a message 
        public void printMessage(String message) {
            if ("None".equals(printer)) {
                System.out.println(message);
            } else {
                System.out.println("No printer connected.");}
        }

}
