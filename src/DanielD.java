public class DanielD implements Instructions {
    public void triangleCircumference (int a, int b, int c) {
        System.out.println("Obwód trójkąta o bokach " + a + " " + b + " " + c + " wynosi " + (a+b+c));
    }

    @Override
    public void showInstructions() {
        System.out.println("Metoda przyjmuje parametry a, b, c i na ich podstawie wylicza obwód.");
    }
}
