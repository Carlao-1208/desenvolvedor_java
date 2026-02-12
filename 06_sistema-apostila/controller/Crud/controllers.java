public class controllers {

}
@Controller 
public class TarefaController { 
 
    @Autowired 
    private TarefaRepository tarefaRepository; 
 
    @GetMapping("/tarefas") 
    public String listarTarefas(Model model) { 
        model.addAttribute("listaTarefas", tarefaRepository.findAll()); 
        return "lista_tarefas"; // Retorna o template Thymeleaf 
    } 
 
    @PostMapping("/salvarTarefa") 
    public String salvarTarefa(Tarefa tarefa) { 
        tarefaRepository.save(tarefa); 
        return "redirect:/tarefas"; // Redireciona para a lista após salvar 
    } 
} 