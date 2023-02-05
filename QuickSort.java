public class QuickSort extends SortingVisualization implements Sorter
{
    public QuickSort(int[] array){
      super(array);
    }
    
    public void sort(int[] array){
        try{
            quickSort(array, 0, array.length-1);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    private void quickSort(int[] array, int a, int b) throws InterruptedException {
        if(a >= b){
            return;
        }
        
        int s = a;
        int e = b;
        int m = s+(e-s)/2;
        int pivot = array[m];
        
        while (s<=e) {
            while (array[s] < pivot){
                s++;
            }
            while (array[e] > pivot) {
                e--;
            }
            if(s <= e){
                int temp = array[s];
                array[s] = array[e];
                array[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(array, a, e);
        quickSort(array, s, b);
        repaint();
        Thread.sleep(100);
    }
}