public class consultaVeterinaria extends servico {

    @Override
    public void descricao() {
        System.out.println("Você escolheu o serviço de consulta veterinária ");
    }

    @Override
    public void preco() {
        System.out.println("O serviço de consulta veterinária  custa R$: 20,00."); 
    }
}