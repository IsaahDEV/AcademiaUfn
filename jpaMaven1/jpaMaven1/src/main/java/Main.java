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
            // Crie e persista departamentos
            Departamento departamento1 = new Departamento();
            departamento1.setNome("Departamento 1");
            em.persist(departamento1);

            Departamento departamento2 = new Departamento();
            departamento2.setNome("Departamento 2");
            em.persist(departamento2);

            // Crie e persista funcionários associados aos departamentos
            Funcionario funcionario1 = new Funcionario();
            funcionario1.setNome("Funcionário 1");
            funcionario1.setEmail("funcionario1@example.com");
            funcionario1.getDepartamentos().add(departamento1);
            em.persist(funcionario1);

            Funcionario funcionario2 = new Funcionario();
            funcionario2.setNome("Funcionário 2");
            funcionario2.setEmail("funcionario2@example.com");
            funcionario2.getDepartamentos().add(departamento2);
            em.persist(funcionario2);

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
