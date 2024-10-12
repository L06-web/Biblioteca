package br.edu.unisep.golquadrado.model;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String placa, String modelo, String cor, int ano, String marca, int numPortas) {
        super(placa, modelo, cor, ano, marca);
        this.numPortas = numPortas;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Placa do carro: " + placa
                + "\nModelo: " + modelo
                + "\nCor: " + cor
                + "\nAno de fabricação: " + ano
                + "\nMarca: " + marca
                + "\n" + "=".repeat(30));
    }
}
