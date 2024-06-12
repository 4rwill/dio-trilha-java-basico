package pilares.poo.interfaces.estabelecimento;

import pilares.poo.interfaces.equipamentos.copiadora.Copiadora;
import pilares.poo.interfaces.equipamentos.digitalizadora.Digitalizadora;
import pilares.poo.interfaces.equipamentos.impressora.Deskjet;
import pilares.poo.interfaces.equipamentos.impressora.Impressora;
import pilares.poo.interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
