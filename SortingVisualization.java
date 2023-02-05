import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SortingVisualization extends JPanel {
  private Sorter sorter;
  private int[] array;

  public SortingVisualization(int[] array) {
    this.array = array;
  }

  public void setArray(int[] array) {
    this.array = array;
  }
  
  public void setSorter(Sorter sorter){
      this.sorter = sorter;
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    for (int i = 0; i < array.length; i++) {
      int value = array[i];
      int x = i * (getWidth() / array.length);
      int y = getHeight() - value;
      g.fillRect(x, y, getWidth() / array.length, value);
      float hue = (float) array[i] / getHeight();
      Color color = Color.getHSBColor(hue, 1.0f, 1.0f);
      g.setColor(color);
    }
  }

  @Override
  public Dimension getPreferredSize() {
    return new Dimension(500, 500);
  }

  public static void main(String[] args) {
    int [] array = new int[20];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int)(Math.random() * 100);
    }

    BubbleSort sorter = new BubbleSort(array);

    JFrame frame = new JFrame("Sorting Visualization");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(sorter);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);

    sorter.sort(array);
  }
}
