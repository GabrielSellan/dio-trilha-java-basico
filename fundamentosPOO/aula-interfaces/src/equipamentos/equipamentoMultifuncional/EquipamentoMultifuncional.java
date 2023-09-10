package equipamentos.equipamentoMultifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora{
	
	public void copiar() {
		System.out.println("Copiando");
	}
	
	public void imprimir() {
		System.out.println("Imprimindo");
	}
	
	public void digitalizar() {
		System.out.println("Digitalizando");
	}
	
}
