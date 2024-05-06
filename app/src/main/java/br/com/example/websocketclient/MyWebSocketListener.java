package br.com.example.websocketclient;

import android.util.Log;

import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

public class MyWebSocketListener extends WebSocketListener {
    @Override
    public void onOpen(WebSocket webSocket, okhttp3.Response response) {
        super.onOpen(webSocket, response);
        // Conexão aberta
        Log.i("websockettessssssss", "conectou no servidor");
    }

    @Override
    public void onMessage(WebSocket webSocket, String text) {
        super.onMessage(webSocket, text);
        // Mensagem recebida
    }

    @Override
    public void onMessage(WebSocket webSocket, ByteString bytes) {
        super.onMessage(webSocket, bytes);
        // Mensagem recebida (bytes)
    }

    @Override
    public void onClosed(WebSocket webSocket, int code, String reason) {
        super.onClosed(webSocket, code, reason);
        // Conexão fechada
    }

    @Override
    public void onFailure(WebSocket webSocket, Throwable t, okhttp3.Response response) {
        super.onFailure(webSocket, t, response);
        // Erro de conexão
        Log.i("websockettessssssss", "erro de conecxão " + t);
    }
}