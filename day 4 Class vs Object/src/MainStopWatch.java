public class MainStopWatch {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.selectionSort(100000);
        watch.stop();
        System.out.println(watch.getElapsedTime());
    }
}
