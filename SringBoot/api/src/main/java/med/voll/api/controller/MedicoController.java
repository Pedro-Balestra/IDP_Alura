package med.voll.api.controller;

import med.voll.api.medico.DadosCadatroMedico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadatroMedico dados){
        System.out.println(dados);
    }

}
