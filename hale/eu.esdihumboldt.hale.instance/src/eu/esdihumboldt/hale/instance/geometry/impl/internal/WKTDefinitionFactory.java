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

package eu.esdihumboldt.hale.instance.geometry.impl.internal;

import eu.esdihumboldt.hale.instance.geometry.CRSDefinitionFactory;
import eu.esdihumboldt.hale.instance.geometry.impl.CodeDefinition;
import eu.esdihumboldt.hale.instance.geometry.impl.WKTDefinition;
import eu.esdihumboldt.hale.schema.geometry.CRSDefinition;

/**
 * Factory for {@link CodeDefinition}s
 * @author Simon Templer
 */
public class WKTDefinitionFactory implements
		CRSDefinitionFactory<WKTDefinition> {

	/**
	 * @see CRSDefinitionFactory#getIdentifier()
	 */
	@Override
	public String getIdentifier() {
		return "wkt";
	}

	/**
	 * @see CRSDefinitionFactory#getDefinitionClass()
	 */
	@Override
	public Class<WKTDefinition> getDefinitionClass() {
		return WKTDefinition.class;
	}

	/**
	 * @see CRSDefinitionFactory#parse(String)
	 */
	@Override
	public WKTDefinition parse(String value) {
		return new WKTDefinition(value, null);
	}

	/**
	 * @see CRSDefinitionFactory#asString(CRSDefinition)
	 */
	@Override
	public String asString(WKTDefinition crsDef) {
		return crsDef.getWkt();
	}

}
