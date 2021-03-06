/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.validation;

import Powrmart.ERPSRCINFOType;
import Powrmart.FLATFILEType;
import Powrmart.GROUPType;
import Powrmart.METADATAEXTENSIONType;
import Powrmart.SOURCEFIELDType;
import Powrmart.TABLEATTRIBUTEType;
import Powrmart.XMLINFOType;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Powrmart.SOURCEType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SOURCETypeValidator {
    boolean validate();

    boolean validateFLATFILE(FLATFILEType value);
    boolean validateXMLINFO(XMLINFOType value);
    boolean validateERPSRCINFO(ERPSRCINFOType value);
    boolean validateGROUP(EList<GROUPType> value);
    boolean validateTABLEATTRIBUTE(EList<TABLEATTRIBUTEType> value);
    boolean validateSOURCEFIELD(EList<SOURCEFIELDType> value);
    boolean validateMETADATAEXTENSION(EList<METADATAEXTENSIONType> value);
    boolean validateBUSINESSNAME(Object value);
    boolean validateCOMPONENTVERSION(Object value);
    boolean validateCRCVALUE(Object value);
    boolean validateDATABASESUBTYPE(Object value);
    boolean validateDATABASETYPE(Object value);
    boolean validateDBDNAME(Object value);
    boolean validateDESCRIPTION(Object value);
    boolean validateIBMCOMP(Object value);
    boolean validateNAME(Object value);
    boolean validateOBJECTVERSION(Object value);
    boolean validateOWNERNAME(Object value);
    boolean validateVERSIONNUMBER(Object value);
}
