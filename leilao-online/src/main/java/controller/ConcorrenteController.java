package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import model.Concorrente;
import service.ConcorrenteService;

@RestController
@RequestMapping("/concorrente")
public class ConcorrenteController {

    @Autowired
    private ConcorrenteService concorrenteService;

    @GetMapping("/")
    public ResponseEntity<List<Concorrente>> buscarTodosConcorrentes() {
        List<Concorrente> concorrentes = concorrenteService.buscarTodosConcorrentes();
        return new ResponseEntity<>(concorrentes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Concorrente> buscarConcorrentePorId(@PathVariable int id) {
        Concorrente concorrente = concorrenteService.buscarConcorrentePorId(id);
        if (concorrente != null) {
            return new ResponseEntity<>(concorrente, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public ResponseEntity<Concorrente> criarConcorrente(@RequestBody Concorrente concorrente) {
        Concorrente novoConcorrente = concorrenteService.criarConcorrente(concorrente);
        return new ResponseEntity<>(novoConcorrente, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Concorrente> atualizarConcorrente(@PathVariable int id, @RequestBody Concorrente concorrente) {
        concorrente.setId(id);
        Concorrente concorrenteAtualizado = concorrenteService.atualizarConcorrente(concorrente);
        if (concorrenteAtualizado != null) {
            return new ResponseEntity<>(concorrenteAtualizado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirConcorrente(@PathVariable int id) {
        if (concorrenteService.excluirConcorrente(id)) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
