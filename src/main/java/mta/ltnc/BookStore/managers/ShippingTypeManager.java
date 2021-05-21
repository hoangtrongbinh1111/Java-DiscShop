package mta.ltnc.BookStore.managers;

import mta.ltnc.BookStore.entity.ShippingType;
import mta.ltnc.BookStore.repositories.ShippingTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 22/06/2019
*/
@Component
public class ShippingTypeManager {

	private ShippingTypeRepository shippingTypeRepository;

	@Autowired
	public ShippingTypeManager(ShippingTypeRepository shippingTypeRepository) {
		this.shippingTypeRepository = shippingTypeRepository;
	}

}