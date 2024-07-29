package assignment8;

public class PlayerDTO {
    String name;

    String game;
    int jerseyNumber;

    public void playGame() {
        System.out.println(name + " is playing a " + game + ".");
    }

    public void train() {
        System.out.println(name + " is training.");
    }
    public void jerseyNumber() {
    	System.out.println(name +" jersey Number "+ jerseyNumber );
    }

    public static void main(String[] args) {
        PlayerDTO player1 = new PlayerDTO();
        player1.name = "Dharsan";
        player1.game = "Badminton";
        player1.jerseyNumber =18;

        player1.playGame();
        player1.train();
        player1.jerseyNumber();
    }
}
