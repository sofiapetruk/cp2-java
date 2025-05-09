package fiap.com.br.cp2_java.controller;

import fiap.com.br.cp2_java.entity.Brinquedo;
import fiap.com.br.cp2_java.repository.BrinquedoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoRepository brinquedoRepository;

    private List<Brinquedo> brinquedos = new ArrayList<>();


    @GetMapping
    public List<Brinquedo> listToy() {

        return brinquedoRepository.findAll();
    }

    @PostMapping
    public Brinquedo creatToy(@RequestBody Brinquedo brinquedo) {
        return brinquedoRepository.save(brinquedo);
    }

    @PutMapping("/{idBrinquedo}")
    public ResponseEntity<Brinquedo> updateToy(@PathVariable Long idBrinquedo, @RequestBody Brinquedo brinquedo) {
        return brinquedoRepository.findById(idBrinquedo)
                .map(existing -> {
                    brinquedo.setId(idBrinquedo); // força o ID correto
                    return ResponseEntity.ok(brinquedoRepository.save(brinquedo));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{idBrinquedo}")
    public void deleteToy(@PathVariable Long idBrinquedo) {
        brinquedoRepository.deleteById(idBrinquedo);
    }

    @GetMapping("/{idBrinquedo}")
    public ResponseEntity<Brinquedo> findById(@PathVariable long idBrinquedo) {
        Optional<Brinquedo> brinquedo = brinquedoRepository.findById(idBrinquedo);

        if (brinquedo.isPresent()) {
            return ResponseEntity.ok().body(brinquedo.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}
