package service;

import java.util.ArrayList;
import java.util.List;
import model.Lance;

public class LanceService {
    private List<Lance> lances = new ArrayList<>();
    private int proximoId = 1;

    public Lance criarLance(Lance lance) {
        lance.setId(proximoId++);
        lances.add(lance);
        return lance;
    }

    public List<Lance> buscarTodosLances() {
        return lances;
    }

    public List<Lance> buscarLancesPorIdLeilao(int idLeilao) {
        List<Lance> lancesDoLeilao = new ArrayList<>();
        for (Lance lance : lances) {
            if (lance.getIdLeilao() == idLeilao) {
                lancesDoLeilao.add(lance);
            }
        }
        return lancesDoLeilao;
    }

    public List<Lance> buscarLancesPorIdConcorrente(int idConcorrente) {
        List<Lance> lancesDoConcorrente = new ArrayList<>();
        for (Lance lance : lances) {
            if (lance.getIdConcorrente() == idConcorrente) {
                lancesDoConcorrente.add(lance);
            }
        }
        return lancesDoConcorrente;
    }

    public Lance buscarLancePorId(int id) {
        for (Lance lance : lances) {
            if (lance.getId() == id) {
                return lance;
            }
        }
        return null;
    }

    public Lance atualizarLance(Lance lance) {
        for (int i = 0; i < lances.size(); i++) {
            if (lances.get(i).getId() == lance.getId()) {
                lances.set(i, lance);
                return lance;
            }
        }
        return null;
    }

    public boolean excluirLance(int id) {
        for (Lance lance : lances) {
            if (lance.getId() == id) {
                lances.remove(lance);
                return true;
            }
        }
        return false;
    }
}

