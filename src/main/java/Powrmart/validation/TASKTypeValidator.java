/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.validation;

import Powrmart.ATTRIBUTEType;
import Powrmart.EXPRMACRODEPENDENCYType;
import Powrmart.PARENTTYPEType2;
import Powrmart.RESOURCEREFERENCEType;
import Powrmart.REUSABLEType;
import Powrmart.TIMERType;
import Powrmart.VALUEPAIRType;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Powrmart.TASKType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TASKTypeValidator {
    boolean validate();

    boolean validateATTRIBUTE(EList<ATTRIBUTEType> value);
    boolean validateEXPRMACRODEPENDENCY(EList<EXPRMACRODEPENDENCYType> value);
    boolean validateTIMER(TIMERType value);
    boolean validateVALUEPAIR(EList<VALUEPAIRType> value);
    boolean validateRESOURCEREFERENCE(EList<RESOURCEREFERENCEType> value);
    boolean validateDESCRIPTION(Object value);
    boolean validateNAME(Object value);
    boolean validatePARENT(Object value);
    boolean validatePARENTTYPE(PARENTTYPEType2 value);
    boolean validateREUSABLE(REUSABLEType value);
    boolean validateTYPE(Object value);
    boolean validateVERSIONNUMBER(Object value);
}
