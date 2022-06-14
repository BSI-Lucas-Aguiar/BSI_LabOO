package br.edu.iff.sales;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Order
{
	private static final int MAX_RESPONSIBLES = 5;
	private static final int MIN_SELLERS = 1;
	private Customer customer;
	private Manager[] responsibles;
	private int numberOfResponsibles;
	private Set<Seller> sellers;
	private Map<Product, Item> items;
	
	public Order(Customer customer, Seller seller)
	{
		super();
		this.setCustomer(customer);
		this.responsibles = new Manager[MAX_RESPONSIBLES];
		this.numberOfResponsibles = 0;
		this.sellers = new HashSet<Seller>();
		this.addSeller(seller);
		this.items = new HashMap<Product, Item>();
	}
	
	private void setCustomer(Customer customer)
	{
		if (customer == null)
			throw new IllegalArgumentException("Customer must not be null!");
		this.customer = customer;
	}
	
	public Customer customer()
	{
		return this.customer;
	}
	
	public int numberOfResponsibles()
	{
		return this.numberOfResponsibles;
	}
	
	public boolean canAddMoreResponsible()
	{
		return this.numberOfResponsibles() < Order.MAX_RESPONSIBLES;
	}
	
	public void addResponsible(Manager responsible)
	{
		if (responsible == null)
			throw new IllegalArgumentException("Responsible must not be null!");
		if (!this.canAddMoreResponsible())
			throw new IllegalStateException ("Max number of responsibles reached!");
		
		int i = 0;
		while (this.responsibles[i] != null) i++;
		this.responsibles[i] = responsible;
		this.numberOfResponsibles++;
	}
	
	public void removeResponsible(Manager responsible)
	{
		if (responsible == null) return; 
		
		boolean found = false;
		int i = 0;
		while (!found && i < this.responsibles.length)
		{
			Manager current = this.responsibles[i];
			if (responsible.equals(current))
			{
				this.responsibles[i] = null;
				this.numberOfResponsibles--;
				found = true;
			}
		}
	}
	
	public Iterator<Manager> responsibles()
	{
		return new Iterator<Manager>()
				{
					private int returned = 0;
					private int i = -1;
					
					@Override
					public boolean hasNext()
					{
						return this.returned < Order.this.numberOfResponsibles();
					}

					@Override
					public Manager next()
					{
						if (!this.hasNext())
							throw new NoSuchElementException();
						i++;
						while (Order.this.responsibles[i] == null) i++;
						returned++;
						return Order.this.responsibles[i];
					}
			
				};
	}
	
	public int numberOfSellers()
	{
		return this.sellers.size();
	}
	
	public final void addSeller(Seller seller)
	{
		if (seller == null)
			throw new IllegalArgumentException("Seller must not be null!");
		this.sellers.add(seller);
	}
	
	public boolean canRemoveSeller()
	{
		return this.numberOfSellers() > Order.MIN_SELLERS;
	}
	
	public void removeSeller(Seller seller)
	{
		if (seller == null) return; 
		
		if (this.sellers.contains(seller) && !this.canRemoveSeller())
			throw new IllegalStateException ("Min number of sellers reached!");
		
		this.sellers.remove(seller);
		
	}
	
	public Iterator<Seller> sellers()
	{
		return Collections.unmodifiableSet(this.sellers).iterator();
	}
	
	public void updateItem(Product product, BigDecimal quantity)
	{
		if (product == null)
			throw new IllegalArgumentException("Product must not be null!");
		if (quantity == null)
			throw new IllegalArgumentException("Product must not be null!");
		if (quantity.compareTo(BigDecimal.ZERO) < 0)
			throw new IllegalArgumentException("Quantity must be non negative!");
		
		if (quantity.compareTo(BigDecimal.ZERO) > 0)
		{
			Item item = this.item(product);
			if (item == null)
			{
				item = new Item(product, quantity);
				this.items.put(product, item);
			}
			else
				item.setQuantity(quantity);
		}
		else
			this.items.remove(product);
	}
	
	public Item item(Product product)
	{
		return this.items.get(product);
	}
	
	public Iterator<Item> allItems()
	{
		return Collections.unmodifiableCollection(this.items.values()).iterator();
	}
	
	public int numberOfItems()
	{
		return this.items.values().size();
	}
}
