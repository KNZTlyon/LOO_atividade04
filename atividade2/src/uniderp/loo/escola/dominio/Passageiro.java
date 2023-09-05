package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Passageiro extends BasePessoa {

    private String contaCoreente;
    private String cracha;
    public String getContaCoreente() {
        return contaCoreente;
    }
    public void setContaCoreente(String contaCoreente) {
        this.contaCoreente = contaCoreente;
    }
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public Passageiro(int codigo, String nome, String email, String telefone, LocalDate dataNascimento, String usuario,
            String senha, String registro, String contaCoreente, String cracha) {
        super(codigo, nome, email, telefone, dataNascimento, usuario, senha, registro);
        this.contaCoreente = contaCoreente;
        this.cracha = cracha;
    }

    
    
}
