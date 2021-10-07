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
import com.mendix.webui.CustomJavaAction;
import ktc_scs_schema.proxies.TC5413_SPKORTDS;
import ktcmdwscsconnector.customs.MessageClass;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class GetTC5413 extends CustomJavaAction<IMendixObject>
{
	private java.lang.String messageString;

	public GetTC5413(IContext context, java.lang.String messageString)
	{
		super(context);
		this.messageString = messageString;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		MessageClass msgClass = new MessageClass();
		TC5413_SPKORTDS msg = new TC5413_SPKORTDS(this.getContext());
		
		try
		{
			// Start Detail
			// Start Detail
			msgClass.intIndex = 693;
			msgClass.MessageString = this.messageString;

			msg.setSKKRTN(msgClass.getMessageNumber(19,0));
			msg.setSKSFDN(msgClass.getMessageNumber(8,0));
			msg.setSKRREF(msgClass.getMessageString(12));
			msg.setKTKNTN(msgClass.getMessageNumber(19,0));
			msg.setKTEMNM(msgClass.getMessageString(40));
			msg.setSKRKID(msgClass.getMessageString(6));
			msg.setSRNETW(msgClass.getMessageString(3));
			msg.setKTKRST(msgClass.getMessageNumber(3,0));
			msg.setSKSTDN(msgClass.getMessageNumber(8,0));
			msg.setSKSPTM(msgClass.getMessageString(6));
			msg.setSKNSTS(msgClass.getMessageNumber(1,0));
			msg.setSKNDAT(msgClass.getMessageNumber(8,0));
			msg.setKTSPKD(msgClass.getMessageNumber(1,0));
			msg.setSKSPRK(msgClass.getMessageString(2));
			msg.setSKAKTK(msgClass.getMessageString(2));
			msg.setSKVIPA(msgClass.getMessageNumber(15,2));
			msg.setSKRESP(msgClass.getMessageString(2));
			msg.setSKARJC(msgClass.getMessageString(4));
			msg.setSKCHG(msgClass.getMessageNumber(1,0));
			msg.setSKUSER(msgClass.getMessageString(10));
			msg.setSKSTDI(msgClass.getMessageNumber(8,0));
			msg.setSKREG1(msgClass.getMessageString(1));
			msg.setSKSTD1(msgClass.getMessageNumber(8,0));
			msg.setSKCHD1(msgClass.getMessageNumber(8,0));
			msg.setSKREG2(msgClass.getMessageString(1));
			msg.setSKSTD2(msgClass.getMessageNumber(8,0));
			msg.setSKCHD2(msgClass.getMessageNumber(8,0));
			msg.setSKREG3(msgClass.getMessageString(1));
			msg.setSKSTD3(msgClass.getMessageNumber(8,0));
			msg.setSKCHD3(msgClass.getMessageNumber(8,0));
			msg.setSKREG4(msgClass.getMessageString(1));
			msg.setSKSTD4(msgClass.getMessageNumber(8,0));
			msg.setSKCHD4(msgClass.getMessageNumber(8,0));
			msg.setSKREG5(msgClass.getMessageString(1));
			msg.setSKSTD5(msgClass.getMessageNumber(8,0));
			msg.setSKCHD5(msgClass.getMessageNumber(8,0));
			msg.setSKREG6(msgClass.getMessageString(1));
			msg.setSKSTD6(msgClass.getMessageNumber(8,0));
			msg.setSKCHD6(msgClass.getMessageNumber(8,0));
			msg.setSKREG7(msgClass.getMessageString(1));
			msg.setSKSTD7(msgClass.getMessageNumber(8,0));
			msg.setSKCHD7(msgClass.getMessageNumber(8,0));
			msg.setSKREG8(msgClass.getMessageString(1));
			msg.setSKSTD8(msgClass.getMessageNumber(8,0));
			msg.setSKCHD8(msgClass.getMessageNumber(8,0));
			msg.setSKREG9(msgClass.getMessageString(1));
			msg.setSKSTD9(msgClass.getMessageNumber(8,0));
			msg.setSKCHD9(msgClass.getMessageNumber(8,0));
			msg.setSKREG0(msgClass.getMessageString(1));
			msg.setSKSTD0(msgClass.getMessageNumber(8,0));
			msg.setSKCHD0(msgClass.getMessageNumber(8,0));
			msg.setSKTSRC(msgClass.getMessageString(1));
			msg.setSKDTTM(msgClass.getMessageNumber(14,0));
			msg.setSKLSTS(msgClass.getMessageNumber(1,0));
			msg.setSKRREL(msgClass.getMessageString(12));
			msg.setSKTSST(msgClass.getMessageNumber(1,0));
			msg.setSKRRET(msgClass.getMessageString(12));
			msg.setKTFPKF(msgClass.getMessageNumber(1,0));
			msg.setKTKTTP(msgClass.getMessageString(3));
			msg.setKTGTDT(msgClass.getMessageNumber(6,0));
			msg.setKTGTDP(msgClass.getMessageNumber(6,0));
			msg.setKTGTST(msgClass.getMessageString(1));
			msg.setKTEMDT(msgClass.getMessageNumber(8,0));
			msg.setKTSPDT(msgClass.getMessageNumber(8,0));
			msg.setKTAUDT(msgClass.getMessageNumber(8,0));
			msg.setWDIND(msgClass.getMessageString(1));
			msg.setWDOURCRD(msgClass.getMessageString(1));
			msg.setWDSTPI(msgClass.getMessageString(1));
			msg.setWDINTSTP(msgClass.getMessageString(1));
			msg.setSRCPGM(msgClass.getMessageString(3));
			msg.setKYDTTM(msgClass.getMessageNumber(14,0));
			msg.setKTDTTM(msgClass.getMessageNumber(14,0));
			msg.setWDSPKD(msgClass.getMessageNumber(1,0));
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
		return "GetTC5413";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}