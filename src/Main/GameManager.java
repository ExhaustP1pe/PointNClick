package Main;

import Event.Event01;

public class GameManager
{
    ActionHandler aHandler = new ActionHandler(this);
    public UI ui = new UI(this);

    public Event01 ev1 = new Event01(this);

    public static void main(String[] args)//hub
    {
        new GameManager();
    }

    public GameManager()
    {

    }
}
// I'm so gonna put ts on a portfolio when its uni time >:p