package service;

import java.util.ArrayList;
import java.util.List;
import model.Leilao;

public class LeilaoService {
    private List<Leilao> leiloes = new ArrayList<>();
    private int proximoId = 1;

    public Leilao criarLeilao(Leilao leilao) {
        leilao.setId(proximoId++);
        leiloes.add(leilao);
        return leilao;
    }

    public List<Leilao> buscarTodosLeiloes() {
        return leiloes;
    }

    public Leilao buscarLeilaoPorId(int id) {
        for (Leilao leilao : leiloes) {
            if (leilao.getId() == id) {
                return leilao;
            }
        }
        return null;
    }

    public Leilao atualizarLeilao(Leilao leilao) {
        for (int i = 0; i < leiloes.size(); i++) {
            if (leiloes.get(i).getId() == leilao.getId()) {
                leiloes.set(i, leilao);
                return leilao;
            }
        }
        return null;
    }

    public boolean excluirLeilao(int id) {
        for (Leilao leilao : leiloes) {
            if (leilao.getId() == id) {
                leiloes.remove(leilao);
                return true;
            }
        }
        return false;
    }
}

