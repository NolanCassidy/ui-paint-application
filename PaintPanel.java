import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class PaintPanel extends JPanel {
	private final ArrayList<PaintPoint> paint = new ArrayList<>();
	public Color color = Color.BLACK;
	public int size = 8;

	public PaintPanel() {
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent event) {
				PaintPoint point = new PaintPoint(event.getX(), event.getY(), color, size);
				paint.add(point);
				repaint();
			}
		});
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (PaintPoint point : paint) {
			g.setColor(point._color);
			g.fillOval(point._x, point._y, point._size, point._size);
		}
	}

	public void clear() {
		paint.clear();
		repaint();
	}
}