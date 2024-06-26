    package primeirobi.atividades.sysLista5;

    public class Main {
        public static void main(String[] args) {
            
            Vendedor vendedor1 = new Vendedor("João", 30, "Myy Plant", "Cidade A", "Bairro A", "Rua A", 2000.0);
            vendedor1.apresentarSe();
            System.out.println("Média dos salários: " + vendedor1.calcularMedia());
            System.out.println("Bônus: " + vendedor1.calcularBonus());
            System.out.println();

            
            Cliente cliente1 = new Cliente("Maria", 25, "Cidade B", "Bairro B", "Rua B");
            cliente1.apresentarSe();
            System.out.println();

            
            Loja loja1 = new Loja("Myy Plant", "Myy Plant LTDA", "123456789", "Cidade C", "Bairro C", "Rua C");
            loja1.apresentarSe();
            
            // Add vendedor1 and cliente1 to loja1
            loja1.vendedores.add(vendedor1);
            loja1.clientes.add(cliente1);
            
            System.out.println("Quantidade de clientes: " + loja1.contarClientes());
            System.out.println("Quantidade de vendedores: " + loja1.contarVendedores());
        }
    }