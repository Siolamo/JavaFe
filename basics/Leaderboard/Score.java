public class Score
{
    private String name;
    private int  points;

    public Score(String name, int points)
    {
        this.name = name;
        this.points = points;
    }

    public String getName()
    {
        return name;
    }

    public int getPoints()
    {
        return points;
    }

    public void printScore()
    {
        System.out.println("Name: "+this.name+", Points: " + this.points);
    }

    public boolean diff(Score s1)
    {
        return s1.getPoints() > this.points;
    }

    

}