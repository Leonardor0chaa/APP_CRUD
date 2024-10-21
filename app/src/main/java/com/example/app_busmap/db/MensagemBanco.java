package com.example.app_busmap.db;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.app_busmap.ConexaoBanco;

import java.sql.PreparedStatement;

public class MensagemBanco {
    static public int enviarMensagem(Context ctx, String texto) {
        SharedPreferences sharedPreferences = ctx.getSharedPreferences("usuario",  Context.MODE_PRIVATE);
        String email = sharedPreferences.getString("email", null);
        int resposta = 0;
        try {
            PreparedStatement pst = ConexaoBanco.conectar(ctx).prepareStatement("insert into mensagem (emissorMensagem, email, dataMensagem, texto, statusMensagem) values (?,?,getdate(),?,'ATIVO')");

            pst.setString(1, email);
            pst.setString(2, email);
            pst.setString(3, texto);

            resposta = pst.executeUpdate();
        }
        catch (Exception e) {

        }
        return resposta;
    }
}
