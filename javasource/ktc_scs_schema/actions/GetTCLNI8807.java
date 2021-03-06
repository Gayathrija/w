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
import ktc_scs_schema.proxies.TCLNI8807Rs;
import ktcmdwscsconnector.customs.MessageClass;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class GetTCLNI8807 extends CustomJavaAction<IMendixObject>
{
	private java.lang.String messageString;

	public GetTCLNI8807(IContext context, java.lang.String messageString)
	{
		super(context);
		this.messageString = messageString;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		MessageClass msgClass = new MessageClass();
		TCLNI8807Rs msg = new TCLNI8807Rs(this.getContext());
		try
		{
			// Start Detail for TC
			msgClass.intIndex = 693;
			msgClass.MessageString = this.messageString;
		
			msg.setCFNA1(msgClass.getMessageString(40));
			msg.setACCTNO(msgClass.getMessageNumber(19, false));
			msg.setCIFNO(msgClass.getMessageNumber(19, false));
			msg.set_TYPE(msgClass.getMessageString(10));
			msg.setPTYDSC(msgClass.getMessageString(50));
			msg.setCFSSNO(msgClass.getMessageString(50));
			msg.setSTATUS(msgClass.getMessageNumber(1, false));
			msg.setAVLIMT(msgClass.getMessageNumber(17, 2, false));
			msg.setWTOUSE(msgClass.getMessageNumber(17, 2, false));
			msg.setWBNKACT(msgClass.getMessageString(20));
			msg.setWBNKCOD(msgClass.getMessageString(3));
			msg.setNPDT8(msgClass.getMessageNumber(8, false));
			msg.setRATE(msgClass.getMessageNumber(11, 9, false));
			msg.setPMTAMT(msgClass.getMessageNumber(17, 2, false));
			msg.setTERM(msgClass.getMessageNumber(5, false));
			msg.setXOSBAL(msgClass.getMessageNumber(17, 2, false));
			msg.setBKN(msgClass.getMessageNumber(2, false));
			msg.setJDNAME(msgClass.getMessageString(50));
			msg.setWDPD30(msgClass.getMessageString(1));
			msg.setWFRQDSC(msgClass.getMessageString(1));
			msg.setPDDAYS(msgClass.getMessageNumber(5, false));
			msg.setCFNA2(msgClass.getMessageString(40));
			msg.setCFNA3(msgClass.getMessageString(40));
			msg.setCFNA4(msgClass.getMessageString(40));
			msg.setCFNA5(msgClass.getMessageString(40));
			msg.setNPDAY(msgClass.getMessageNumber(2, false));
			msg.setWGCIFN(msgClass.getMessageNumber(19, false));
			msg.setWGASTS(msgClass.getMessageNumber(1, false));
			msg.setWGADPD(msgClass.getMessageNumber(5, false));
			msg.setCFNA1A(msgClass.getMessageString(40));
			msg.setCFZIP(msgClass.getMessageString(9));
			msg.setCFPROV(msgClass.getMessageString(20));
			
			msg.setResponseCode("000");
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
		return "GetTCLNI8807";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
