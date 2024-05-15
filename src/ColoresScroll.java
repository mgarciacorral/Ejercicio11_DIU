import javax.swing.*;
import java.awt.*;

public class ColoresScroll extends JFrame
{
    private JScrollBar scrollBarRed;
    private JScrollBar scrollBarGreen;
    private JScrollBar scrollBarBlue;
    private JPanel panelScroll = new JPanel();
    private JPanel panelColor = new JPanel();

    public ColoresScroll()
    {
        super("Colores Scroll");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLayout(new BorderLayout());

        scrollBarRed = new JScrollBar(JScrollBar.VERTICAL, 0, 10, 0, 256);
        scrollBarRed.setBackground(Color.RED);
        scrollBarRed.setPreferredSize(new Dimension(20, 350));
        scrollBarGreen = new JScrollBar(JScrollBar.VERTICAL, 0, 10, 0, 256);
        scrollBarGreen.setBackground(Color.GREEN);
        scrollBarGreen.setPreferredSize(new Dimension(20, 350));
        scrollBarBlue = new JScrollBar(JScrollBar.VERTICAL, 0, 10, 0, 256);
        scrollBarBlue.setBackground(Color.BLUE);
        scrollBarBlue.setPreferredSize(new Dimension(20, 350));

        panelScroll.setLayout(new GridLayout(1, 3, 10, 0));
        panelScroll.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelScroll.add(scrollBarRed);
        panelScroll.add(scrollBarGreen);
        panelScroll.add(scrollBarBlue);

        panelColor.setBackground(new Color(scrollBarRed.getValue(), scrollBarGreen.getValue(), scrollBarBlue.getValue()));

        scrollBarRed.addAdjustmentListener(e -> {
            panelColor.setBackground(new Color(scrollBarRed.getValue(), scrollBarGreen.getValue(), scrollBarBlue.getValue()));
        });

        scrollBarGreen.addAdjustmentListener(e -> {
            panelColor.setBackground(new Color(scrollBarRed.getValue(), scrollBarGreen.getValue(), scrollBarBlue.getValue()));
        });

        scrollBarBlue.addAdjustmentListener(e -> {
            panelColor.setBackground(new Color(scrollBarRed.getValue(), scrollBarGreen.getValue(), scrollBarBlue.getValue()));
        });

        add(panelScroll, BorderLayout.WEST);
        add(panelColor, BorderLayout.CENTER);

        setVisible(true);
    }
}
