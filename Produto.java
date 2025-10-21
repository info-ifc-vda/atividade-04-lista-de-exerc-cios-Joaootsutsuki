
public class Produto {

    private String codigo;
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private int estoqueMinimo;

    public Produto(String codigo, int estoqueMinimo, String nome, double preco, int quantidadeEstoque) {
        this.codigo = codigo;
        this.estoqueMinimo = estoqueMinimo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade de venda deve ser maior que 0.");
            return;
        }

        if (quantidade > quantidadeEstoque) {
            System.out.println("Não há estoque suficiente para realizar a venda.");
        } else {
            quantidadeEstoque -= quantidade;

            if (verificarEstoqueBaixo()) {
                System.out.println("Aviso: Estoque baixo do produto " + nome + " (" + quantidadeEstoque + " unidades restantes).");
            }
        }
    }

    public void repor(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade de reposição deve ser maior que 0.");
            return;
        }

        quantidadeEstoque += quantidade;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            System.out.println("Percentual de desconto inválido.");
            return;
        }

        preco = preco * (1 - percentual / 100);
    }

    private boolean verificarEstoqueBaixo() {
        return quantidadeEstoque < estoqueMinimo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("O preço não pode ser negativo.");
            return;
        }
        this.preco = preco;
    }
}
