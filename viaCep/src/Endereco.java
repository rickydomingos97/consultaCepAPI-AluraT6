// O record permite criar uma classe que possui um conjunto de atributos e métodos, sem precisar de um construtor. pois ja tem os getters e setters
public record Endereco(String cep, String logradouro,
    String complemento,  String localidade,
    String uf) {
}


