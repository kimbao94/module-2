public class StopWatch {
  private long startTime,endTime;
    public StopWatch(){

    }
    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public void start(){
      this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
    public void selectionSort(int count){
        long [] arr = {count};
        long temp;
        for (int i = 0;i < arr.length -1;i++){
            for (int j = i +1;i< arr.length ;j++){
                if (arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
