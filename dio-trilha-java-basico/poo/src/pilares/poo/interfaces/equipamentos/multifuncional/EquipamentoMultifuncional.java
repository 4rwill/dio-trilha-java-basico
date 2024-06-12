package pilares.poo.interfaces.equipamentos.multifuncional;

import pilares.poo.interfaces.equipamentos.copiadora.Copiadora;
import pilares.poo.interfaces.equipamentos.digitalizadora.Digitalizadora;
import pilares.poo.interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");

    }

    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");

    }

    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");

    }
}
