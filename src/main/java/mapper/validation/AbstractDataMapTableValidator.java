/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mapper.validation;

import mapper.MapperTableEntry;
import mapper.SizeState;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link mapper.AbstractDataMapTable}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AbstractDataMapTableValidator {
    boolean validate();

    boolean validateSizeState(SizeState value);
    boolean validateName(String value);
    boolean validateMinimized(boolean value);
    boolean validateMapperTableEntries(EList<MapperTableEntry> value);
}