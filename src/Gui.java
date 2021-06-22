import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Gui extends JFrame implements ActionListener {

    JButton buttonToSelectFolderPath;
    Gui(){
        JFrame frame = new JFrame("Folders generator");
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        buttonToSelectFolderPath = new JButton("Select folder");
        buttonToSelectFolderPath.addActionListener(this);
        panel.add(buttonToSelectFolderPath);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400,150);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonToSelectFolderPath){
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null); //Select file to open

            if(response == JFileChooser.APPROVE_OPTION){
                Choice choice = new Choice();

                //System.out.println(file);
            }

        }
    }
}
