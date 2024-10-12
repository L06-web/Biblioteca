package br.edu.unisep.golquadrado.model;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String modelo, String cor, int ano, String marca, int cilindradas) {
        super(placa, modelo, cor, ano, marca);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Placa da moto: " + placa
                + "\nModelo: " + modelo
                + "\nCor: " + cor
                + "\nAno de fabricação: " + ano
                + "\nMarca: " + marca
                + "\nCilindradas: " + cilindradas + "cc"
                + "\n" + "=".repeat(30));
    }
}