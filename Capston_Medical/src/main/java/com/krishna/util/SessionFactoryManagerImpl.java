package com.krishna.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryManagerImpl implements SessionFactoryManager {

	@Override
	public SessionFactory getFactory() {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	       Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	      SessionFactory factory = meta.getSessionFactoryBuilder().build(); 
		
		
		return factory;
	}

	

}
