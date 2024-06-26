package br.com.example.websocketclient;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

public class WebSocketClient {
    private WebSocket webSocket;

    public void connect(String url, WebSocketListener listener) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        webSocket = client.newWebSocket(request, listener);
        client.dispatcher().executorService().shutdown();
    }

    public void disconnect() {
        if (webSocket != null) {
            webSocket.cancel();
        }
    }

    public void sendMessage(Message message) {

         message = new Message("pusher:subscribe", "dados-tablets", "ASDG4524");
        String jsonMessage = message.toJson();
        if (webSocket != null) {
            webSocket.send(jsonMessage);
        }
    }

    public void receiverMessage() {
        if (webSocket != null) {
            webSocket.request();
        }
    }
}