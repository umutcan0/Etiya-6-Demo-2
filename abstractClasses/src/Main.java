public class Main {

    public static void main(String[] args) {
        GameCalculator gameCalculator = new KidsGameCalculator();
        gameCalculator.calculate();
        gameCalculator.gameOver();
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.calculate();
        womanGameCalculator.gameOver();

    }
}
