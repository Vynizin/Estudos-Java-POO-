package fundamentos.calculadora;


public class Calculadora {
    private float resultado;
    private float valor1;
    private float valor2;

    public void setValor1(float valor1){
        this.valor1 = valor1;
    }

    public void setValor2(float valor2){
        this.valor2 = valor2;
    }

    public float getResultado(){
        return this.resultado;
    }


    public void adicao(){
        this.resultado = this.valor1 + this.valor2;
    }

    public void subtracao(){
        this.resultado = this.valor1 - this.valor2;
    }

    public void multiplicacao(){
        this.resultado = this.valor1 * this.valor2;
    }

    public void divisao(){
        if(this.valor2 == 0){
            System.out.println("Não é possivel dividir por zero!");
            return;
        }
        this.resultado = this.valor1 / this.valor2;
    }

}
