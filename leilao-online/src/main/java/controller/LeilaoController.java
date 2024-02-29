package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import model.Leilao;
import service.LeilaoService;

@RestController
@RequestMapping("/leilao")
public class LeilaoController {

    @Autowired
    private LeilaoService leilaoService;

    @GetMapping("/")
    public ResponseEntity<List<Leilao>> buscarTodosLeiloes() {
        List<Leilao> leiloes = leilaoService.buscarTodosLeiloes();
        return new ResponseEntity<>(leiloes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Leilao> buscarLeilaoPorId(@PathVariable int id) {
        Leilao leilao = leilaoService.buscarLeilaoPorId(id);
        if (leilao != null) {
            return new ResponseEntity<>(leilao, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public ResponseEntity<Leilao> criarLeilao(@RequestBody Leilao leilao) {
        Leilao novoLeilao = leilaoService.criarLeilao(leilao);
        return new ResponseEntity<>(novoLeilao, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Leilao> atualizarLeilao(@PathVariable int id, @RequestBody Leilao leilao) {
        leilao.setId(id);
        Leilao leilaoAtualizado = leilaoService.atualizarLeilao(leilao);
        if (leilaoAtualizado != null) {
            return new ResponseEntity<>(leilaoAtualizado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirLeilao(@PathVariable int id) {
        if (leilaoService.excluirLeilao(id)) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

