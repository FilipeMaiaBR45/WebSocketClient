package br.com.example.websocketclient;

import com.google.gson.Gson;

public class Message {
    private String event;
    private Data data;

    public Message(String event, String channel, String serialTablet) {
        this.event = event;
        this.data = new Data(channel, new Dados(serialTablet));
    }

    class Data {
        String channel;
        Dados dados;

        Data(String channel, Dados dados) {
            this.channel = channel;
            this.dados = dados;
        }
    }

    class Dados {
        String serial_tablet;

        Dados(String serialTablet) {
            this.serial_tablet = serialTablet;
        }
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}