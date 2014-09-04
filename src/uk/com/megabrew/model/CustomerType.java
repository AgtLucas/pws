package uk.com.megabrew.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType(name = "type")
public enum CustomerType {
	
	@XmlEnumValue("bar")
	BAR,
	
	@XmlEnumValue("pub")
	PUB,
	
	@XmlEnumValue("restaurant")
	RESTAURANT,
	
	@XmlEnumValue("cafeteria")
	CAFETERIA;

}
