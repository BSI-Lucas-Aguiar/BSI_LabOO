package br.edu.iff.sales;

import java.math.BigDecimal;

public class Item
{
	private Product product;
	private BigDecimal quantity;

	Item(Product product, BigDecimal quantity)
	{
		super();
		this.setProduct(product);
		this.setQuantity(quantity);
	}
	
	private void setProduct(Product product)
	{
		if (product == null)
			throw new IllegalArgumentException("Product must not be null!");
		this.product = product;
	}
	
	public Product product()
	{
		return this.product;
	}
	
	final void setQuantity(BigDecimal quantity)
	{
		if (quantity == null)
			throw new IllegalArgumentException("Quantity must not be null!");
		if (quantity.compareTo(BigDecimal.ZERO) <= 0)
			throw new IllegalArgumentException("Quantity must be positive!");
		this.quantity = quantity;
	}
	
	public BigDecimal quantity()
	{
		return this.quantity;
	}
}
