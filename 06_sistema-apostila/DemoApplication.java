package br.com.curso.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.com.curso.demo.model.Usuario;
import br.com.curso.demo.repository.UsuarioRepository;

@SpringBootApplication
public class DemoApplication {

    public DemoApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner init(UsuarioRepository repo, PasswordEncoder encoder) {
        return args -> {

            if (repo.findByLogin("admin") == null) {

                Usuario u = new Usuario();
                u.setLogin("admin");
                u.setNomeCompleto("Administrador");
                u.setSenha(encoder.encode("123456"));

                repo.save(u);
            }
        };
    }
}
