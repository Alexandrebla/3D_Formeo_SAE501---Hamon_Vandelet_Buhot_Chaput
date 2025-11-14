package test.all.controller;

import org.springframework.web.bind.annotation.*;
import test.all.model.Session;
import test.all.Service.SessionService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sessions")
public class SessionController {

    private final SessionService sessionService;

    public SessionController(SessionService sessionService) {
        this.sessionService = sessionService;
    }

    @GetMapping
    public List<Session> getAll() {
        return sessionService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Session> getById(@PathVariable Long id) {
        return sessionService.getById(id);
    }

    @PostMapping
    public Session create(@RequestBody Session session) {
        return sessionService.create(session);
    }

    @PutMapping("/{id}")
    public Session update(@PathVariable Long id, @RequestBody Session session) {
        return sessionService.update(id, session);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        sessionService.delete(id);
    }
}
