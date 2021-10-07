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
import ktc_scs_schema.proxies.TC9411_KORTRG03DS;
import ktcmdwscsconnector.customs.MessageClass;

public class GetTC9414 extends CustomJavaAction<IMendixObject>
{
	private java.lang.String messageString;

	public GetTC9414(IContext context, java.lang.String messageString)
	{
		super(context);
		this.messageString = messageString;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		MessageClass msgClass = new MessageClass();
		TC9411_KORTRG03DS msg = new TC9411_KORTRG03DS(this.getContext());
		
		try
		{
			// Start Detail
			msgClass.intIndex = 693;
			msgClass.MessageString = this.messageString;

			msg.setKTKRTN(msgClass.getMessageNumber(19,0));
			msg.setKTKNTN(msgClass.getMessageNumber(19,0));
			msg.setKTEMDT(msgClass.getMessageNumber(8,0));
			msg.setRLRELC(msgClass.getMessageString(6));
			msg.setWDFRDW(msgClass.getMessageString(1));
			msg.setKQFWDT(msgClass.getMessageNumber(8,0));
			msg.setKTEMNM(msgClass.getMessageString(26));
			msg.setKTEMN1(msgClass.getMessageString(26));
			msg.setKTKRST(msgClass.getMessageNumber(3,0));
			msg.setKTKTTP(msgClass.getMessageString(3));
			msg.setKTGTDT(msgClass.getMessageNumber(6,0));
			msg.setKTGTDP(msgClass.getMessageNumber(6,0));
			msg.setKTSPKD(msgClass.getMessageNumber(1,0));
			msg.setKTADAT(msgClass.getMessageNumber(8,0));
			msg.setWDADAT(msgClass.getMessageNumber(6,0));
			msg.setWDTPDT(msgClass.getMessageString(1));
			msg.setKTTPDT(msgClass.getMessageNumber(8,0));
			msg.setKTAAY(msgClass.getMessageNumber(3,0));
			msg.setKTWACD(msgClass.getMessageString(1));
			msg.setKTGTST(msgClass.getMessageString(1));
			msg.setKTYTDT(msgClass.getMessageNumber(15,2));
			msg.setKTLYTA(msgClass.getMessageNumber(15,2));
			msg.setKTLTXA(msgClass.getMessageNumber(15,2));
			msg.setKTLSTR(msgClass.getMessageNumber(8,0));
			msg.setKTAUDT(msgClass.getMessageNumber(8,0));
			msg.setKTPINR(msgClass.getMessageString(1));
			msg.setKTLPGD(msgClass.getMessageNumber(8,0));
			msg.setKTLEMD(msgClass.getMessageNumber(8,0));
			msg.setKTFPKF(msgClass.getMessageNumber(1,0));
			msg.setKTLPRD(msgClass.getMessageNumber(8,0));
			msg.setKTREMC(msgClass.getMessageString(2));
			msg.setKTCLEC(msgClass.getMessageString(6));
			msg.setWDCOLF(msgClass.getMessageString(1));
			msg.setKTCLDT(msgClass.getMessageNumber(8,0));
			msg.setWDACKF(msgClass.getMessageString(1));
			msg.setKTAKDT(msgClass.getMessageNumber(8,0));
			msg.setKTRNST(msgClass.getMessageNumber(3,0));
			msg.setKTRRJC(msgClass.getMessageNumber(3,0));
			msg.setKTRWDT(msgClass.getMessageNumber(8,0));
			msg.setKTRKID(msgClass.getMessageString(6));
			msg.setKTSVID(msgClass.getMessageString(6));
			msg.setKTSPLV(msgClass.getMessageNumber(3,0));
			msg.setKTCPGM(msgClass.getMessageString(3));
			msg.setKTKIPN(msgClass.getMessageNumber(19,0));
			msg.setKTLOPN(msgClass.getMessageNumber(11,0));
			msg.setKTSPDT(msgClass.getMessageNumber(8,0));
			msg.setKTUSER(msgClass.getMessageString(10));
			msg.setKTPVV(msgClass.getMessageString(4));
			msg.setKTKPBL(msgClass.getMessageString(16));
			msg.setKTDSKF(msgClass.getMessageNumber(8,0));
			msg.setKTPVKI(msgClass.getMessageNumber(2,0));
			msg.setKTSRVC(msgClass.getMessageNumber(3,0));
			msg.setKTAKFR(msgClass.getMessageNumber(3,0));
			msg.setKTWAMK(msgClass.getMessageNumber(13,0));
			msg.setKTNODT(msgClass.getMessageNumber(3,0));
			msg.setKTAMDT(msgClass.getMessageNumber(11,0));
			msg.setKTSADT(msgClass.getMessageNumber(8,0));
			msg.setKTNOPD(msgClass.getMessageNumber(3,0));
			msg.setKTAMPD(msgClass.getMessageNumber(11,0));
			msg.setKTNOD(msgClass.getMessageNumber(1,0));
			msg.setKTCVV(msgClass.getMessageNumber(3,0));
			msg.setKTIADT(msgClass.getMessageNumber(8,0));
			msg.setKTNIDT(msgClass.getMessageNumber(3,0));
			msg.setKTAIDT(msgClass.getMessageNumber(11,0));
			msg.setKTSIDT(msgClass.getMessageNumber(8,0));
			msg.setKTNIPD(msgClass.getMessageNumber(3,0));
			msg.setKTIAPD(msgClass.getMessageNumber(11,0));
			msg.setKTNTRD(msgClass.getMessageNumber(3,0));
			msg.setKTNTRC(msgClass.getMessageNumber(3,0));
			msg.setKTAATT(msgClass.getMessageNumber(3,0));
			msg.setKTCHR1(msgClass.getMessageString(1));
			msg.setKTREF(msgClass.getMessageString(15));
			msg.setKTPNRI(msgClass.getMessageString(1));
			msg.setKTBKRD(msgClass.getMessageNumber(11,0));
			msg.setKTPRBO(msgClass.getMessageNumber(15,2));
			msg.setKTAINB(msgClass.getMessageNumber(15,2));
			msg.setKTFUDT(msgClass.getMessageNumber(8,0));
			msg.setKTOTYP(msgClass.getMessageString(6));
			msg.setKTCVV2(msgClass.getMessageNumber(3,0));
			msg.setKTATRA(msgClass.getMessageNumber(15,2));
			msg.setKTARNT(msgClass.getMessageNumber(15,2));
			msg.setKTECHG(msgClass.getMessageString(1));
			msg.setKTDTTM(msgClass.getMessageNumber(14,0));
			msg.setKTCGEN(msgClass.getMessageString(6));
			msg.setKTCBI2(msgClass.getMessageString(1));
			msg.setKTCBI3(msgClass.getMessageString(1));
			msg.setKTCMPD(msgClass.getMessageString(54));
			msg.setKTPMPD(msgClass.getMessageString(54));
			msg.setKTVECS(msgClass.getMessageString(3));
			msg.setKTICCI(msgClass.getMessageString(1));
			msg.setKTLEBD(msgClass.getMessageNumber(8,0));
			msg.setKTLPID(msgClass.getMessageNumber(8,0));
			msg.setKTFPIN(msgClass.getMessageNumber(8,0));
			msg.setKTICFD(msgClass.getMessageNumber(8,0));
			msg.setKTDEAC(msgClass.getMessageString(1));
			msg.setKTDEDT(msgClass.getMessageNumber(8,0));
			msg.setKTNCGN(msgClass.getMessageNumber(3,0));
			msg.setKTBR(msgClass.getMessageNumber(5,0));
			msg.setKTPHTO(msgClass.getMessageString(1));
			msg.setKTFPKW(msgClass.getMessageNumber(1,0));
			msg.setKTFPKT(msgClass.getMessageNumber(1,0));
			msg.setKTKRT1(msgClass.getMessageNumber(19,0));
			msg.setKRNKDB(msgClass.getMessageNumber(6,0));
			msg.setKRKRTS(msgClass.getMessageNumber(3,0));
			msg.setKRKNST(msgClass.getMessageNumber(3,0));
			msg.setWDRCHR(msgClass.getMessageString(1));
			msg.setWDRCRD(msgClass.getMessageString(1));
			msg.setWDBKRD(msgClass.getMessageNumber(11,0));
			msg.setWDLCHK(msgClass.getMessageString(1));
			msg.setKTCSTS(msgClass.getMessageNumber(1,0));
			msg.setKTCDAT(msgClass.getMessageNumber(8,0));
			msg.setKTDREF(msgClass.getMessageString(15));
			msg.setKTCLEB(msgClass.getMessageNumber(2,0));
			msg.setKTCLCB(msgClass.getMessageString(6));
			msg.setKTDECH(msgClass.getMessageString(2));
			
			msg.setResponseCode("OK");
			msg.setResponseDescription("Successfully.");
		}
		catch (Exception ex)
		{
			msg.setResponseCode("ER");
			msg.setResponseDescription(ex.getMessage() + " [intIndex=" + msgClass.intIndex + ", Length=" + msgClass.MessageString.length() + "]");
		}
		
		return msg.getMendixObject();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GetTC9414";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
