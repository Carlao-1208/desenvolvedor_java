@Service 
public class ImplementacaoUserDetailsService implements UserDetailsService { 
 
    @Autowired 
    private UsuarioRepository usuarioRepository; 
 
    @Override 
    public UserDetails loadUserByUsername(String login) throws 
UsernameNotFoundException { 
        // Busca o usuário no banco 
        Usuario usuario = usuarioRepository.findByLogin(login);  
         
        if (usuario == null) { 
            throw new UsernameNotFoundException("Usuário não encontrado"); 
        } 
        // Retorna o objeto usuário que implementa UserDetails [8] 
        return usuario;  
    } 
}public class UserDetailsService {

}
