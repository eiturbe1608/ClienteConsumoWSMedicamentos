package org.medicamento.cliente.MedicamentosClientes;

import java.util.List;

import org.certificatic.medicamento.service.Medicamento;
import org.certificatic.medicamento.service.TipoEnum;



/**
 * Hello world!
 * 
 * wsimport -keep -verbose
 * http://tarjetas-digitales.herokuapp.com/TarjetaService\?wsdl
 *
 */
public class App {

	public static void main(String[] args) {
		ClienteMedicamento cliente= new ClienteMedicamento();
		if (args[0].equals("crear")) {
			Medicamento medicamento= new Medicamento();
			medicamento.setFechaCaducidad(args[1]);
			medicamento.setNombreMedicina(args[2]);
			medicamento.setPrecioVenta(Double.valueOf(args[3]));
			medicamento.setPrivaeCantidadInventario(Integer.parseInt(args[4]));
			medicamento.setSustanciaActiva(args[5]);
			medicamento.setTipo(TipoEnum.ORIGINAL);
			cliente.crearMedicamento(medicamento);
			
		}
		else {
			List<Medicamento> medicamentos= cliente.obtenerTodos();
			
			for(Medicamento medicamento: medicamentos) {
				
				System.out.println(medicamento);
			}
			
		}

	}
}
