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
import ktc_scs_schema.proxies.TC5422_DISPHSDS;
import ktcmdwscsconnector.customs.MessageClass;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class GetTC5422 extends CustomJavaAction<IMendixObject>
{
	private java.lang.String messageString;

	public GetTC5422(IContext context, java.lang.String messageString)
	{
		super(context);
		this.messageString = messageString;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		MessageClass msgClass = new MessageClass();
		TC5422_DISPHSDS msg = new TC5422_DISPHSDS(this.getContext());
		
		try
		{
			// Start Detail
			msgClass.intIndex = 693;
			msgClass.MessageString = this.messageString;
			
			msg.setDPBNTN(msgClass.getMessageNumber(9, 0, true));
			msg.setDPBLON(msgClass.getMessageNumber(7, 0, true));
			msg.setDPDTTM(msgClass.getMessageNumber(14, 0));
			msg.setDPTTYP(msgClass.getMessageNumber(4, 0, true));
			msg.setDPKRTN(msgClass.getMessageNumber(19, 0));
			msg.setDPKNTN(msgClass.getMessageNumber(19, 0));
			msg.setTRRKID(msgClass.getMessageString(6));
			msg.setDPTRDT(msgClass.getMessageNumber(8, 0));
			msg.setDPVLDT(msgClass.getMessageNumber(8, 0));
			msg.setTRBELS(msgClass.getMessageNumber(15, 2));
			msg.setTRCCDS(msgClass.getMessageString(3));
			msg.setTRBELB(msgClass.getMessageNumber(15, 2));
			msg.setTRCCDB(msgClass.getMessageString(3));
			msg.setTRMCC(msgClass.getMessageString(4));
			msg.setDPBKID(msgClass.getMessageNumber(11, 0));
			msg.setBKBPNM(msgClass.getMessageString(40));
			msg.setTRUBNT(msgClass.getMessageNumber(9, 0, true));
			msg.setTRUBLO(msgClass.getMessageNumber(7, 0, true));
			msg.setTRIDRF(msgClass.getMessageString(15));
			msg.setDPBDAT(msgClass.getMessageNumber(8, 0));
			msg.setDPPERI(msgClass.getMessageNumber(6, 0));
			msg.setTRKNTR(msgClass.getMessageString(6));
			msg.setWDCPD(msgClass.getMessageNumber(3, 0));
			msg.setTRREF(msgClass.getMessageString(15));
			msg.setV0REAT(msgClass.getMessageString(1));
			msg.setTRACQN(msgClass.getMessageNumber(23, 0, true));
			msg.setDPCBD1(msgClass.getMessageNumber(8, 0));
			msg.setDPCBD2(msgClass.getMessageNumber(8, 0));
			msg.setDPCBD3(msgClass.getMessageNumber(8, 0));
			msg.setDPCCR1(msgClass.getMessageString(2));
			msg.setDPCCR2(msgClass.getMessageString(2));
			msg.setDPCCR3(msgClass.getMessageString(2));
			msg.setDPDDAT(msgClass.getMessageNumber(8, 0));
			msg.setDPSTAS(msgClass.getMessageString(1));
			msg.setDPDPRE(msgClass.getMessageString(2));
			msg.setDPAMT(msgClass.getMessageNumber(15, 2));
			msg.setDPREFN(msgClass.getMessageString(15));
			msg.setDPRDAT(msgClass.getMessageNumber(8, 0));
			msg.setDPVALD(msgClass.getMessageNumber(8, 0));
			msg.setDPSTLC(msgClass.getMessageNumber(8, 0));
			msg.setDPUSER(msgClass.getMessageString(10));
			msg.setDPWSTN(msgClass.getMessageString(10));
			msg.setSRNETW(msgClass.getMessageString(3));
			msg.setDPPEK(msgClass.getMessageNumber(7, 0));
			msg.setDPREAS(msgClass.getMessageString(2));
			msg.setDPCBD0(msgClass.getMessageNumber(8, 0));
			msg.setDPCBD4(msgClass.getMessageNumber(8, 0));
			msg.setDPCBD5(msgClass.getMessageNumber(8, 0));
			msg.setDPCCR0(msgClass.getMessageString(2));
			msg.setDPCCR4(msgClass.getMessageString(2));
			msg.setDPCCR5(msgClass.getMessageString(2));
			msg.setDPIACD(msgClass.getMessageString(1));
			msg.setDPMEAC(msgClass.getMessageNumber(5, 0));
			msg.setDPPERR(msgClass.getMessageNumber(6, 0));
			msg.setTRPOSM(msgClass.getMessageString(2));
			msg.setTRCCCD(msgClass.getMessageString(1));
			msg.setTRTCAP(msgClass.getMessageString(24));
			msg.setTRCKRT(msgClass.getMessageNumber(19, 0));
			msg.setTKTPAN(msgClass.getMessageNumber(19, 0));
			
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
		return "GetTC5422";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}