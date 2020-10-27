package br.com.bossini.usjt_ccp1an_bua_chat_com_firebase;

import java.util.Date;

public class Mensagem {

    private String texto;
    private String usuario;
    private Date data;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
