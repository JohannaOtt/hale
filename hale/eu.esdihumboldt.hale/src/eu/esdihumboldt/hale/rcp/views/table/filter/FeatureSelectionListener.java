/*
 * HUMBOLDT: A Framework for Data Harmonisation and Service Integration.
 * EU Integrated Project #030962                 01.10.2006 - 30.09.2010
 * 
 * For more information on the project, please refer to the this web site:
 * http://www.esdi-humboldt.eu
 * 
 * LICENSE: For information on the license under which this program is 
 * available, please refer to http:/www.esdi-humboldt.eu/license.html#core
 * (c) the HUMBOLDT Consortium, 2007 to 2010.
 */

package eu.esdihumboldt.hale.rcp.views.table.filter;

import org.opengis.feature.Feature;
import org.opengis.feature.type.FeatureType;

/**
 * Feature selection listener interface
 * 
 * @author Simon Templer
 * @partner 01 / Fraunhofer Institute for Computer Graphics Research
 * @version $Id$ 
 */
public interface FeatureSelectionListener {
	
	/**
	 * Called when the selection changed
	 * 
	 * @param type the feature type
	 * @param selection the selected features
	 */
	public void selectionChanged(FeatureType type, Iterable<Feature> selection);
	
}