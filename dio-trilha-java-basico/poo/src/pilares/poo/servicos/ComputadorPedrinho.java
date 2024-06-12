package pilares.poo.servicos;

import pilares.poo.servicos.apps.FacebookMessenger;
import pilares.poo.servicos.apps.MSNMessenger;
import pilares.poo.servicos.apps.ServicoMensagemInstantanea;
import pilares.poo.servicos.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
       ServicoMensagemInstantanea smi = null;

       String appEscolhido = "fbm";

       if (appEscolhido.equals("msn")){
           smi = new MSNMessenger();
       }

       else if (appEscolhido.equals("fbm")){
            smi = new FacebookMessenger();
        }

       else if (appEscolhido.equals("tlg")){
           smi = new Telegram();
       }

       smi.enviarMensagem();
       smi.receberMensagem();
    }
}


