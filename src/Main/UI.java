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
        generateScreen();
        window.setVisible(true);
    }

    public void createMainField()//Parameters for GameWindow & TextArea
    {
        window = new JFrame();
        window.setSize(800,620);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);

        messageTxt = new JTextArea("The quick brown fox jumps over the lazy dog");
        messageTxt.setBounds(50,425,700,150);
        messageTxt.setBackground(Color.black);
        messageTxt.setForeground(Color.white);
        messageTxt.setEditable(false);
        messageTxt.setLineWrap(true);
        messageTxt.setWrapStyleWord(true);
        messageTxt.setFont(new Font("Propaganda",Font.PLAIN,26));
        window.add(messageTxt);
    }

    public void createBackground(int bgNum,String bgFileName)
    {
        bgPanel[bgNum] = new JPanel();
        bgPanel[bgNum].setBounds(50,55,700,350);
        bgPanel[bgNum].setBackground(Color.pink);
        bgPanel[bgNum].setLayout(null);
        window.add(bgPanel[bgNum]);

        bgLabel[bgNum] = new JLabel();
        bgLabel[bgNum].setBounds(0,0,700,350);

        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName));
        bgLabel[bgNum].setIcon(bgIcon);


    }

    public void createObject(int bgNum,int objx,int objy,int objWidth,int objHeight,String objFileName)
    {
        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(objx,objy,objWidth,objHeight);

        ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource(objFileName));
        objectLabel.setIcon(objectIcon);

        bgPanel[bgNum].add(objectLabel);
        bgPanel[bgNum].add(bgLabel[bgNum]);
    }

    public void generateScreen()
    {
       //SCREEN1
        createBackground(1,"Backgrounds/forestbg.png");
        createObject(1, 400,10,617,309,"Objects/icons/greenhouse.png");
        createObject(1,100,170,144,144,"Character sprites/creature-sheet/00_creature-sheet.png");
        createObject(1,250,220,100,100,"Objects/icons/chest1.png");
        createObject(1,-185,-150,309,463,"Objects/icons/tree3.png");
        createObject(1,60,225,232,77,"Objects/icons/fence.png");

    }
}
