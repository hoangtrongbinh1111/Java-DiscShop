package mta.ltnc.BookStore.managers;

import mta.ltnc.BookStore.entity.UserGroup;
import mta.ltnc.BookStore.repositories.UserGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 22/06/2019
*/
@Component
public class UserGroupManager {

	private UserGroupRepository userGroupRepository;

	@Autowired
	public UserGroupManager(UserGroupRepository userGroupRepository) {
		this.userGroupRepository = userGroupRepository;
	}

}