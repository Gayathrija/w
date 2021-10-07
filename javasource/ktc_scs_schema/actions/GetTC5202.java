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
import ktc_scs_schema.proxies.TC5202Rs;
import ktcmdwscsconnector.customs.MessageClass;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class GetTC5202 extends CustomJavaAction<IMendixObject>
{
	private java.lang.String messageString;

	public GetTC5202(IContext context, java.lang.String messageString)
	{
		super(context);
		this.messageString = messageString;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		MessageClass msgClass = new MessageClass();
		TC5202Rs msg = new TC5202Rs(this.getContext());
		try
		{
			// Start Detail
			msgClass.intIndex = 693;
			msgClass.MessageString = this.messageString;
			
			msg.setAXKIPN(msgClass.getMessageNumber(19, 0));
			msg.setAXADTP(msgClass.getMessageString(1));
			msg.setAXSEQ1(msgClass.getMessageNumber(4, 0));
			msg.setAXADR1(msgClass.getMessageString(40));
			msg.setAXADR2(msgClass.getMessageString(40));
			msg.setAXADR3(msgClass.getMessageString(40));
			msg.setAXADR4(msgClass.getMessageString(40));
			msg.setAXPNR(msgClass.getMessageString(9));
			msg.setAXCITY(msgClass.getMessageString(40));
			msg.setAXLSTE(msgClass.getMessageString(3));
			msg.setAXCNCD(msgClass.getMessageString(3));
			msg.setAXADRF(msgClass.getMessageString(1));
			msg.setWDCBIL(msgClass.getMessageString(14));
			msg.setAXDTTM(msgClass.getMessageNumber(14, 0));
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
		return "GetTC5202";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
