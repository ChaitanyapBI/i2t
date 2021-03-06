/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.validation;

import Powrmart.CONNECTORType;
import Powrmart.ERPINFOType;
import Powrmart.INSTANCEType;
import Powrmart.MAPPINGVARIABLEType;
import Powrmart.METADATAEXTENSIONType;
import Powrmart.TRANSFORMATIONType;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Powrmart.MAPPLETType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MAPPLETTypeValidator {
    boolean validate();

    boolean validateTRANSFORMATION(EList<TRANSFORMATIONType> value);
    boolean validateINSTANCE(EList<INSTANCEType> value);
    boolean validateCONNECTOR(EList<CONNECTORType> value);
    boolean validateMAPPINGVARIABLE(EList<MAPPINGVARIABLEType> value);
    boolean validateERPINFO(EList<ERPINFOType> value);
    boolean validateMETADATAEXTENSION(EList<METADATAEXTENSIONType> value);
    boolean validateCRCVALUE(Object value);
    boolean validateDESCRIPTION(Object value);
    boolean validateISVALID(Object value);
    boolean validateNAME(Object value);
    boolean validateOBJECTVERSION(Object value);
    boolean validateVERSIONNUMBER(Object value);
}
