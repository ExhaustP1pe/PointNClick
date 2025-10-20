package Event;

import Main.GameManager;

// A CLASS FOR SCENE1 INTERACTIONS
public class Event01
{
    GameManager gm;

    public  Event01(GameManager gm)
    {
        this.gm = gm;
    }

    static int countH = 0;
    // HOUSE INSPECT INTERACTION
    public void lookHut()
    {
        gm.ui.messageTxt.setText("This is your house. cool");
    }
    // HOUSE TALK INTERACTION
    public void talkHut()
    {
        switch (countH)
        {
            case 0: gm.ui.messageTxt.setText("You cant talk to houses, loser"); countH++; break;
            case 1: gm.ui.messageTxt.setText("Who are you talking to?"); countH++; break;
            case 2: gm.ui.messageTxt.setText("It wont reply."); countH = 0; break;
        }
    }
    // HOUSE REST INTERACTION
    public void restHut()
    {
        gm.ui.messageTxt.setText("You rested and recovered a life! (pending)");
    }

    // SCARFY INSPECT INTERACTION
    public void lookGuy()
    {
        gm.ui.messageTxt.setText("A guy with a red scarf and glasses stands before you");
    }
    // SCARFY TALK INTERACTION
    public void talkGuy()
    {
        gm.ui.messageTxt.setText("Scarfy: Wassup cuh, Don't leave without a weapon!");
    }
    // SCARFY ATTACK INTERACTION
    public void attackGuy()
    {
        gm.ui.messageTxt.setText("Scarfy: What the bosh bro");
    }

    static int count = 0;
    // CHEST INSPECT INTERACTION
    public void lookChest()
    {
        gm.ui.messageTxt.setText("It's a chest.\n Maybe theres some loot in it.");
    }
    // CHEST TALK INTERACTION
    public void talkChest()
    {
        switch (count)
        {
            case 0: gm.ui.messageTxt.setText("The chest can't talk"); count++; break;
            case 1: gm.ui.messageTxt.setText("Scarfy: Are you talking to me?"); count++; break;
            case 2: gm.ui.messageTxt.setText("It can't reply."); count = 0; break;
        }
    }
    // CHEST OPEN INTERACTION
    public void openChest()
    {
        gm.ui.messageTxt.setText("You opened the chest and found a sword!");
    }

    // TREE INSPECT INTERACTION
    public void lookTree()
    {
        gm.ui.messageTxt.setText("What a nice tree. You wonder what fruit it has.");
    }
    // TREE DIG INTERACTION
    public void digTree()
    {
        gm.ui.messageTxt.setText("You dug through the tree's leaves like an idiot. But atleast you found a donut?");
    }
}
