/*
 * HUMBOLDT: A Framework for Data Harmonistation and Service Integration.
 * EU Integrated Project #030962                  01.10.2006 - 30.09.2010
 * 
 * For more information on the project, please refer to the this website:
 * http://www.esdi-humboldt.eu
 * 
 * LICENSE: For information on the license under which this program is 
 * available, please refer to : http:/www.esdi-humboldt.eu/license.html#core
 * (c) the HUMBOLDT Consortium, 2008 to 2010.
 */


package test.eu.esdihumboldt.goml;

import static org.junit.Assert.*;

import org.junit.Test;



import eu.esdihumboldt.cst.align.ICell;
import eu.esdihumboldt.cst.align.ICell.RelationType;
import eu.esdihumboldt.goml.align.Alignment;
import eu.esdihumboldt.goml.align.Cell;
import eu.esdihumboldt.goml.oml.io.OmlRdfReader;
import eu.esdihumboldt.goml.omwg.ComparatorType;
import eu.esdihumboldt.goml.omwg.FeatureClass;
import eu.esdihumboldt.goml.omwg.Property;
import eu.esdihumboldt.goml.omwg.Restriction;
import eu.esdihumboldt.goml.rdf.About;

/**
 * @author Anna Pitaev, Logica
 *
 */
public class OmlRdfReaderTest {

	/**
	 * Test method for {@link eu.esdihumboldt.goml.oml.io.OmlRdfReader#read(java.lang.String)}.
	 */
	@Test
	public final void testRead() {
		Alignment aligment = new OmlRdfReader().read("res/schema/WatercoursesBY2Inspire.xml");
		//test alignment basic elements
		assertEquals("Watercourses_BY.xsd", aligment.getSchema1().getLocation());
		assertEquals("Hydrography.xsd", aligment.getSchema2().getLocation());
		assertEquals("2OMWG",aligment.getLevel());
		assertEquals(40,aligment.getMap().size());
		//test some alignment maps.
		//TODO in all mappings test add test for the domain restriction element
		//1.test the mapping for the attribute renaming mapping3
		ICell renaming = aligment.getMap().get(3);
		//assertEquals(1.0,renaming.getMeasure());
		assertEquals(RelationType.Equivalence, renaming.getRelation());
		//check that entity1 is not empty
		assertNotNull(renaming.getEntity1());
		//tests about element for the both entities
		Property prop1 = (Property)renaming.getEntity1();
		Property prop2 = (Property)renaming.getEntity2();
		assertEquals("watercoursesBY:GN",((About)prop1.getAbout()).getAbout());
		assertEquals("inspireHY:geographicalName/inspireHY:spelling/inspireHY:text",((About)prop2.getAbout()).getAbout());
		
		//2. test for the mapping for the augmentation
		ICell augmentation = aligment.getMap().get(2);
		//assertEquals(1.0,augmentation.getMeasure());
		assertEquals(RelationType.Extra, augmentation.getRelation());
		//check that entity1 is empty
		
		//tests about element for the both entities
		 prop1 = (Property)augmentation.getEntity1();
		 prop2 = (Property)augmentation.getEntity2();
		assertEquals("",((About)prop1.getAbout()).getAbout());
		assertEquals("inspireHY:endLifespanVersion",((About)prop2.getAbout()).getAbout());
		//check value condition for the entity2
		assertEquals(1, prop2.getValueCondition().size());
		Restriction restriction = prop2.getValueCondition().get(0);
		assertEquals(ComparatorType.EQUAL, restriction.getComparator());
		assertEquals("unpopulated", restriction.getValue().get(0).getLiteral());
		//check DomainValueCondition
		assertEquals(1,prop2.getDomainRestriction().size());
		assertEquals("inspireHY:Watercourse", ((About) prop2.getDomainRestriction().get(0).getAbout()).getAbout());
		
		//3. test the mapping for filter
		Cell filter =(Cell)aligment.getMap().get(0);
		//read operation name
		assertEquals("filter",filter.getLabel().get(0));
		//assertEquals(1.0,filter.getMeasure());
		assertEquals(RelationType.Equivalence, filter.getRelation());
		//check entity1 properties
		FeatureClass fc1 = (FeatureClass)filter.getEntity1();
		assertEquals(1,fc1.getAttributeValueCondition().size());
		assertEquals(null,fc1.getAttributeValueCondition().get(0).getComparator());
		assertEquals("watercoursesBY:OBJART=5101", fc1.getAttributeValueCondition().get(0).getCqlStr());
		//check entity2 properties
		FeatureClass fc2 = (FeatureClass)filter.getEntity2();
		assertEquals("inspireHY:Watercourse", ((About)fc2.getAbout()).getAbout());
	}

}
