    public class Door {
        public void open ()
        {
            push();
        }
    }

    class BankVaultDoor extends Door {
  
        public void open () {
            enterCombination();
            pull;
        }
  
    }

    class HouseFrontDoor extends Door {

        public void open(){
            unlockDoorKnob();
            super.push;
        }
    }