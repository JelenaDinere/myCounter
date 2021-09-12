public class Counter {
    void countTo(int start, int stop) {
        if (start > stop) {
            System.out.println("Start value must be less than final value.Please try again");
            return;
        }
        System.out.println(start);
        start++;

        if (start <= stop) {
            countTo(start, stop);
        }
        return;


    }
    void countDown(int stop, int start) {
        if (stop < start) {
            System.out.println("Stop value must be more than start.Please try again");
            return;
        }
        System.out.println(stop);
        stop--;

        if (stop >=start) {
            countDown(stop, start);
        }
        return;


}
}
