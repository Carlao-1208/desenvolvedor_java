
import br.com.curso.demo.model.Usuario;
import br.com.curso.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class AutenticacaoService implements UserDetailsService {
 @Autowired
 private UsuarioRepository usuarioRepository;
 @Override
 public UserDetails loadUserByUsername(String username) throws 
UsernameNotFoundException {
 Usuario usuario = usuarioRepository.findByLogin(username);
 
 if (usuario == null) {
 throw new UsernameNotFoundException("Usuário não encontrado!");
 }
 
 return usuario;
 }
}