import javax.swing.JFrame;
public class LabClassDriver {
    public static void main (String[] args)
    {
        JFrame frame = new JFrame ("Students");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new LabClassUI());
        frame.pack();
        frame.setVisible(true);
    }
}