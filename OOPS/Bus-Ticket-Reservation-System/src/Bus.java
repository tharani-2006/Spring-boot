public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    public Bus(int busNo, boolean ac, int capacity){
        this.busNo = busNo;
        this.ac = ac;
        this.capacity = capacity;
    }

    public int getBusNo(){
        return busNo;
    }
    public boolean getAc(){
        return ac;
    }
    public int getCapacity(){
        return capacity;
    }

    public void setAc(boolean acChanged){
        this.ac = acChanged;
    }

    public void setCapacity(int newCapacity){
        this.capacity = newCapacity;
    }

    public void displayBusInfo(){
        System.out.println("BusNo : " + busNo + " AC : " + ac + " Total seats : " + capacity);
    }
}
