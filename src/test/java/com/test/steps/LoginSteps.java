package com.test.steps;

import com.test.screen.ScreenLogin;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginSteps {

    ScreenLogin login = new ScreenLogin();

    @Quando("^eu espero (\\d+) segundos$")
    public void eu_espero_segundos(int arg1) throws Throwable {

    }
    @Quando("^eu clicar em cadastrar$")
    public void eu_clicar_em_cadastrar() throws InterruptedException {
        login.QuandoClicaEmCadastrar();
    }


    @Dado("^que eu escreva as informações do usuário$")
    public void que_eu_escreva_as_informações_do_usuário(){
        login.DadoEscreveEmail();
        login.DadoEscreveNome();
        login.DadoEscreveSenha();

    }
    @Então("^vou clicar em entrar$")
    public void vou_clicar_em_entrar() throws InterruptedException {
        login.EntaoClicaParaEntrar();
    }


    }




    //@Então("^vou estar logado no app$")
    //public void vou_estar_logado_no_app() {
      //  System.out.println("LOGADO COM SUCESSO");

    //}


