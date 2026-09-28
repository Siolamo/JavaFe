
import java.util.ArrayList;


public class Leaderboard
{
    private ArrayList<Score> scores;
   

    public Leaderboard()
    {
        this.scores = new ArrayList<>();
        
    }
    
    public void addScore(String name, int points)
    {
        
        scores.add(new Score(name, points));
        sort();
        
    }

    private boolean sort()
    {
        if(scores.size()<=1) return false;
        int n = scores.size();
        for (int i = 0; i < n; i++) 
        {
            Score tmp = 
        }
    }

    public void printLeaderboard()
    {

    }


}