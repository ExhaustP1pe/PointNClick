package Main;

import javax.swing.*;
import java.awt.*;

public class UI
{
    GameManager gm;
    JFrame window;
    public JTextArea messageTxt;

    public UI(GameManager gm)
    {
        this.gm = gm;
        createMainField();
        window.setVisible(true);
    }

    public void createMainField()
    {
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);

        messageTxt = new JTextArea("The quick brown fox jumps over the lazy dog");
        messageTxt.setBounds(50,400,700,150);
        messageTxt.setBackground(Color.black);
        messageTxt.setForeground(Color.white);
        messageTxt.setEditable(false);
        messageTxt.setLineWrap(true);
        messageTxt.setWrapStyleWord(true);
        messageTxt.setFont(new Font("Propaganda",Font.PLAIN,26));
        window.add(messageTxt);
    }
}
