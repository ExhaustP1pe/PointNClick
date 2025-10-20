package Main;

import com.sun.source.tree.SwitchTree;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener
{
    GameManager gm;

    public ActionHandler(GameManager gm)
    {
        this.gm = gm;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String yourChoice = e.getActionCommand();

        switch(yourChoice)
        {
            case "lookHut": gm.ev1.lookHut(); break;
            case "talkHut": gm.ev1.talkHut(); break;
            case "restHut": gm.ev1.restHut(); break;

            case "lookGuy": gm.ev1.lookGuy(); break;
            case "talkGuy": gm.ev1.talkGuy(); break;
            case "attackGuy": gm.ev1.attackGuy(); break;

            case "lookChest": gm.ev1.lookChest(); break;
            case "talkChest": gm.ev1.talkChest(); break;
            case "openChest": gm.ev1.openChest(); break;

            case "lookTree": gm.ev1.lookTree(); break;
            case "digTree": gm.ev1.digTree(); break;
        }
    }
}
