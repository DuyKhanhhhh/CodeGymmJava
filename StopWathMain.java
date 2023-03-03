public class StopWathMain {
    public static void main(String[] args) {
        StopWatch timeRun = new StopWatch();
        timeRun.setStartTime();
        for (int i = 0; i < 10000; i++) {
            System.out.println("HelooWorld");
        }
        timeRun.setEndTime();
        System.out.println("Kiểu giây: " + timeRun.getElapsedTime());
        System.out.println("Kiểu milisecond: " +  timeRun.getStartTimeSecs());
    }
}
