/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.validation;

import Powrmart.ATTRIBUTEType;
import Powrmart.ISDEFAULTType;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Powrmart.CONFIGType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CONFIGTypeValidator {
    boolean validate();

    boolean validateATTRIBUTE(EList<ATTRIBUTEType> value);
    boolean validateDESCRIPTION(Object value);
    boolean validateISDEFAULT(ISDEFAULTType value);
    boolean validateNAME(Object value);
    boolean validateVERSIONNUMBER(Object value);
}