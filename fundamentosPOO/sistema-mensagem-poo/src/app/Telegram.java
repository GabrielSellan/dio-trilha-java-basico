package app;

public class Telegram extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Telegram");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
		salvarHistoricoMensagem();
	}
	
	public void salvarHistoricoMensagem() {
		System.out.println("mensagem salva telegram");
	}
}
