package src.br.com.fiapride.main;

import src.br.com.fiapride.model.Veiculo;

public class Principal {
    public static void main(String[] args) {
        // Criando um veículo com o construtor
        Veiculo meuCarro = new Veiculo("Christian Diaz", "ABC-1234", 10.0);

        // Exibindo informações iniciais
        System.out.println("--- Dados do Veículo ---");
        System.out.println("Dono: " + meuCarro.getNomeDono());
        System.out.println("Placa: " + meuCarro.getPlaca());
        System.out.println("Nível Inicial de Combustível: " + meuCarro.getNivelCombustivel() + " litros\n");

        // Testando adicionar combustível válido
        System.out.println("--- Teste: Adicionar Combustível ---");
        meuCarro.adicionarCombustivel(25.5);
        System.out.println("Nível atual: " + meuCarro.getNivelCombustivel() + " litros\n");

        // Testando adicionar valor inválido (negativo)
        System.out.println("--- Teste: Adicionar Valor Inválido ---");
        meuCarro.adicionarCombustivel(-5.0);
        System.out.println("Nível atual: " + meuCarro.getNivelCombustivel() + " litros\n");

        // Testando consumo válido
        System.out.println("--- Teste: Consumo de Combustível ---");
        meuCarro.consumoCombustivel(10.0);
        System.out.println("Nível atual: " + meuCarro.getNivelCombustivel() + " litros\n");

        // Testando consumo maior do que o tanque possui
        System.out.println("--- Teste: Consumo Excedente ---");
        meuCarro.consumoCombustivel(100.0);
        System.out.println("Nível final: " + meuCarro.getNivelCombustivel() + " litros");
    }
}