import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class BubbleSort extends SortingVisualization implements Sorter {

  public BubbleSort(int[] array){
      super(array);
  }
  public void sort(int[] array) {
    try {
      for (int i = 0; i < array.length - 1; i++) {
        for (int j = 0; j < array.length - i - 1; j++) {
          if (array[j] > array[j + 1]) {
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
          }
          repaint();
          Thread.sleep(100);
        }
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
