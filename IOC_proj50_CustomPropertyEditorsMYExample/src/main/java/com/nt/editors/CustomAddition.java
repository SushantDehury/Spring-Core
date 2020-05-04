package com.nt.editors;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.PropertyEditorRegistrySupport;

import com.nt.beans.Addition;

public class CustomAddition extends PropertyEditorSupport{
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		int value1=Integer.parseInt(text.substring(0, text.indexOf(",")));
		int value2=Integer.parseInt(text.substring(text.indexOf(",")+1,text.lastIndexOf(",")));
		int value3=Integer.parseInt(text.substring(text.lastIndexOf(",")+1,text.length()));
		Addition addd=new Addition(value1, value2, value3);
		setValue(addd);
	}

}
