package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import model.Lance;
import service.LanceService;

@RestController
@RequestMapping("/lance")
public class LanceController {

    @Autowired
    private LanceService lanceService;

    @GetMapping("/")
    public ResponseEntity<List<Lance>> buscarTodosLances() {
        List<Lance> lances = lanceService.buscarTodosLances();
        return new ResponseEntity<>(lances, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lance> buscarLancePorId(@PathVariable int id) {
        Lance lance = lanceService.buscarLancePorId(id);
        if (lance != null) {
            return new ResponseEntity<>(lance, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Implemente os outros métodos conforme necessário
}
