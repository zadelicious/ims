import javax.swing.JFrame;
import java.awt.Dimension;
import java.util.Arrays;
import java.util.List;

public class ReceiptPreviewApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Receipt Preview");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Sample data
        String orderId = "123456";
        String customerName = "John Doe";
        String cashierName = "Jane Smith";
        List<String[]> items = Arrays.asList(
            new String[]{"Item1", "100", "2", "200"},
            new String[]{"Item2", "150", "1", "150"}
        );
        int totalPaid = 350;

        ReceiptPreviewPanel_1 receiptPreviewPanel = new ReceiptPreviewPanel_1(orderId, customerName, cashierName, items, totalPaid);

        frame.getContentPane().add(receiptPreviewPanel);

        // Set the preferred size of the JFrame to a quarter of the screen size
        Dimension screenSize = new Dimension(1366, 768);
        frame.setSize(screenSize.width / 2, screenSize.height / 2); // Approximately a quarter of the screen size
        frame.setResizable(true); // Make the frame resizable
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true); // Make the frame visible
    }
}