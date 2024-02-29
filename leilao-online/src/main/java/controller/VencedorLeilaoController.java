package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.VencedorLeilaoService;
import dto.VencedorLeilaoDTO;

@RestController
@RequestMapping("/vencedor_leilao")
public class VencedorLeilaoController {

    private VencedorLeilaoService vencedorLeilaoService;

    @GetMapping("/leilao/{id}")
    public ResponseEntity<VencedorLeilaoDTO> buscarVencedorLeilaoPorId(@PathVariable int id) {
        VencedorLeilaoDTO vencedorLeilaoDTO = vencedorLeilaoService.buscarVencedorLeilaoPorId(id);
        if (vencedorLeilaoDTO != null) {
            return new ResponseEntity<>(vencedorLeilaoDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
