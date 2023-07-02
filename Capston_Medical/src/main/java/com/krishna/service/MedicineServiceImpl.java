package com.krishna.service;

import java.util.List;

import com.krishna.dao.MedicineDaoImpl;
import com.krishna.model.Medicine;

public class MedicineServiceImpl implements MedicineService{

	
	private MedicineDaoImpl medDao;
	
	public MedicineServiceImpl() {
		medDao=new MedicineDaoImpl();
	}
	
	@Override
	public Integer addMedicine(Medicine medicine) {
		
		return medDao.addMedicine(medicine);
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
		
		return medDao.getallMedicineList();
	}

	@Override
	public List<Medicine> getallAntibiotics() {
		
		return medDao.getallAntibiotics();
	}

	@Override
	public List<Medicine> getallPainKillers() {
		
		return medDao.getallPainKillers();
	}

	@Override
	public List<Medicine> getallAntacids() {
		
		return medDao.getallAntacids();
	}

	@Override
	public List<Medicine> getallAuxilary() {
		
		return medDao.getallAuxilary();
	}

}
