package api.com.meizy.service;

import api.com.meizy.dto.UsuarioCadastroDTO;
import api.com.meizy.entity.Usuario;
import api.com.meizy.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario cadastrar(UsuarioCadastroDTO dto) {
        if (usuarioRepository.existsByEmail(dto.getEmail())) {
            throw new IllegalArgumentException("E-mail já cadastrado.");
        }

        Usuario usuario = new Usuario(dto.getNome(), dto.getEmail(), dto.getSenha());
        return usuarioRepository.save(usuario);
    }
}
