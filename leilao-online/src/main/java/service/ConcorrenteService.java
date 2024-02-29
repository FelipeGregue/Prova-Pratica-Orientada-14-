package service;

import java.util.ArrayList;
import java.util.List;
import model.Concorrente;

public class ConcorrenteService {
    private List<Concorrente> concorrentes = new ArrayList<>();
    private int proximoId = 1;

    public Concorrente criarConcorrente(Concorrente concorrente) {
        concorrente.setId(proximoId++);
        concorrentes.add(concorrente);
        return concorrente;
    }

    public List<Concorrente> buscarTodosConcorrentes() {
        return concorrentes;
    }

    public Concorrente buscarConcorrentePorId(int id) {
        for (Concorrente concorrente : concorrentes) {
            if (concorrente.getId() == id) {
                return concorrente;
            }
        }
        return null;
    }

    public Concorrente atualizarConcorrente(Concorrente concorrente) {
        for (int i = 0; i < concorrentes.size(); i++) {
            if (concorrentes.get(i).getId() == concorrente.getId()) {
                concorrentes.set(i, concorrente);
                return concorrente;
            }
        }
        return null;
    }

    public boolean excluirConcorrente(int id) {
        for (Concorrente concorrente : concorrentes) {
            if (concorrente.getId() == id) {
                concorrentes.remove(concorrente);
                return true;
            }
        }
        return false;
    }
}

