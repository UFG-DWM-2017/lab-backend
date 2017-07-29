package lab;

public class ImcModel {
    private int peso;

    private float altura;

    private String resultado;

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getResultado() {
        return resultado;
    }

    public void calcular() {
        float calculo = peso / (altura * altura);
        if (calculo < 17) {
            resultado = "Muito abaixo do peso.";
        } else if (calculo < 18.49) {
            resultado = "Abaixo do peso.";
        } else if (calculo < 24.99) {
            resultado = "Peso normal.";
        } else if (calculo < 29.99) {
            resultado = "Acima do peso.";
        } else if (calculo < 34.99) {
            resultado = "Obesidade I.";
        } else if (calculo < 39.99) {
            resultado = "Obesidade II (severa).";
        } else {
            resultado = "Obesidade III (mórbida).";
        }
    }
}
