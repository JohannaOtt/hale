/*
 * HUMBOLDT: A Framework for Data Harmonisation and Service Integration.
 * EU Integrated Project #030962                 01.10.2006 - 30.09.2010
 * 
 * For more information on the project, please refer to the this web site:
 * http://www.esdi-humboldt.eu
 * 
 * LICENSE: For information on the license under which this program is 
 * available, please refer to http:/www.esdi-humboldt.eu/license.html#core
 * (c) the HUMBOLDT Consortium, 2007 to 2011.
 */

package eu.esdihumboldt.hale.instance.model;

/**
 * A mutable instance that allows adding/changing properties
 *
 * @author Simon Templer
 * @partner 01 / Fraunhofer Institute for Computer Graphics Research
 */
public interface MutableInstance extends Instance {
	
	/**
	 * Adds a property value
	 * 
	 * @param propertyName the property name
	 * @param value the property value
	 */
	public void addProperty(String propertyName, Object value);
	
	/**
	 * Sets values for a property
	 * 
	 * @param propertyName the property name
	 * @param values the values for the property
	 */
	public void setProperty(String propertyName, Object... values);
	
	/**
	 * Set the instance value. It may only be a simple value,
	 * no collection or {@link Instance}.
	 * 
	 * @param value the instance value to set
	 */
	public void setValue(Object value);
	
	//XXX more manipulation needed? e.g. for transformation?

}
