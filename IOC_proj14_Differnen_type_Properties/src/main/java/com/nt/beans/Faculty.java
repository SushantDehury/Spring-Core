package com.nt.beans;

import java.util.Map;

public class Faculty {
	private Map<String, ?> course;

	public void setCourse(Map<String, ?> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Faculty [course=" + course + "]";
	}

}
