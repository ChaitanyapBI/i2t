/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.validation;

import Powrmart.ISNULLType;
import Powrmart.ISPERSISTENTType;
import Powrmart.USERDEFINEDType;

/**
 * A sample validator interface for {@link Powrmart.WORKFLOWVARIABLEType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WORKFLOWVARIABLETypeValidator {
    boolean validate();

    boolean validateDATATYPE(Object value);
    boolean validateDEFAULTVALUE(Object value);
    boolean validateDESCRIPTION(Object value);
    boolean validateISNULL(ISNULLType value);
    boolean validateISPERSISTENT(ISPERSISTENTType value);
    boolean validateNAME(Object value);
    boolean validateUSERDEFINED(USERDEFINEDType value);
}