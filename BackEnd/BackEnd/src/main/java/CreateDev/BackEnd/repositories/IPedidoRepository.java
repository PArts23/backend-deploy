package CreateDev.BackEnd.repositories;

import CreateDev.BackEnd.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPedidoRepository extends JpaRepository<Pedido,Integer>{

    @Query("FROM Pedido p WHERE p.nombre LIKE %:nombre%")
    List<Pedido> buscarNombre(@Param("nombre") String nombre);
}
