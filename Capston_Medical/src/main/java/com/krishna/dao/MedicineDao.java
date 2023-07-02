package com.krishna.dao;

import java.util.List;

import com.krishna.model.Medicine;

public interface MedicineDao {

	
	public Integer addMedicine(Medicine medicine);
	public void updateMedicine(int id);
	public void deleteMedicine(int id);
	public Medicine getMedById(int id);
	public List<Medicine> getallMedicineList();
	public List<Medicine> getallAntibiotics();
	public List<Medicine> getallPainKillers();
	public List<Medicine> getallAntacids();
	public List<Medicine> getallAuxilary();
}
