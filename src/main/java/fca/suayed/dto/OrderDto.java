package fca.suayed.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class OrderDto {
    private Long id;
    private Long client_id;
    private Long product_id;
    private Integer quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("cliente_id")
    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    @ColumnName("producto_id")
    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    @ColumnName("cantidad")
    public Double getQuantity() {
        return this.Quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

} Main {
    
}
