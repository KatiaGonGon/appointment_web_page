package com.example.demo.formaters;

import com.example.demo.models.Date;
import java.util.*;
import java.time.*;
import java.time.chrono.Era;
import java.time.zone.*;
import java.time.format.*;

public class DateFormater {
	
	private LocalDate localDateFormat;
	private Month localMonth;
	private DayOfWeek localDayOfWeek;
	private Era localEra;
	private boolean isDefault;
	
	
	public DateFormater() {
		
	}
	
	public void setLocalDate(Date date) {
		this.setLocalDate(java.time.LocalDate.of(date.getDay(), date.getMonth(), date.getYear()));	
	}
	
	public void setLocalDate(LocalDate date) {
		this.localDateFormat = date;
		this.setFields(date.getDayOfWeek(), date.getMonth(), date.getEra());
	}
	
	private void setFields(DayOfWeek day, Month month, Era era) {
		this.localMonth = month;
		this.localDayOfWeek = day;
		this.localEra =  era;
		this.isDefault = false;
	}
	
	public LocalDate getLocalDate() {	
		return localDateFormat;
	}

	public Month getLocalMonth() {
		return localMonth;
	}

	public void setLocalMonth(Month localMonth) {
		this.localMonth = localMonth;
	}

	public DayOfWeek getLocalDayOfWeek() {
		return localDayOfWeek;
	}

	public void setLocalDayOfWeek(DayOfWeek localDayOfWeek) {
		this.localDayOfWeek = localDayOfWeek;
	}

	public Era getLocalEra() {
		return localEra;
	}

	public void setLocalEra(Era localEra) {
		this.localEra = localEra;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public LocalDate getLocalDateFormat() {
		return localDateFormat;
	}
	
	public String toString() {
		return this.localDateFormat.format(null);
	}
	
	

}
