public class Main //classe main
{
    public static void main(String[] args) 
    {
        // Setup
        //Creo due oggetti, un ArcadeCard chiamato playerCard e uno ArcadeGame chiamato skeeball
        ArcadeCard playerCard = new ArcadeCard(101, 15); // Card #101 with 15 credits
        ArcadeGame skeeball = new ArcadeGame("Skee-Ball", 5);  // Costs 5 credits per play

        // Play rounds
        System.out.println("Remaining credits: " + playerCard.getCredits()); // crediti iniziali
        skeeball.play(playerCard); // Should succeed (10 credits left)
        skeeball.play(playerCard); // Should succeed (5 credits left)
        System.out.println("Remaining credits: " + playerCard.getCredits()); //crediti residui dopo 2 giochi
        skeeball.play(playerCard); // Should succeed (0 credits left) 

        playerCard.addCredits(0); //tentativo di aggiungere un numero non valido  ai crediti
        
        // This 4th attempt should fail due to insufficient credits
        skeeball.play(playerCard); 
        
        System.out.println("Remaining credits: " + playerCard.getCredits()); //crediti residui dopo 4 giocate
        skeeball.getTotalTicketsWon(); //stampa dei ticket vinti totali
    }
}