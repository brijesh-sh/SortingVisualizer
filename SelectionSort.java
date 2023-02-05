public class SelectionSort extends SortingVisualization implements Sorter
{
    public SelectionSort(int[] array){
      super(array);
    }
    
    public void sort(int[] array){
        try{
            for(int i=0; i<array.length-1; i++){
                // find the max value in the remaining array and swap with correct index
                int last = array.length - i - 1;
                int maxIndex = getMaxIndex(array, 0, last);
                int temp = array[i];
                array[i] = array[last];
                array[last] = temp;
                repaint();
                Thread.sleep(100);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    private int getMaxIndex(int[] array, int start, int end){
        int max = start;
        for(int i= start; i <= end; i++){
            if( array[max] < array[i]){
                max = i;
            }
        }
        return max;
    }
}