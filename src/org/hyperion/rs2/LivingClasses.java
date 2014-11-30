package org.hyperion.rs2;

import org.hyperion.rs2.model.definitions.DefinitionLoader;
import org.hyperion.rs2.model.object.ObjectManager;

/**
 * This class acts as a host for all other classes that should be kept alive
 * the majority of the time. By doing this, the server class can stay less
 * cluttered and only have an instance of this class in it rather than a long
 * list of classes to be kept alive. To kill a class, set it to null and let 
 * the garbage collector do its work.
 * @author Stephen Andrews
 */
public class LivingClasses {

	/**
	 * An instance of the definition loader class.
	 */
	public static DefinitionLoader definitionLoader = new DefinitionLoader();
	
	/**
	 * An instance of the object manager class.
	 */
	public ObjectManager objectManager;
	
	/**
	 * Constructs all the 'living' classes.
	 */
	public LivingClasses() {
		objectManager = new ObjectManager();
	}
	
	/**
	 * Gets the object manager.
	 * @return The object manager.
	 */
	public ObjectManager getObjectManager() {
		return objectManager;
	}
	
}
