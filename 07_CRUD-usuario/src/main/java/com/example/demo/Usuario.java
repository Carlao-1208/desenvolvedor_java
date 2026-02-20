import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;
@Entity
public class Usuario implements UserDetails {
 @Id
 private String login; // O login será o ID (chave primária)
 private String nomeCompleto;
 private String senha;
 // Getters e Setters
 public String getLogin() { return login; }
 public void setLogin(String login) { this.login = login; }
 public String getNomeCompleto() { return nomeCompleto; }
 public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = 
nomeCompleto; }
 public String getSenha() { return senha; }
 public void setSenha(String senha) { this.senha = senha; }
 // Métodos da interface UserDetails [2]
 @Override
 public Collection<? extends GrantedAuthority> getAuthorities() {
 return null; // Simplificado: sem perfis de acesso (roles) por enquanto
 }
 @Override
 public String getPassword() {
 return this.senha; // Retorna a senha para validação
 }
 @Override
 public String getUsername() {
 return this.login; // Retorna o login como "nome de usuário"
 }
 @Override
 public boolean isAccountNonExpired() { return true; }
 @Override
 public boolean isAccountNonLocked() { return true; }
 @Override
 public boolean isCredentialsNonExpired() { return true; }
 @Override
 public boolean isEnabled() { return true; }
}