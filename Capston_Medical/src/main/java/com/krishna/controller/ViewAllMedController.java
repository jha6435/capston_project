package com.krishna.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.krishna.model.Medicine;
import com.krishna.service.MedicineServiceImpl;


public class ViewAllMedController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Medicine med=new Medicine("antiseptic", "savlon", 12, 80, "img114", "auxilary");
		List<Medicine> medicine=new MedicineServiceImpl().getallMedicineList();
		for(Medicine med: medicine) {
			System.out.println(med);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
