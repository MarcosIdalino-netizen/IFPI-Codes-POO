    package Lojaeletronicos;

    public class venda {

        private int numeroVenda;
        private Produto produto;
        private int quantidadeVendida;

        public venda() {

        }

        public void iniciarVenda(int numeroVenda, Produto produto) {
            this.numeroVenda = numeroVenda;
            this.produto = produto;
        }

        public boolean realizarVenda(int quantidade) {
            if (quantidade > 0 && quantidade <= produto.getQtd_estoque()) {
                produto.diminuirEstoque(quantidade);
                this.quantidadeVendida += quantidade;
                System.out.println("Venda realizada com sucesso!");
                return true;
            } else {
                System.out.println("Erro! Não foi possível realizar a venda");
                return false;
            }
         }

         public double calcularTotal() {
            return this.quantidadeVendida * produto.getPreco();
         }

         public void exibirComprovante() {
             System.out.println("----COMPROVANTE----");
             System.out.println("Nome do produto: " + this.produto.getNome());
             System.out.println("Quantidade vendida: " + this.quantidadeVendida);
             System.out.println("Valor total: " + calcularTotal());
         }
    }


