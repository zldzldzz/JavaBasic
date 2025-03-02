public class Adapter {

    interface USB {
        void connectWithUsbCable();
    }

    static class TypeCCharger {
        public void connectWithTypeC() {
            System.out.println("Type-C 충전기를 연결합니다.");
        }
    }

    static class USBAdapter implements USB {
        private TypeCCharger charger;

        public USBAdapter(TypeCCharger charger) {
            this.charger = charger;
        }

        public void connectWithUsbCable() {
            charger.connectWithTypeC();
        }
    }

    static public class Main {
        public static void main(String[] args) {
            TypeCCharger typeC = new TypeCCharger();
            USB usbAdapter = new USBAdapter(typeC);
            usbAdapter.connectWithUsbCable();
        }
    }

}
