public class Arcade {

    public String name;
    public boolean isOpen;
    public int yearFounded;
    public int randomInt;
    public String gameName;




    public static void main(String[] args) {
        Arcade pixelParadise = new Arcade();
    }

    public Arcade() {


        name = "Pixel Paradise";
        isOpen = true;
        yearFounded = 1985;
        System.out.println("Welcome to" + name + "It is"
                + isOpen + "that we are open. We were founded in" + yearFounded);
        yearFounded = 1985 + 21;
        System.out.println("Welcome to" + name + "It is"
                + isOpen + "that we are open. We were founded in" + yearFounded);

        System.out.println("Hello world! Goodluck on your exams!");
        spinForTokens();
        gameOfTheDay();
        displayScores();
        ticketMultiplier();

        ArcadeGame classicGame = new ArcadeGame("Pinball", 2, false);
        classicGame.printInfo();

        ArcadeGame myFavGame = new ArcadeGame("Galaga", 1000, true);
        myFavGame.printInfo();
    }





    public void spinForTokens() {
        randomInt = (int) (Math.random() * 51);

        System.out.println("You spun the wheel and you won" + randomInt + "tokens!");
    }


    public void gameOfTheDay () {
        System.out.println("todays game of the day is" + gameName);
    }
    public void displayScores () {
        for (int x = 5; x <= 1; x = x + 1){
            System.out.println(x);}

        for (int y = 200; y >= 1100; y = y + 300){
            System.out.println(y);
        }

        for (int i = 6; i <= 0; i = i - 1) {
            System.out.println(i + ", ");
        }
    }


    public void ticketMultiplier(){
        double randomNumb;
        randomNumb = Math.random();

        if (randomNumb < 0.25) { // ms k helped with the bracket
            System.out.println("you have won 10 extra tickets!");
        }
        if (randomNumb >= 0.25 && randomNumb < 0.5) { //&&
            System.out.println("You have won 50 extra Tickets");
        }
        if (randomNumb >= 0.5 && randomNumb < 0.75) {
            System.out.println("you have doubled your tickets!");
        }
        if (randomNumb >= 0.75 && randomNumb < 1) {
            System.out.println("you have tripled your tickets!!!");
        }

    }
}
