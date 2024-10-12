package br.edu.unisep.golquadrado.model;

public class Frota {

        private Veiculo[] veiculos;
        private int quantidadeVeiculos;

        public Frota(int capacidade) {
            veiculos = new Veiculo[capacidade];
            quantidadeVeiculos = 0;
        }

        public void adicionarVeiculo(Veiculo veiculo) {
            if (quantidadeVeiculos < veiculos.length) {
                veiculos[quantidadeVeiculos] = veiculo;
                quantidadeVeiculos++;
            } else {
                System.out.println("A frota está cheia, não é possível adicionar mais veículos.");
            }
        }

        public void exibirDetalhesFrota() {
            for (int i = 0; i < quantidadeVeiculos; i++) {
                veiculos[i].exibirDetalhes();
            }
        }


}
