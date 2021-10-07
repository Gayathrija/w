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
import ktc_scs_schema.proxies.TC2225_KNTRSK31DS;
import ktcmdwscsconnector.customs.MessageClass;

public class GetTC2225 extends CustomJavaAction<IMendixObject>
{
	private java.lang.String messageString;

	public GetTC2225(IContext context, java.lang.String messageString)
	{
		super(context);
		this.messageString = messageString;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		MessageClass msgClass = new MessageClass();
		TC2225_KNTRSK31DS msg = new TC2225_KNTRSK31DS(this.getContext());
		
		try
		{
			// Start Detail
			msgClass.intIndex = 693;
			msgClass.MessageString = this.messageString;
			
			msg.setKRKNTN(msgClass.getMessageNumber(19,0));
			msg.setKTKRTN(msgClass.getMessageNumber(19,0));
			msg.setKRKIPN(msgClass.getMessageNumber(19,0));
			msg.setIPLSNM(msgClass.getMessageString(40));
			msg.setIPINIT(msgClass.getMessageString(40));
			msg.setIPNAME(msgClass.getMessageString(40));
			msg.setIPNAM2(msgClass.getMessageString(40));
			msg.setKRCBIL(msgClass.getMessageString(1));
			msg.setLMGNUM(msgClass.getMessageNumber(19,0));
			msg.setLMGNAM(msgClass.getMessageString(40));
			msg.setLBCBIL(msgClass.getMessageString(1));
			msg.setLBCREF(msgClass.getMessageNumber(19,0));
			msg.setWDLSNM(msgClass.getMessageString(40));
			msg.setWDINIT(msgClass.getMessageString(40));
			msg.setKRDTTM(msgClass.getMessageNumber(14,0));

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
		return "GetTC2225";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
