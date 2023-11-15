import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Pessoa.Funcionario;
import Setor.Departamento;

public class Main {

    public static void main(String[] args) {

        // Crie o EntityManagerFactory com base na unidade de persistência definida no persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste");
        EntityManager em = emf.createEntityManager();

        // Inicie uma transação
        em.getTransaction().begin();

        try {
            // Encontre ou crie os departamentos desejados e defina os IDs
            Long departamentoId1 = 1L; // Substitua 1L pelo ID correto do primeiro departamento
            Departamento departamento1 = em.find(Departamento.class, departamentoId1);

            Long departamentoId2 = 2L; // Substitua 2L pelo ID correto do segundo departamento
            Departamento departamento2 = em.find(Departamento.class, departamentoId2);

            // Crie um novo funcionário
            Funcionario funcionario = new Funcionario();
            funcionario.setNome("Nome do Funcionario");
            funcionario.getDepartamentos().add(departamento1);
            funcionario.getDepartamentos().add(departamento2);

            em.persist(funcionario);

            // Faça commit da transação
            em.getTransaction().commit();

        } catch (Exception e) {
            // Em caso de erro, faça rollback da transação
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            // Feche o EntityManager
            em.close();
            emf.close();
        }
    }
}
