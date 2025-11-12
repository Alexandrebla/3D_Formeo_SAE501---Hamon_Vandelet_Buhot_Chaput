package Controller;

import Model.Intervenant;
import Service.IntervenantService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/intervenants")
public class IntervenantController {

    private final IntervenantService intervenantService;

    public IntervenantController(IntervenantService intervenantService) {
        this.intervenantService = intervenantService;
    }

    @GetMapping
    public List<Intervenant> getAllIntervenants() {
        return intervenantService.getAllIntervenants();
    }

    @GetMapping("/{id}")
    public Optional<Intervenant> getIntervenantById(@PathVariable Long id) {
        return intervenantService.getIntervenantById(id);
    }

    @PostMapping
    public Intervenant addIntervenant(@RequestBody Intervenant intervenant) {
        return intervenantService.addIntervenant(intervenant);
    }

    @PutMapping("/{id}")
    public Intervenant updateIntervenant(@PathVariable Long id, @RequestBody Intervenant intervenant) {
        return intervenantService.updateIntervenant(id, intervenant);
    }

    @DeleteMapping("/{id}")
    public void deleteIntervenant(@PathVariable Long id) {
        intervenantService.deleteIntervenant(id);
    }
}
