package classe.desafioModulo;

public class Usuario {
    public String nome;
    public String email;

    public boolean equals(Object objeto){
        boolean result = false;
        if(objeto instanceof Usuario){
            Usuario outro = (Usuario) objeto;
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);
            result = nomeIgual && emailIgual;
        }
        return result;
    }
    
}
