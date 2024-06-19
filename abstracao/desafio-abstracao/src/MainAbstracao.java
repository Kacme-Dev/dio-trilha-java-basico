import java.util.Scanner;

// Classe abstrata que define um veículo
abstract class Veiculo {
    private String marca;
    private String modelo;
    private double preco;

    // Construtor
    public Veiculo(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    // Método abstrato para calcular o preço final com desconto ou acréscimo
    public abstract double calcularPrecoFinal(boolean aVista, int numParcelas);

    // Métodos getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    protected abstract void exibirInformacoes(boolean b, int i);
}

// Classe concreta que estende Veiculo
class Carro extends Veiculo {
    private int ano;

    // Construtor
    public Carro(String marca, String modelo, double preco, int ano) {
        super(marca, modelo, preco);
        this.ano = ano;
    }

    // Implementação do método abstrato calcularPrecoFinal()
    @Override
    public double calcularPrecoFinal(boolean aVista, int numParcelas) {
        double precoFinal = getPreco();
        
        if (aVista) {
            precoFinal *= 0.90; // 10% de desconto
        } else {
            double juros = 0.008 * numParcelas; // 0.8% de juros ao mês
            precoFinal *= (1 + juros); // Aplica os juros
        }
        
        return precoFinal;
    }

    // Método específico de Carro
    public void exibirInformacoes(boolean aVista, int numParcelas) {
        double precoFinal = calcularPrecoFinal(aVista, numParcelas);
        
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + ano);
        System.out.println("Preço: R$ " + getPreco());
        
        if (aVista) {
            System.out.println("Forma de pagamento: À vista");
            System.out.println("Desconto aplicado: 10%");
        } else {
            System.out.println("Forma de pagamento: À prazo");
            System.out.println("Parcelas: " + numParcelas);
            System.out.println("Acréscimo por parcela: 0.8% ao mês");
        }
        
        System.out.println("Preço final: R$ " + precoFinal);
    }
}

// Classe principal para testar o programa
public class MainAbstracao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo diferentes modelos de carros com seus preços
        Veiculo[] veiculos = {
            new Carro("Toyota", "Corolla", 100000.00, 2023),
            new Carro("Honda", "Civic", 95000.00, 2023),
            new Carro("Volkswagen", "Golf", 85000.00, 2023),
            new Carro("Ford", "Fiesta", 75000.00, 2023),
            new Carro("Chevrolet", "Onix", 65000.00, 2023)
        };

        // Exibindo opções para o usuário
        System.out.println("Escolha um dos modelos abaixo:");

        for (int i = 0; i < veiculos.length; i++) {
            Veiculo veiculo = veiculos[i];
            System.out.println((i + 1) + ". " + veiculo.getMarca() + " " + veiculo.getModelo() + " - R$ " + veiculo.getPreco());
        }

        // Solicitando escolha do usuário
        System.out.print("Digite o número correspondente ao modelo desejado: ");
        int escolha = scanner.nextInt();

        // Verificando escolha válida
        if (escolha < 1 || escolha > veiculos.length) {
            System.out.println("Escolha inválida!");
            return;
        }

        Veiculo veiculoEscolhido = veiculos[escolha - 1];

        // Solicitando forma de pagamento
        System.out.print("Deseja pagar à vista (1) ou à prazo (2)? ");
        int formaPagamento = scanner.nextInt();

        if (formaPagamento == 1) {
            // Pagamento à vista
            veiculoEscolhido.exibirInformacoes(true, 0);
        } else if (formaPagamento == 2) {
            // Pagamento à prazo
            System.out.print("Quantas parcelas deseja (até 36x)? ");
            int numParcelas = scanner.nextInt();

            if (numParcelas < 1 || numParcelas > 36) {
                System.out.println("Número de parcelas inválido!");
                return;
            }

            veiculoEscolhido.exibirInformacoes(false, numParcelas);
        } else {
            System.out.println("Opção de pagamento inválida!");
        }

        scanner.close();
    }
}
