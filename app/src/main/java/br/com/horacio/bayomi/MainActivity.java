package br.com.horacio.bayomi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txtLogin = (TextView) findViewById(R.id.txtLogin);
                TextView txtSenha = (TextView) findViewById(R.id.txtSenha);
                String login = txtLogin.getText().toString();
                String senha = txtSenha.getText().toString();
                if (login.equals("admin") && senha.equals("admin")) {
                    alert("Login realizado com sucesso");
                    setContentView(R.layout.activity_menu_lateral);
                } else {
                    alert("Login ou senha incorretos");
                }

            }
        });
    }

    private void alert(String s) {
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }

}
