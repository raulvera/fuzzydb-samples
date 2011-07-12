package org.fuzzydb.samples;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;

import com.wwm.db.GenericRef;

public class FuzzyItem implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String description;
	
	private Map<String, Object> attributes = new HashMap<String,Object>();
	
	@Id
	private GenericRef<FuzzyItem> ref;

	
	/**
	 * Public constructor needed by some frameworks
	 */
	public FuzzyItem() {
	}
	
	public FuzzyItem(String desc) {
		this.description = desc;
	}

	public Map<String, Object> getAttributes() {
		return attributes;
	}
	
	public Object getAttr(String name) {
		return attributes.get(name);
	}
	
	public void setAttr(String name, Object value) {
		attributes.put(name, value);
	}
	
	public String getDescription() {
		return description;
	}
	
	public GenericRef<FuzzyItem> getRef() {
		return ref;
	}
	
	@Override
	public String toString() {
		return description;
	}
}