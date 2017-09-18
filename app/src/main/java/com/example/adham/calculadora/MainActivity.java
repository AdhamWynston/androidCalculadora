package com.example.adham.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private double memoria;
    private String operadores;
    private String teste;
    // Variaveis para armazenar os valores
    boolean flag = true;
    EditText txt_visor;
//Teclado Numerico
    private Button btn_0;
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;
    private Button btn_6;
    private Button btn_7;
    private Button btn_8;
    private Button btn_9;
    /* componente button, para inserir um ponto no visor pra operações
     * com números decimais */
    private Button btn_ponto;

    /* componentes button para realizar as as quatro operações matemáticas */
    private Button btn_soma;
    private Button btn_subt;
    private Button btn_multi;
    private Button btn_divi;
    private Button btn_pf;
    private Button btn_porcentagem;
    private Button btn_cos;
    private Button btn_pa;
    private EditText txt_valor;
    // Fazer o calculo
    private Button btn_igual;
    // Limpar a tela
    private Button btn_limpar;
    // Preencher o visor
    private String ult = null;
    private String aux = null;
    private int x=0;

    public void carregar(){
        txt_visor = (EditText) findViewById(R.id.txt_visor);
        txt_valor = (EditText) findViewById(R.id.txt_valor);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_soma = (Button) findViewById(R.id.btn_soma);
        btn_subt = (Button) findViewById(R.id.btn_subt);
        btn_multi = (Button) findViewById(R.id.btn_multi);
        btn_divi = (Button) findViewById(R.id.btn_divi);
        btn_ponto = (Button) findViewById(R.id.btn_ponto);
        btn_igual = (Button) findViewById(R.id.btn_igual);
        btn_porcentagem = (Button) findViewById(R.id.btn_porcentagem);
        btn_cos = (Button) findViewById(R.id.btn_cos);
        btn_pf = (Button) findViewById(R.id.btn_pf);
        btn_pa = (Button) findViewById(R.id.btn_pa);
        btn_limpar = (Button) findViewById(R.id.btn_limpar);
    }

    public void listeners(){
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);

        btn_soma.setOnClickListener(this);
        btn_subt.setOnClickListener(this);
        btn_multi.setOnClickListener(this);
        btn_divi.setOnClickListener(this);

        btn_ponto.setOnClickListener(this);
        btn_limpar.setOnClickListener(this);
        btn_igual.setOnClickListener(this);
        btn_cos.setOnClickListener(this);
        btn_pf.setOnClickListener(this);
        btn_porcentagem.setOnClickListener(this);
        btn_pa.setOnClickListener(this);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carregar();
        listeners();
    }
    // Reconhecer o teclado númerico
    private void tecladoNumerico(int leNumero) {

        if (txt_visor.getText().toString().trim().equals("0.0")) {

            limparVisor();
            String textvisor = txt_visor.getText().toString();
            String textvalor = txt_valor.getText().toString();
            String numero = String.valueOf(leNumero);
            aux = textvisor + numero;
            ult = textvalor + numero;
            txt_visor.setText(aux);
            txt_valor.setText(ult);


        } else {

            String textvisor = txt_visor.getText().toString();
            String textvalor = txt_valor.getText().toString();
            String numero = String.valueOf(leNumero);
            aux = textvisor + numero;
            ult = textvalor + numero;
            txt_visor.setText(aux);
            txt_valor.setText(ult);

        }

    }
    /* Função para inserção do ponto */
    private void ponto(String ponto){

        String textvisor = txt_visor.getText().toString();
        txt_visor.setText(textvisor + ponto);

    }

    /* Função para limpar o visor */
    private void limparVisor() {

        txt_visor.setText("");
        txt_valor.setText("");

    }
    private void limparValor() {

        txt_valor.setText("");

    }
    //Limpa a memoria
    //implementar as 4 operações
    private void operacoes(String operadores) {
            this.operadores = operadores;
            String input = txt_visor.getText().toString() + operadores;
            txt_visor.setText(input);
        }
        private void porc(){
            double porc = (memoria / 100) * memoria;
        }
    //Feito os calculos
    private void igual() {

        if(!txt_visor.getText().toString().trim().equals("")) {
            teste = txt_visor.getText().toString();
        }else{
            teste = "";
        }
        txt_visor.setText(String.valueOf(calcular(teste)));

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btn_0:
            flag = true;
                tecladoNumerico(0);
                break;

            case R.id.btn_1:
                flag = true;
                tecladoNumerico(1);
                break;

            case R.id.btn_2:
                flag = true;
                tecladoNumerico(2);
                break;

            case R.id.btn_3:
                flag = true;
                tecladoNumerico(3);
                break;

            case R.id.btn_4:
                flag = true;
                tecladoNumerico(4);
                break;

            case R.id.btn_5:
                flag = true;
                tecladoNumerico(5);
                break;

            case R.id.btn_6:
                flag = true;
                tecladoNumerico(6);
                break;

            case R.id.btn_7:
                flag = true;
                tecladoNumerico(7);
                break;

            case R.id.btn_8:
                flag = true;
                tecladoNumerico(8);
                break;

            case R.id.btn_9:
                flag = true;
                tecladoNumerico(9);
                break;

            case R.id.btn_limpar:
                limparVisor();
                break;

            case R.id.btn_igual:
                flag = true;
                igual();
                break;

            case R.id.btn_ponto:
                flag = false;
                ponto(".");
                break;

            case R.id.btn_soma:
                flag = false;
                operacoes("+");
                limparValor();
                break;

            case R.id.btn_subt:
                flag = false;
                operacoes("-");
                break;

            case R.id.btn_multi:
                flag = false;
                operacoes("*");
                break;

            case R.id.btn_divi:
                flag = false;
                operacoes("/");
                break;
            case R.id.btn_pa:
                flag = false;
                operacoes("(");
                break;
            case R.id.btn_pf:
                flag = false;
                operacoes(")");
                break;
            case R.id.btn_cos:
                flag = false;
                operacoes("cos");
                break;
            case R.id.btn_porcentagem:
                operacoes("%");
                break;
        }


    }

    public static double calcular(final String str) {

        return new Object() {
            int position = -1, ch;

            void nextChar() {
                ch = (++position < str.length()) ? str.charAt(position) : -1;
            }

            boolean retirar(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpressao();
                if (position < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }


            double parseExpressao() {
                double x = parseTermo();
                for (;;) {
                    if      (retirar('+')) x += parseTermo(); // adição
                    else if (retirar('-')) x -= parseTermo(); // subtração
                    else return x;
                }
            }

            double parseTermo() {
                double x = parseFator();
                for (;;) {
                    if      (retirar('*')) x *= parseFator(); // multiplicação
                    else if (retirar('/')) x /= parseFator(); // divisão
                    else return x;
                }
            }

            double parseFator() {
                if (retirar('+')) return parseFator();
                if (retirar('-')) return -parseFator();

                double x;
                int startposition = this.position;
                if (retirar('(')) { // parentheses
                    x = parseExpressao();
                    retirar(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // números
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startposition, this.position));
                } else if (ch >= 'a' && ch <= 'z') { // funções
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startposition, this.position);
                    x = parseFator();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("cos")) x = Math.cos(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (retirar('^')) x = Math.pow(x, parseFator()); // exponeciação

                return x;
            }
        }.parse();
    }
}
