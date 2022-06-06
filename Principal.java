public class Principal {

    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        pessoaFisica.setEndereco("Rua Dona Nena");
        pessoaFisica.setNome("Marcelo");
        pessoaFisica.setCPF(564858997);

        pessoaJuridica.setCNPJ(837420213);;
        pessoaJuridica.setNome("Pastelaria Girassol");;
        pessoaJuridica.setEndereco("Rua Epaminondas de Toledo Pizza");
        
        System.out.println(pessoaFisica.getCPF());
        System.out.println(pessoaFisica.getEndereco());
        System.out.println(pessoaFisica.getNome());
        System.out.println(pessoaJuridica.getCNPJ());
        System.out.println(pessoaJuridica.getNome());
        System.out.println(pessoaJuridica.getEndereco());
        
    }
    
}
