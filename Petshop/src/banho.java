// Classe Banho
public class banho extends servico {


    @Override
    public void descricao() {
        System.out.println("Você escolheu o serviço de banho " );
    }

    @Override
    public void preco() {
        System.out.println("O serviço de banho para custa R$: 23,50.");
    }
}