package com.test.screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ScreenLogin extends BaseScreen{//utilizando os metodos do BaseScreen

    @AndroidFindBy(id = "com.cnpx.previa:id/btn_sign")  //clicando no botão cadastro
    private static MobileElement btnCadastro;
    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'E-mail')]")//preenchendo o Email
    private MobileElement campoEmail;
    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Nome e sobrenome')]") //preenchendo o Nome e sobrenome
    private MobileElement campoNome;
    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Senha')]") //preenchendo a senha
    private MobileElement campoSenha;

    @AndroidFindBy(id = "com.cnpx.previa:id/btn_register") // clicando no botão registrar
    private MobileElement btnLogin;

    public void QuandoClicaEmCadastrar() throws InterruptedException {
        Thread.sleep(3000);  //aguardando 3segundos
        btnCadastro.click(); //clicando no botao entrar

    }

    public void DadoEscreveEmail(){
        campoEmail.sendKeys("rudsonlee@gmail.com"); //digitar o email
    }

    public void DadoEscreveNome(){
        campoNome.sendKeys("Rudson Lee"); //digitar o nome
    }

    public void DadoEscreveSenha(){
        campoSenha.sendKeys("lee553322");// digitar a senha
    }

   public void EntaoClicaParaEntrar() throws InterruptedException {
       Thread.sleep(3000);  //aguardando 5segundos
       btnLogin.click(); //clicando no botao entrar
    }

    //public void cadastro () throws InterruptedException {




    }


