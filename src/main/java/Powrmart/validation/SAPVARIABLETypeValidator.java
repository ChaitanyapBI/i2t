/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.validation;

import Powrmart.ISOUTPUTPORTType;
import Powrmart.SUBTYPEType;

/**
 * A sample validator interface for {@link Powrmart.SAPVARIABLEType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SAPVARIABLETypeValidator {
    boolean validate();

    boolean validateDATATYPE(Object value);
    boolean validateDEFAULTVALUE(Object value);
    boolean validateDSQINSTNAME(Object value);
    boolean validateISOUTPUTPORT(ISOUTPUTPORTType value);
    boolean validateNAME(Object value);
    boolean validatePRECISION(Object value);
    boolean validateSCALE(Object value);
    boolean validateSUBTYPE(SUBTYPEType value);
    boolean validateVARDEF(Object value);
}