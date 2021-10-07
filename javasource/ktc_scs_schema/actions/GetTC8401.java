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
import ktc_scs_schema.proxies.TC8401_SPKORTDS;
import ktcmdwscsconnector.customs.MessageClass;

public class GetTC8401 extends CustomJavaAction<IMendixObject>
{
	private java.lang.String messageString;

	public GetTC8401(IContext context, java.lang.String messageString)
	{
		super(context);
		this.messageString = messageString;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		MessageClass msgClass = new MessageClass();
		TC8401_SPKORTDS msg = new TC8401_SPKORTDS(this.getContext());
		
		try
		{
			// Start Detail
			msgClass.intIndex = 693;
			msgClass.MessageString = this.messageString;

			msg.setSKKRTN(msgClass.getMessageNumber(19, false));
			msg.setSKSFDN(msgClass.getMessageNumber(8, false));
			msg.setSKRREF(msgClass.getMessageString(12));
			msg.setKTKNTN(msgClass.getMessageNumber(19, false));
			msg.setKTEMNM(msgClass.getMessageString(40));
			msg.setSKRKID(msgClass.getMessageString(6));
			msg.setSRNETW(msgClass.getMessageString(3));
			msg.setKTKRST(msgClass.getMessageNumber(3, false));
			msg.setSKSTDN(msgClass.getMessageNumber(8, false));
			msg.setSKSPTM(msgClass.getMessageString(6));
			msg.setSKNSTS(msgClass.getMessageNumber(1, false));
			msg.setSKNDAT(msgClass.getMessageNumber(8, false));
			msg.setKTSPKD(msgClass.getMessageNumber(1, false));
			msg.setSKSPRK(msgClass.getMessageString(2));
			msg.setSKAKTK(msgClass.getMessageString(2));
			msg.setSKVIPA(msgClass.getMessageNumber(15, false));
			msg.setSKRESP(msgClass.getMessageString(2));
			msg.setSKARJC(msgClass.getMessageString(4));
			msg.setSKCHG(msgClass.getMessageNumber(1, false));
			msg.setSKUSER(msgClass.getMessageString(10));
			msg.setSKSTDI(msgClass.getMessageNumber(8, false));
			msg.setSKREG1(msgClass.getMessageString(1));
			msg.setSKSTD1(msgClass.getMessageNumber(8, false));
			msg.setSKCHD1(msgClass.getMessageNumber(8, false));
			msg.setSKREG2(msgClass.getMessageString(1));
			msg.setSKSTD2(msgClass.getMessageNumber(8, false));
			msg.setSKCHD2(msgClass.getMessageNumber(8, false));
			msg.setSKREG3(msgClass.getMessageString(1));
			msg.setSKSTD3(msgClass.getMessageNumber(8, false));
			msg.setSKCHD3(msgClass.getMessageNumber(8, false));
			msg.setSKREG4(msgClass.getMessageString(1));
			msg.setSKSTD4(msgClass.getMessageNumber(8, false));
			msg.setSKCHD4(msgClass.getMessageNumber(8, false));
			msg.setSKREG5(msgClass.getMessageString(1));
			msg.setSKSTD5(msgClass.getMessageNumber(8, false));
			msg.setSKCHD5(msgClass.getMessageNumber(8, false));
			msg.setSKREG6(msgClass.getMessageString(1));
			msg.setSKSTD6(msgClass.getMessageNumber(8, false));
			msg.setSKCHD6(msgClass.getMessageNumber(8, false));
			msg.setSKREG7(msgClass.getMessageString(1));
			msg.setSKSTD7(msgClass.getMessageNumber(8, false));
			msg.setSKCHD7(msgClass.getMessageNumber(8, false));
			msg.setSKREG8(msgClass.getMessageString(1));
			msg.setSKSTD8(msgClass.getMessageNumber(8, false));
			msg.setSKCHD8(msgClass.getMessageNumber(8, false));
			msg.setSKREG9(msgClass.getMessageString(1));
			msg.setSKSTD9(msgClass.getMessageNumber(8, false));
			msg.setSKCHD9(msgClass.getMessageNumber(8, false));
			msg.setSKREG0(msgClass.getMessageString(1));
			msg.setSKSTD0(msgClass.getMessageNumber(8, false));
			msg.setSKCHD0(msgClass.getMessageNumber(8, false));
			msg.setSKTSRC(msgClass.getMessageString(1));
			msg.setSKDTTM(msgClass.getMessageNumber(14, false));
			msg.setSKLSTS(msgClass.getMessageNumber(1, false));
			msg.setSKRREL(msgClass.getMessageString(12));
			msg.setSKTSST(msgClass.getMessageNumber(1, false));
			msg.setSKRRET(msgClass.getMessageString(12));
			msg.setKTFPKF(msgClass.getMessageNumber(1, false));
			msg.setKTKTTP(msgClass.getMessageString(3));
			msg.setKTGTDT(msgClass.getMessageNumber(6, false));
			msg.setKTGTDP(msgClass.getMessageNumber(6, false));
			msg.setKTGTST(msgClass.getMessageString(1));
			msg.setKTEMDT(msgClass.getMessageNumber(8, false));
			msg.setKTSPDT(msgClass.getMessageNumber(8, false));
			msg.setKTAUDT(msgClass.getMessageNumber(8, false));
			msg.setWDIND(msgClass.getMessageString(1));
			msg.setWDOURCRD(msgClass.getMessageString(1));
			msg.setWDSTPI(msgClass.getMessageString(1));
			msg.setWDINTSTP(msgClass.getMessageString(1));
			msg.setSRCPGM(msgClass.getMessageString(3));
			msg.setKYDTTM(msgClass.getMessageNumber(14, false));
			msg.setKTDTTM(msgClass.getMessageNumber(14, false));
			msg.setWDSPKD(msgClass.getMessageNumber(1, false));
			msg.setWDFOUND(msgClass.getMessageString(1));
			msg.setSKSPR2(msgClass.getMessageString(3));
			
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
		return "GetTC8401";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
