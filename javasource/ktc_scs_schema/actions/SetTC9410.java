// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package ktc_scs_schema.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import ktcmdwscsconnector.customs.MessageClass;

public class SetTC9410 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __mxObject;
	private ktc_scs_schema.proxies.TC9410_KORTRG03DS mxObject;

	public SetTC9410(IContext context, IMendixObject mxObject)
	{
		super(context);
		this.__mxObject = mxObject;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.mxObject = __mxObject == null ? null : ktc_scs_schema.proxies.TC9410_KORTRG03DS.initialize(getContext(), __mxObject);

		// BEGIN USER CODE
		StringBuilder strMessageApplication = new StringBuilder();
		
		try
		{
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTKRTN(), 19));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTKNTN(), 19));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTEMDT(), 8));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getRLRELC(), 6));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getWDFRDW(), 1));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKQFWDT(), 8));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTEMNM(), 26));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTEMN1(), 26));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTKRST(), 3));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTKTTP(), 3));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTGTDT(), 6));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTGTDP(), 6));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTSPKD(), 1));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTADAT(), 8));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getWDADAT(), 6));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getWDTPDT(), 1));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTTPDT(), 8));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTAAY(), 3));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTWACD(), 1));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTGTST(), 1));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTYTDT(), 15));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTLYTA(), 15));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTLTXA(), 15));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTLSTR(), 8));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTAUDT(), 8));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTPINR(), 1));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTLPGD(), 8));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTLEMD(), 8));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTFPKF(), 1));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTLPRD(), 8));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTREMC(), 2));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTCLEC(), 6));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getWDCOLF(), 1));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTCLDT(), 8));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getWDACKF(), 1));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTAKDT(), 8));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTRNST(), 3));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTRRJC(), 3));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTRWDT(), 8));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTRKID(), 6));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTSVID(), 6));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTSPLV(), 3));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTCPGM(), 3));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTKIPN(), 19));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTLOPN(), 11));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTSPDT(), 8));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTUSER(), 10));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTPVV(), 4));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTKPBL(), 16));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTDSKF(), 8));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTPVKI(), 2));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTSRVC(), 3));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTAKFR(), 3));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTWAMK(), 13));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTNODT(), 3));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTAMDT(), 11));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTSADT(), 8));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTNOPD(), 3));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTAMPD(), 11));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTNOD(), 1));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTCVV(), 3));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTIADT(), 8));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTNIDT(), 3));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTAIDT(), 11));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTSIDT(), 8));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTNIPD(), 3));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTIAPD(), 11));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTNTRD(), 3));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTNTRC(), 3));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTAATT(), 3));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTCHR1(), 1));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTREF(), 15));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTPNRI(), 1));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTBKRD(), 11));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTPRBO(), 15));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTAINB(), 15));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTFUDT(), 8));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTOTYP(), 6));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTCVV2(), 3));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTATRA(), 15));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTARNT(), 15));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTECHG(), 1));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTDTTM(), 14));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTCGEN(), 6));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTCBI2(), 1));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTCBI3(), 1));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTCMPD(), 54));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTPMPD(), 54));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTVECS(), 3));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTICCI(), 1));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTLEBD(), 8));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTLPID(), 8));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTFPIN(), 8));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTICFD(), 8));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTDEAC(), 1));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTDEDT(), 8));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTNCGN(), 3));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTBR(), 5));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTPHTO(), 1));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTFPKW(), 1));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTFPKT(), 1));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTKRT1(), 19));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKRNKDB(), 6));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKRKRTS(), 3));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKRKNST(), 3));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getWDRCHR(), 1));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getWDRCRD(), 1));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getWDBKRD(), 11));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getWDLCHK(), 1));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTCSTS(), 1));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTCDAT(), 8));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTDREF(), 15));
			strMessageApplication.append(MessageClass.setMessageNumber(this.mxObject.getKTCLEB(), 2));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTCLCB(), 6));
			strMessageApplication.append(MessageClass.setMessageString(this.mxObject.getKTDECH(), 2));
		}
		catch (Exception ex)
		{
			throw new com.mendix.systemwideinterfaces.MendixRuntimeException(ex.getMessage());
		}
		
		return strMessageApplication.toString();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SetTC9410";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
