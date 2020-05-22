package model.service;

import java.util.Calendar;
import java.util.Date;

public class GeraData {
	public Date getData(Date data, Integer numeroParcela) {
		if(numeroParcela == 0)
			return data;
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, numeroParcela);
		return cal.getTime();
	}
}
