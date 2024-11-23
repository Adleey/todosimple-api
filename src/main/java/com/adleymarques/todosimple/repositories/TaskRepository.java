package com.adleymarques.todosimple.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adleymarques.todosimple.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

    /*O Repository é uma abstração que facilita a interação com o banco de dados. Ela organiza e gerencia o acesso aos dados, de maneira eficiente e consistente.
     * O JpaRepository disponibiliza varias funções de interação com o banco de dados, evitando que precisemos criar as funções na mão.
     */

     List<Task> findByUser_Id(Long id); // Esse metodo já exite na JPA, estamos sobrescrevendo

    // @Query(value = "SELECT t FROM Task t WHERE t.user.id = :id") // Essa é uma forma de criarmos a consulta com JPQL
    // List<Task> findByUser_Id(@Param("id") Long id);

    // Essa é uma forma de criar a consulta com SQL
    // @Query(value = "SELECT * FROM task t WHERE t.user_id = :id", nativeQuery =
    // true)
    // List<Task> findByUser_Id(@Param("id") Long id);

    
    
}
