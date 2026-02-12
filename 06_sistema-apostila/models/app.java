import java.util.Collection;

public class app {
    @Entity 
public class Usuario implements UserDetails { // [6] 
     
    @Id 
    @Column(nullable = false, unique = true) 
    private String login; // Usaremos o login como ID [6] 
     
    private String nomeCompleto; 
    private String senha; 
 
    // Getters e Setters... 
 
    // Métodos obrigatórios da interface UserDetails: 
    @Override 
    public Collection<? extends GrantedAuthority> getAuthorities() { 
        return null; // Simplificação para este tutorial (sem roles por enquanto) 
    } 
 
    @Override 
    public String getPassword() { 
        return this.senha; // Retorna a senha definida na classe [6] 
    } 
 
    @Override 
    public String getUsername() { 
        return this.login; // Retorna o login [6] 
    } 
     
    // Outros métodos booleanos (isAccountNonExpired, etc.) podem retornar true [6] 
} 


public interface UsuarioRepository extends JpaRepository<Usuario, String> { 
    Usuario findByLogin(String login); // Método para buscar usuário pelo login [7] 

    Object clone() throws CloneNotSupportedException;

    @Override
    boolean equals(Object obj);
}
}



