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
import ktc_scs_schema.proxies.TC9205_CUSSPODS;
import ktcmdwscsconnector.customs.MessageClass;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class GetTC9205 extends CustomJavaAction<IMendixObject>
{
	private java.lang.String messageString;

	public GetTC9205(IContext context, java.lang.String messageString)
	{
		super(context);
		this.messageString = messageString;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		MessageClass msgClass = new MessageClass();
		TC9205_CUSSPODS msg = new TC9205_CUSSPODS(this.getContext());
		
		try
		{
			// Start Detail
			msgClass.intIndex = 693;
			msgClass.MessageString = this.messageString;
						
			msg.setIPKIPN(msgClass.getMessageNumber(19,0));
			msg.setIPRLSP(msgClass.getMessageString(6));
			msg.setIPSEQ1(msgClass.getMessageNumber(4,0));
			msg.setIPRLNM(msgClass.getMessageString(40));
			msg.setIPOLI3(msgClass.getMessageString(40));
			msg.setIPITP3(msgClass.getMessageString(3));
			msg.setIPRAD1(msgClass.getMessageString(40));
			msg.setIPRAD2(msgClass.getMessageString(40));
			msg.setIPRAD3(msgClass.getMessageString(40));
			msg.setIPRAD4(msgClass.getMessageString(40));
			msg.setIPRPNR(msgClass.getMessageString(9));
			msg.setIPRCTY(msgClass.getMessageString(40));
			msg.setIPRSTE(msgClass.getMessageString(3));
			msg.setIPRCNC(msgClass.getMessageString(3));
			msg.setIPEMLP(msgClass.getMessageString(100));
			msg.setIPNWI4(msgClass.getMessageString(40));
			msg.setIPTELJ(msgClass.getMessageString(20));
			msg.setIPTELK(msgClass.getMessageString(20));
			msg.setIPTEL3(msgClass.getMessageString(20));
			msg.setIPOCC1(msgClass.getMessageString(6));
			msg.setIPANVE(msgClass.getMessageNumber(8,0));
			msg.setIPOCC2(msgClass.getMessageString(6));
			msg.setIPODT2(msgClass.getMessageNumber(8,0));
			msg.setIPSPNM(msgClass.getMessageString(32));
			msg.setIPRCTP(msgClass.getMessageString(1));
			msg.setIPITP4(msgClass.getMessageString(3));
			msg.setIPNATI(msgClass.getMessageString(3));
			msg.setIPTELJE(msgClass.getMessageNumber(7,0));
			msg.setIPTELKE(msgClass.getMessageNumber(7,0));
			msg.setIPDTTM(msgClass.getMessageNumber(14,0));
			
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
		return "GetTC9205";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
