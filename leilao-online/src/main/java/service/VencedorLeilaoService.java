package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dto.VencedorLeilaoDTO;
import model.Lance;
import model.Leilao;

@Service
public class VencedorLeilaoService {

    @Autowired
    private LeilaoService leilaoService;

    @Autowired
    private LanceService lanceService;

    @Autowired
    private ConcorrenteService concorrenteService;

    public VencedorLeilaoDTO buscarVencedorLeilaoPorId(int idLeilao) {
        Leilao leilao = leilaoService.buscarLeilaoPorId(idLeilao);
        if (leilao != null && leilao.isAberto()) {
            Lance maiorLance = lanceService.buscarMaiorLancePorIdLeilao(idLeilao);
            if (maiorLance != null) {
                return new VencedorLeilaoDTO(
                    leilao.getId(),
                    maiorLance.getConcorrente().getId(),
                    maiorLance.getConcorrente().getNome(),
                    maiorLance.getValor()
                );
            }
        }
        return null;
    }

}

