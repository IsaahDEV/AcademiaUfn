import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		ArrayList<animal> animais = new ArrayList();
		ArrayList<agendar> agendamentos = new ArrayList<>(); 
		
// interação com o sistema 
		   do{
			      switch(agendar.menu()){
			        case 1:
			        	
			        	int escolha = 0;
			        	// agendamento do animal
			        	System.out.println("Seja bem vindo ao sistema de cadastro \n Digite 1 para cadastrar um cachorro "
			        			+ "\n Digite 2 para cadastrar um gato: \n");
			        	escolha = leitor.nextInt();
			        	
			        	if(escolha == 1) {
			        		String nome; 
			        		String raca;
			        		String dataNascimento;
			        		String proprietario;
			        		String especie = "Cachorro";
			        		
			        		leitor.nextLine();
			        		
			        		System.out.println("Digite um nome do animal: \n");
			        		nome = leitor.nextLine();
			        		
			        		System.out.println("Digite uma raca:\n");
			        		raca = leitor.nextLine();
			        		
			        		
			        		System.out.println("Digite a data de nascimento:\n");
			        		dataNascimento = leitor.nextLine();
			        		
			        		
			        		System.out.println("Digite o proprietario do animal:\n");
			        		proprietario = leitor.nextLine();
			        		
			        		
			        		cachorro dog = new cachorro(nome, especie, raca, dataNascimento, proprietario);
			        		
			        		System.out.println("Você cadastrou o: " + dog.getNome());
			        		animais.add(dog);
			        		
			        		

			        	}else if(escolha == 2) {
			        		String nome;
			        		String raca;
			        		String dataNascimento;
			        		String proprietario;
			        		String especie = "Gato";
			        		
			        		leitor.nextLine();
			        		
			        		System.out.println("Digite um nome do animal: \n");
			        		nome =leitor.nextLine();
			        		
			        		
			        		System.out.println("Digite uma raca: \n");
			        		raca =leitor.nextLine();
			        		
			        		System.out.println("Digite a data de nascimento: \n" );
			        		dataNascimento =leitor.nextLine();
			        		
			        		System.out.println("Digite o nome do proprietario: \n");
			        		proprietario =leitor.nextLine();
			        		
			        		gato felino = new gato(nome, especie, raca, dataNascimento, proprietario);
			        		
			        		System.out.println("Você cadastrou o(a):" + felino.getNome());
			        		animais.add(felino);
			        	}else {
			        		System.out.println("Opção invalida");
			        		break;
			        	}
			        	
			        			        	
			          break;
			        //agendamento para serviço
			        case 2:
			        	int escolha2 = 0;
			        	
			        	System.out.println("Seja bem vindo ao sistema de agenda \n Digite 1 para agendar banho;  "
			        			+ "\n Digite 2 para tosa: \n  Digite 3 para agendar consulta veterinaria: \n");
			        	escolha2 = leitor.nextInt();
			        	
			        	
			        	if(escolha2 == 1) {
			        		animal bixo = null;
			        		servico procedimento;
			        		String data;
			        		String hora;
			        		
			        		servico banho = new banho();

			        		banho.descricao();
			        		banho.preco();
			        		
			        		leitor.nextLine();
			        		
			        		// Exiba a lista de animais 
			                for (int i = 0; i < animais.size(); i++) {
			                    System.out.println((i + 1) + ". " + animais.get(i).getNome());
			                }

			                System.out.print("Digite o número correspondente ao animal: ");
			                int escolhaAnimal = leitor.nextInt();

			                if (escolhaAnimal >= 1 && escolhaAnimal <= animais.size()) {
			                	bixo = animais.get(escolhaAnimal - 1); 
			                }
			                
			                
			                System.out.println("Digite um horario: ");
			                hora = leitor.nextLine();
			                
			                leitor.nextLine();
			        		 // Verifica se já existe um agendamento no mesmo horário
			                for (agendar agendamento : agendamentos) {
			                    if (agendamento.getHora().equals(hora)) {
			                        System.out.println("Já existe um agendamento pra esse horario por favor escolha outro" );
			                        break;
			                    }
			                }
			                leitor.nextLine();
			                
			                System.out.println("Digite uma data: ");
			                data = leitor.nextLine();
			                
			                
			                agendar agendarBanho = new agendar( bixo,  banho,  data,  hora);
			                
			                agendamentos.add(agendarBanho);
			                
			        		
			        		
			        	}
			        	else if (escolha2 == 2) {
			        		animal bixo = null;
			        		servico procedimento;
			        		String data;
			        		String hora;
			        		
			        		servico tosa = new tosa();

			        		tosa.descricao();
			        		tosa.preco();
			        		
			        		leitor.nextLine();
			        		
			        		// Exiba a lista de animais 
			                for (int i = 0; i < animais.size(); i++) {
			                    System.out.println((i + 1) + ". " + animais.get(i).getNome());
			                }

			                System.out.print("Digite o número correspondente ao animal: ");
			                int escolhaAnimal = leitor.nextInt();

			                if (escolhaAnimal >= 1 && escolhaAnimal <= animais.size()) {
			                	bixo = animais.get(escolhaAnimal - 1); 
			                }
			                
			                
			                System.out.println("Digite um horario: ");
			                hora = leitor.nextLine();
			                
			                leitor.nextLine();
			        		 // Verifica se já existe um agendamento no mesmo horário
			                for (agendar agendamento : agendamentos) {
			                    if (agendamento.getHora().equals(hora)) {
			                        System.out.println("Já existe um agendamento pra esse horario por favor escolha outro" );
			                        break;
			                    }
			                }
			                leitor.nextLine();
			                
			                System.out.println("Digite uma data: ");
			                data = leitor.nextLine();
			                
			                
			                agendar agendarTosa = new agendar( bixo,  tosa,  data,  hora);
			                
			                agendamentos.add(agendarTosa);
			        		
			        	}
			        	else if (escolha2 == 3) {
			        		animal bixo = null;
			        		servico procedimento;
			        		String data;
			        		String hora;
			        		
			        		servico consultaVeterinaria = new consultaVeterinaria();

			        		consultaVeterinaria.descricao();
			        		consultaVeterinaria.preco();
			        		
			        		leitor.nextLine();
			        		
			        		// Exiba a lista de animais 
			                for (int i = 0; i < animais.size(); i++) {
			                    System.out.println((i + 1) + ". " + animais.get(i).getNome());
			                }

			                System.out.print("Digite o número correspondente ao animal: ");
			                int escolhaAnimal = leitor.nextInt();

			                if (escolhaAnimal >= 1 && escolhaAnimal <= animais.size()) {
			                	bixo = animais.get(escolhaAnimal - 1); 
			                }
			                
			                
			                System.out.println("Digite um horario: ");
			                hora = leitor.nextLine();
			                
			                leitor.nextLine();
			        		 // Verifica se já existe um agendamento no mesmo horário
			                for (agendar agendamento : agendamentos) {
			                    if (agendamento.getHora().equals(hora)) {
			                        System.out.println("Já existe um agendamento pra esse horario por favor escolha outro" );
			                        break;
			                    }
			                }
			                leitor.nextLine();
			                
			                System.out.println("Digite uma data: ");
			                data = leitor.nextLine();
			                
			                
			                agendar agendarConsulta = new agendar( bixo,  consultaVeterinaria,  data,  hora);
			                
			                agendamentos.add(agendarConsulta);
			        		
			        	}
			        	else {
			        		System.out.println("Opção invalida");
			        		break;
			        	}
			        	
			          break;

			        case 3:

			        	int escolha3 = 0;
			        	// compra de um produto
			        	
			        	System.out.println("Seja bem vindo ao sistema de compras \n Digite 1 para uma coleira "
			        			+ "\n Digite 2 para comprar um shampoo: \n");
			        	escolha3 = leitor.nextInt();
			        	
			        	if(escolha3 == 1) {
			        		coleiras coleira= new coleiras("coleira M", "acessorios", 25.50, 6 );
                          int qtdCompra = 0;
                          System.out.println("Que legal você escolheu coleira digite a quantidade que deseja comprar:");
                          qtdCompra = leitor.nextInt();
                          System.out.println("Compra realizada com sucesso \n volte sempre");
                          
                          if(qtdCompra > coleira.getquantidadeEmEstoque()) {
                        	  System.out.println("Estoque insuficiente");
                        	  break;
                          }
                          
                          coleira.setquantidadeEmEstoque(coleira.getquantidadeEmEstoque() - qtdCompra);
			        		
			        	}else if(escolha3 == 2) {
			        		shampoo shampoos= new shampoo("shampoo anti sarna", "hingieni", 15.30, 8);
			        		int qtdCompra = 0;
			        		System.out.println("Boa escolha, agora digite a quantidade que deseja comprar;");
			        		qtdCompra = leitor.nextInt();
			        		System.out.println("Compra realizada com sucesso \n volte sempre");
			        		
			        		if(qtdCompra > shampoos.getquantidadeEmEstoque()){
			        		System.out.println("Estoque insuficiente");
			        		break;
			        		}
			        		shampoos.setquantidadeEmEstoque(shampoos.getquantidadeEmEstoque() - qtdCompra);
			        		
			        	}
			          break;

			        default:System.out.println("Digite uma opção valida");
			      }
			    }while(agendar.menu() != 4);
	}

}
