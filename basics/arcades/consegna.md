**Questa consegna è stata scritta da un MML (sono pigro)**

Trovare il giusto equilibrio senza perdersi in codice inutile è il punto chiave.

Ecco un vero esercizio di OOP in cui gli oggetti rappresentano entità reali, interagiscono tra loro e gestiscono i cambiamenti di stato.

---

### Sfida: La Sala Giochi (Arcade) e il Sistema di Credito

Stai progettando il backend per una sala giochi. I giocatori acquistano una **Carta Arcade**, la ricaricano con dei crediti e la usano sui **Giostre/Giochi Arcade** per giocare.

#### Requisiti

1. **Classe `ArcadeCard`**
   - **Campi (attributi):** `cardNumber` (int) e `credits` (int).
   - **Costruttore:** per inizializzare la carta con un saldo iniziale di crediti.
   - **Metodo `addCredits(int amount)`:** per ricaricare la carta (rifiuta importi $\le 0$).
   - **Getter** per i vari campi.

2. **Classe `ArcadeGame`**
   - **Campi (attributi):** `gameName` (String), `costToPlay` (int) e `totalTicketsWon` (int).
   - **Costruttore:** per impostare `gameName` e `costToPlay`.
   - **Metodo `play(ArcadeCard card)`:**
     - **Verifica saldo:** Se la carta non ha abbastanza crediti, stampa `"[Nome Gioco]: Not enough credits!"` e restituisce `0`.
     - **Scala crediti:** Sottrae `costToPlay` dal saldo della carta.
     - **Assegna biglietti:** Genera un numero casuale di biglietti vinti (ad esempio, tra $1$ e $50$).
     - **Aggiorna lo stato:** Aggiunge quei biglietti al totale cumulativo `totalTicketsWon` del gioco.
     - **Ritorna:** Il numero di biglietti vinti in quella singola partita.

---

### Perché questo forza il vero utilizzo della OOP:
- **Interazione tra oggetti:** L'oggetto `ArcadeGame` modifica direttamente lo stato dell'oggetto `ArcadeCard` che gli viene passato.
- **Persistenza dello stato:** Il gioco tiene traccia dei biglietti totali vinti attraverso più giocate, mentre la carta mantiene il proprio saldo residuo.
- **Incapzamento (Encapsulation):** Il saldo della carta non può essere modificato a caso dall'esterno: diminuisce solo quando viene passata in un gioco valido o quando viene ricaricata esplicitamente.