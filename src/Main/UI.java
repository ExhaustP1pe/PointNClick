package Main;

import javax.swing.*;
import java.awt.*;

public class UI
{
    GameManager gm;

    JFrame window;
    public JTextArea messageTxt;
    public JPanel[] bgPanel = new JPanel[10];
    public JLabel[] bgLabel = new JLabel[10];

    public UI(GameManager gm)
    {
        this.gm = gm;
        createMainField();
        createBackground();

        window.setVisible(true);
    }

    public void createMainField()//Parameters for GameWindow & TextArea
    {
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);

        messageTxt = new JTextArea("The quick brown fox jumps over the lazy dog");
        messageTxt.setBounds(50,415,700,150);
        messageTxt.setBackground(Color.black);
        messageTxt.setForeground(Color.white);
        messageTxt.setEditable(false);
        messageTxt.setLineWrap(true);
        messageTxt.setWrapStyleWord(true);
        messageTxt.setFont(new Font("Propaganda",Font.PLAIN,26));
        window.add(messageTxt);
    }

    public void createBackground()
    {
        bgPanel[1] = new JPanel();
        bgPanel[1].setBounds(50,50,700,350);
        bgPanel[1].setBackground(Color.pink);
        bgPanel[1].setLayout(null);
        window.add(bgPanel[1]);

        bgLabel[1] = new JLabel();
        bgLabel[1].setBounds(0,0,700,350);


    }
}
