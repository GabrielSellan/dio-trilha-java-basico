package app;

public class FacebookMessenger extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Facebook Messenger");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
		salvarHistoricoMensagem();
	}
	
	public void salvarHistoricoMensagem() {
		System.out.println("mensagem salva fcb");
	}
}