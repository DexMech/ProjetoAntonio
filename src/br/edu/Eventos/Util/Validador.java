package br.edu.Eventos.Util;

import br.edu.Eventos.Modelos.Evento;

public class Validador {

	public boolean valida(Evento evento) {
		if(evento.getAuditorio()=="" || evento.getData()==null
		|| evento.getFuncionario()=="" || evento.getHoraFim()=="" || evento.getHoraInicio()==""
		|| evento.getLocal()=="" || evento.getObservacao()=="" || evento.getPrioridade()==""
		|| evento.getRamal()=="" || evento.getSetor()=="" || evento.getSolicitante()==""){
				
					
		return false;
		}
		return true;

}
	
}
