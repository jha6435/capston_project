package com.krishna.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.krishna.model.Medicine;
import com.krishna.util.SessionFactoryManagerImpl;

import jakarta.persistence.TypedQuery;

public class MedicineDaoImpl implements MedicineDao{

	private SessionFactory factory;
	
	public MedicineDaoImpl() {
		factory=new SessionFactoryManagerImpl().getFactory();
	}
	
	
	@Override
	public Integer addMedicine(Medicine medicine) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		int med=(int) session.save(medicine);
		//Medicine med=new Medicine("paracetamol", "cipla", 120, 1.20, "img111", "painkillers");
		transaction.commit();
		session.save(medicine);
		session.close();
		return med;
	}

	@Override
	public void updateMedicine(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMedicine(int id) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public Medicine getMedById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Medicine> getallMedicineList() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		String sql="select*from medicine";
		TypedQuery<Medicine> tq=session.createNativeQuery(sql, Medicine.class, "Medicine");
		List<Medicine> medicine = tq.getResultList();
		transaction.commit();
		session.close();
		return medicine;
	}


	@Override
	public List<Medicine> getallAntibiotics() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		String sql="select*from medicine where category='antibiotics'";
		TypedQuery<Medicine> tq=session.createNativeQuery(sql, Medicine.class, "Medicine");
		List<Medicine> medicine = tq.getResultList();
		transaction.commit();
		session.close();
		return medicine;
	}


	@Override
	public List<Medicine> getallPainKillers() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		String sql="select*from medicine where category='painkillers'";
		TypedQuery<Medicine> tq=session.createNativeQuery(sql, Medicine.class, "Medicine");
		List<Medicine> medicine = tq.getResultList();
		transaction.commit();
		session.close();
		return medicine;
	}


	@Override
	public List<Medicine> getallAntacids() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		String sql="select*from medicine where category='antacids'";
		TypedQuery<Medicine> tq=session.createNativeQuery(sql, Medicine.class, "Medicine");
		List<Medicine> medicine = tq.getResultList();
		transaction.commit();
		session.close();
		return medicine;
	}


	@Override
	public List<Medicine> getallAuxilary() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		String sql="select*from medicine where category='auxilary'";
		TypedQuery<Medicine> tq=session.createNativeQuery(sql, Medicine.class, "Medicine");
		List<Medicine> medicine = tq.getResultList();
		transaction.commit();
		session.close();
		return medicine;
	}

}
