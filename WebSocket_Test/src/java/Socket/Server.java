package Socket;


import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/test")
public class Server {
    
    
    @OnOpen
    public void onOpen(Session session) {
        // Metodo eseguito all'apertura della connessione
        System.out.println("Apertura connessione");
    }
 
    @OnMessage
    public String onMessage(String message, Session session) {
        // Metodo eseguito alla ricezione di un messaggio
        // La stringa 'message' rappresenta il messaggio
 
        // Il valore di ritorno di questo metodo sara' automaticamente
        // inviato come risposta al client. Ad esempio:
        return "Server received [" + message + "]";
    }
 
    @OnClose
    public void onClose(Session session) {
       System.out.println("Chiusura connessione");
    }
 
    @OnError
    public void onError(Throwable exception, Session session) {
        // Metodo eseguito in caso di errore
        System.out.println("Errore!!");
    }
}
