public class ArcadeGame{
    
    private final String name;
    private final int costToPlay;
    private int finalTicketsWon;
    public ArcadeGame(String name, int costToPlay)
    {
        this.costToPlay = costToPlay;
        this.name = name;
        finalTicketsWon=0;
    }

    public int play(ArcadeCard c)
    {

        if(c.getCredits()<this.costToPlay)
        {
            System.out.println("["+ this.name +"]: Not enough credit you poor asshole.");
            return 0;
        }
        c.RemoveCredits(this.costToPlay);
        int reward = (int)(Math.random() * 51);
        this.finalTicketsWon+=reward;
        System.out.println("You won " + reward +  " tickets!");
        return 1;

    }

    public String getName()
    {
        return this.name;
    }

    public int getGameCostToPlay()
    {
        return this.costToPlay;
    }

    public void getTotalTicketsWon()
    {
        System.out.println("Total tickets paid out by " + this.name  + " : " + this.finalTicketsWon);
    }

}