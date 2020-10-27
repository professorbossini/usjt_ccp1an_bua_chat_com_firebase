package br.com.bossini.usjt_ccp1an_bua_chat_com_firebase;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ChatViewHolder extends RecyclerView.ViewHolder {
    TextView dataNomeTextView;
    TextView mensagemTextView;

    ChatViewHolder (View raiz){
        super(raiz);
        dataNomeTextView = raiz.findViewById(R.id.dataNomeTextView);
        mensagemTextView = raiz.findViewById(R.id.mensagemTextView);
    }

}
