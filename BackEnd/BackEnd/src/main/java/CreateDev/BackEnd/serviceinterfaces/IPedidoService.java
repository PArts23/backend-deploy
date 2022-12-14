package CreateDev.BackEnd.serviceinterfaces;

import CreateDev.BackEnd.entities.Pedido;

import java.util.List;

public interface IPedidoService {

    public void insert(Pedido pedido);

    List<Pedido> list();

    public void delete(int id);

    List<Pedido> search(String nombre);
}
