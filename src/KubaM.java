public class KubaM implements Instructions{
    public void squareField(int a, int b){
        System.out.printf("Pole prostokąta o wymiarach %d na %d wynosi: %d", a, b, a*b);
    }

    @Override
    public void showInstructions() {
        System.out.println("Metoda przyjmuje parametry a i b i na ich podstawie wylicza pole prostokąta.");
    }
}
