
public class InsertionSort extends SortingVisualization implements Sorter
{
    public InsertionSort(int[] array){
      super(array);
    }
    
    public void sort(int[] array){
        try{
            for(int i=0; i<array.length-1; i++){
                for(int j=i+1; j>0; j--){
                    if(array[j] < array[j-1]) {
                        int temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp; 
                        repaint();
                        Thread.sleep(100);
                    }
                    else break;
                }
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
