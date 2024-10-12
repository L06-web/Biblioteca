package br.edu.unisep.golquadrado.view;
import br.edu.unisep.golquadrado.model.Caminhao;
import br.edu.unisep.golquadrado.model.Carro;
import br.edu.unisep.golquadrado.model.Moto;
import br.edu.unisep.golquadrado.model.Frota;

public class SistemaFrota {public static void main(String[] args) {
        Carro carro1 = new Carro(
                "ATR7G55",
                "Corolla",
                "Preto",
                2020,
                "Toyota",
                4);
        Moto moto1 = new Moto(
                "TMJ8L22",
                "CB500",
                "Vermelho",
                2013,
                "Yamaha",
                500);
        Caminhao caminhao1 = new Caminhao(
                "WYY8J23",
                "Scania Super",
                "Branco",
                2018,
                "Scania",
                "Carga pesada");

        Frota frota = new Frota(5);
        frota.adicionarVeiculo(carro1);
        frota.adicionarVeiculo(moto1);
        frota.adicionarVeiculo(caminhao1);

        frota.exibirDetalhesFrota();
    }
}
