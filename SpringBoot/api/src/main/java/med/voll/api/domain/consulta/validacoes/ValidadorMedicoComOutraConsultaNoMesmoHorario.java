package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.domain.medico.MedicoRepository;

public class ValidadorMedicoComOutraConsultaNoMesmoHorario {

    private ConsultaRepository repository;

    public void validar (DadosAgendamentoConsulta dados){
        var medicoPossuiConsultaNoMesmoHorario = repository.existsByMedicoIdAndData(dados.idMedico(),dados.data());
        if (medicoPossuiConsultaNoMesmoHorario){
            throw new ValidacaoException("Médico possui outra consulta agendada nesse mesmo horário");
        }
    }

}
