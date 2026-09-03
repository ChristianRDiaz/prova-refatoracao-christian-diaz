package src.br.com.fiapride.model;

public class Veiculo {
    private String nomeDono;
    private String placa;
    private double nivelCombustivel;

    public Veiculo(String nomeDono,String placa, double nivelCombustivelInicial) {
        this.nomeDono = nomeDono;
        this.placa = placa;

        // Tanque não comece com valor negativo
        if (nivelCombustivelInicial >= 0) {
            this.nivelCombustivel = nivelCombustivelInicial;
        } else {
            this.nivelCombustivel = 0.0;
        }
    }

    public void adicionarCombustivel(double quantidadeCombustivel){
        if (quantidadeCombustivel > 0) {
            this.nivelCombustivel += quantidadeCombustivel;
            System.out.println("Combustível adicionado");
        } else {
            System.out.println("A quantidade deve ser maior que zero");
        }
    }

    public void consumoCombustivel(double quantidadeCombustivel){
        if (quantidadeCombustivel <= 0) {
            System.out.println("O valor do consumo deve ser maior que zero");
            return;
        }

        if (this.nivelCombustivel >= quantidadeCombustivel) {
            this.nivelCombustivel -= quantidadeCombustivel;
            System.out.println("Consumo realizado com sucesso");
        } else {
            System.out.println("Combustível insuficiente para realizar esse consumo!");
        }
    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }

    public String getPlaca() {
        return placa;
    }

    public String getNomeDono() {
        return nomeDono;
    }
}
