public class Contato {
    private String _nome;
    private String _sobrenome;
    private String _telefone;

    public Contato(String nome, String sobrenome, String telefone) {
        _nome = nome;
        _sobrenome = sobrenome;
        _telefone = telefone;
    }

    public String get_nome() {
        return _nome;
    }
    public String get_sobrenome() {
        return _sobrenome;
    }
    public String get_telefone() {
        return _telefone;
    }
    
    @Override
    public String toString(){
        return "Nome: " + _nome + " " + _sobrenome + " - Telefone: " + _telefone;
    }
    
}
