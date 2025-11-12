package Controller;

import Model.Emargement;
import Service.EmargementService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emargements")
public class EmargementController {

    private final EmargementService emargementService;

    public EmargementController(EmargementService emargementService) {
        this.emargementService = emargementService;
    }

    @GetMapping
    public List<Emargement> getAllEmargements() {
        return emargementService.getAllEmargements();
    }

    @GetMapping("/{id}")
    public Optional<Emargement> getEmargementById(@PathVariable Long id) {
        return emargementService.getEmargementById(id);
    }

    @PostMapping
    public Emargement addEmargement(@RequestBody Emargement emargement) {
        return emargementService.addEmargement(emargement);
    }

    @PutMapping("/{id}")
    public Emargement updateEmargement(@PathVariable Long id, @RequestBody Emargement emargement) {
        return emargementService.updateEmargement(id, emargement);
    }

    @DeleteMapping("/{id}")
    public void deleteEmargement(@PathVariable Long id) {
        emargementService.deleteEmargement(id);
    }
}
