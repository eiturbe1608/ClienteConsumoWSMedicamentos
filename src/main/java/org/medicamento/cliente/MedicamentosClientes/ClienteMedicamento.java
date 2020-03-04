package org.medicamento.cliente.MedicamentosClientes;


import java.util.List;

import org.certificatic.medicamento.service.Medicamento;
import org.certificatic.medicamento.service.MedicamentoService;
import org.certificatic.medicamento.service.MedicamentoServiceImplService;

public class ClienteMedicamento {
	
	private MedicamentoService medicamentoservice;
	
	public Medicamento crearMedicamento(Medicamento medicamento) {
		medicamentoservice = new MedicamentoServiceImplService().getMedicamentoServiceImplPort();
		return medicamentoservice.crearMedicamento(medicamento);
	}

	
	public List<Medicamento> obtenerTodos(){
		medicamentoservice = new MedicamentoServiceImplService().getMedicamentoServiceImplPort();
		return medicamentoservice.obtenerTodos();
				
	}
	
}
