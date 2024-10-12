package br.edu.unisep.golquadrado.model;

public class Caminhao extends Veiculo {
    private String tipoCarga;

    public Caminhao(String placa, String modelo, String cor, int ano, String marca, String tipoCarga) {
        super(placa, modelo, cor, ano, marca);
        this.tipoCarga = tipoCarga;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Placa do caminhao: " + placa
                + "\nModelo: " + modelo
                + "\nCor: " + cor
                + "\nAno de fabricação: " + ano
                + "\nMarca: " + marca
                + "\nTipo de Carga: " + tipoCarga
                + "\n" + "=".repeat(30));
    }
}