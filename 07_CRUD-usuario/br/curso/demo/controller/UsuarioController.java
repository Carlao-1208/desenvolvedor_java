import br.com.curso.demo.model.Usuario;
import br.com.curso.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class UsuarioController {
 @Autowired
 private UsuarioRepository repository;
 @Autowired
 private PasswordEncoder passwordEncoder; // Injeta o codificador
 // Página de Login Personalizada
 @GetMapping("/login")
 public String loginPage() {
 return "login"; // Retorna o arquivo login.html
 }
 // Página Principal (Protegida)
 @GetMapping("/home")
 public String homePage(Model model) {
 model.addAttribute("usuarios", repository.findAll());
 return "home"; // Retorna home.html
 }
 // Formulário de Cadastro de Novo Usuário
 @GetMapping("/cadastro")
 public String cadastroPage() {
 return "cadastro"; // Retorna cadastro.html
 }
 // Ação de Salvar Usuário
 @PostMapping("/salvarUsuario")
 public String salvarUsuario(Usuario usuario) {
 // Criptografa a senha antes de salvar [6]
 String senhaCriptografada = passwordEncoder.encode(usuario.getSenha());
 usuario.setSenha(senhaCriptografada);
 
 repository.save(usuario);
 return "redirect:/login"; // Redireciona para o login após cadastrar
 }
}
