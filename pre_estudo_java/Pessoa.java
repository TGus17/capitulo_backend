package pre_estudo_java;
public class Pessoa {
    //#region Atributos
    private String nome;
    private Integer idade;
    //#endregion

    //#region Construtores
    //public Pessoa() {}

    public Pessoa(String name, Integer age) {
        this.nome = name;
        this.idade = age;
    }
    //#endregion

    //#region Getters and Setters
    public void setNome(String name) {
        this.nome = name;
    }

    public void setIdade(Integer age) {
        this.idade = age;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getIdade() {
        return this.idade;
    }
    //#endregion
}

/**
 * Métodos acessores:
 * 
 * PUBLIC: Indica que qualquer um pode acessar o elemento
 * PRIVATE: Indica que somente a classe pode acessar
 * PROTECTED: Indica que somente a classe e seus filhos podem acessar
 * DEFAULT: Indica que a classe, seus filhos e as classes no mesmo package podem acessar
 */