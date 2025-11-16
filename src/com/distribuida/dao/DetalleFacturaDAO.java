package com.distribuida.dao;
import com.distribuida.entities.DetalleFactura;
import java.util.List;

public interface DetalleFacturaDAO {
	
public List<DetalleFactura> findAll();
	
	public DetalleFactura findOne(int id);
	
	public void add(DetalleFactura detallefactura);
	
	public void up(DetalleFactura detallefactura);
	
	public void del(int id);

}
