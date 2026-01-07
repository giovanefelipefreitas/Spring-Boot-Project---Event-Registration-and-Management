package com.example.demo.service;

import com.example.demo.model.Evento;
import com.example.demo.repository.EventoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EventoService {

    private final EventoRepository repository;

    public EventoService(EventoRepository repository) {
        this.repository = repository;
    }

    
    public Evento salvar(Evento evento) {
        return repository.save(evento);
    }

    
    public List<Evento> listarTodos() {
        return repository.findAll();
    }

    
    public Evento buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Evento não encontrado"));
    }

    
    public Evento atualizar(Long id, Evento eventoAtualizado) {
        Evento evento = buscarPorId(id);
        evento.setDescricao(eventoAtualizado.getDescricao());
        evento.setData(eventoAtualizado.getData());
        return repository.save(evento);
    }

    
    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
