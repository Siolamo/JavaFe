public class Main {
    public static void main(String[] args) {
        Leaderboard leaderboard = new Leaderboard();

        System.out.println("=== INITIAL LEADERBOARD ===");
        leaderboard.printLeaderboard();

        System.out.println("\n=== ADDING INITIAL SCORES ===");
        leaderboard.addScore("Luigi", 1200);
        leaderboard.addScore("Mario", 4500);
        leaderboard.addScore("Peach", 3000);
        leaderboard.printLeaderboard();
        
        System.out.println("\n=== ADDING HIGH SCORE (BOWSER) ===");
        // 5000 should take 1st place and push Luigi (1200) off the top 3 board!
        leaderboard.addScore("Bowser", 5000);
        leaderboard.printLeaderboard();

        System.out.println("\n=== TESTING INVALID / LOW SCORES ===");
        // -100 should print an error message and be rejected
        leaderboard.addScore("Glitcher", -100);
        
        // 500 is too low to beat anyone currently on the board (5000, 4500, 3000)
        leaderboard.addScore("Toad", 500);
        
        System.out.println("\n=== FINAL LEADERBOARD ===");
        leaderboard.printLeaderboard();
    }
}