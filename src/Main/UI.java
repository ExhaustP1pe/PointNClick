package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class UI
{
    GameManager gm;

    JFrame window;
    public JTextArea messageTxt;

    //sets the max amount of scenes
    public JPanel[] bgPanel = new JPanel[10];
    public JLabel[] bgLabel = new JLabel[10];

    public UI(GameManager gm)//Responsible for Screen
    {
        this.gm = gm;
        createMainField();
        generateScreen();
        window.setVisible(true);
    }

    public void createMainField() // Parameters for GameWindow & TextArea
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

    public void createBackground(int bgNum,String bgFileName) // Manages the Background
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

    public void createObject(int bgNum,int objX,int objY,int objWidth,
                             int objHeight,String objFileName,String choiceName,
                             String choice2Name,String choice3Name, String c1Command,
                             String c2Command,String c3Command)
    {
        // CREATE POPUP MENU
        JPopupMenu popMenu = new JPopupMenu();

        // CREATE POPUP MENU ITEMS
        JMenuItem[] menuItem = new JMenuItem[4]; // just use [1],[2],[3]

        menuItem[1] = new JMenuItem(choiceName); //Choice 1
//        menuItem[1].setFont(new Font("Propaganda",Font.PLAIN,10));
        menuItem[1].addActionListener(gm.aHandler);
        menuItem[1].setActionCommand(c1Command);
        popMenu.add(menuItem[1]);

        menuItem[2] = new JMenuItem(choice2Name);//Choice 2
        menuItem[2].addActionListener(gm.aHandler);
        menuItem[2].setActionCommand(c2Command);
        popMenu.add(menuItem[2]);

        menuItem[3] = new JMenuItem(choice3Name);//Choice 3
        menuItem[3].addActionListener(gm.aHandler);
        menuItem[3].setActionCommand(c3Command);
        popMenu.add(menuItem[3]);


        // CREATE OBJECTS
        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(objX,objY,objWidth,objHeight);

        ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource(objFileName));
        objectLabel.setIcon(objectIcon);

        // REMOVES NULL CHOICES - I MADE THIS BY MYSELF >:]
        if(choiceName == null) {popMenu.remove(menuItem[1]);}
        if(choice2Name == null) {popMenu.remove(menuItem[2]);}
        if(choice3Name == null) {popMenu.remove(menuItem[3]);}

        // LISTENS FOR MOUSE INPUT
        objectLabel.addMouseListener(new MouseListener()
        {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e)
            {
                if (SwingUtilities.isRightMouseButton(e)) {popMenu.show(objectLabel,e.getX(),e.getY());}
            }
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });

        // DISPLAYS THE BACKGROUND AND OBJECTS FOR THE CURRENT SCENE
        bgPanel[bgNum].add(objectLabel);
        bgPanel[bgNum].add(bgLabel[bgNum]);
    }

    public void generateScreen() // RENDERS THE CURRENT SCENE
    {
       // SCREEN1 ----------------------------
        createBackground(1,"Backgrounds/forestbg.png");

        createObject(1, 400,10,617,309,
                "Objects/icons/greenhouse.png","Inspect",
                "Talk","Rest","lookHut",
                "talkHut","restHut");

        createObject(1,100,170,144,144,
                "Character sprites/Scarfy.png","Inspect",
                "Talk","Attack","lookGuy",
                "talkGuy","attackGuy");

        createObject(1,250,220,100,100,
                "Objects/icons/chest1.png","Inspect",
                "Talk","Open","lookChest",
                "talkChest","openChest");

        createObject(1,-185,-150,309,463,
                "Objects/icons/tree3.png","Inspect",
                "dig thru leaves",null,
                "lookTree","digTree","");

        createObject(1,60,225,232,77,
                "Objects/icons/fence.png",null,
                null,null,"","","");
    }
}
