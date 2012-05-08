/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mapper.validation;

import mapper.MapperTableEntry;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link mapper.InputTable}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InputTableValidator {
    boolean validate();

    boolean validateMatchingMode(String value);
    boolean validateLookupMode(String value);
    boolean validateGlobalMapKeysValues(EList<MapperTableEntry> value);
    boolean validateInnerJoin(boolean value);
    boolean validatePersistent(boolean value);
}