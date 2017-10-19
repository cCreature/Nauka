public class MichalZ implements Instructions {
    public void plusTwoNumbers(int a, int b){
        System.out.println("Wynik to: " + (a+b));
    }

    @Override
    public void showInstructions() {
        System.out.println("Metoda dodaje dwie liczby");
    }
}
