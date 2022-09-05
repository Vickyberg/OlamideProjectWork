package Chapter17.FunctionalInterface;

public class FunctionalInterfaceMain {
    public static void main(String[] args) {
        Staff staff = (hours) -> overTime(hours);
    staff.work(2);
    }

    private static void overTime(int hours){
        int overTime = hours * 2;
        System.out.println("Buhari works "+overTime+" hours a year");
    }
}
