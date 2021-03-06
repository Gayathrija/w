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
import ktc_scs_schema.proxies.TC5216_CUSRVN01DS;
import ktcmdwscsconnector.customs.MessageClass;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class GetTC5216 extends CustomJavaAction<IMendixObject>
{
	private java.lang.String messageString;

	public GetTC5216(IContext context, java.lang.String messageString)
	{
		super(context);
		this.messageString = messageString;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		MessageClass msgClass = new MessageClass();
		TC5216_CUSRVN01DS msg = new TC5216_CUSRVN01DS(this.getContext());
		
		try
		{
			// Start Detail
			msgClass.intIndex = 693;
			msgClass.MessageString = this.messageString;

			msg.setIRKIPN(msgClass.getMessageNumber(19, 0));
			msg.setIRTXID(msgClass.getMessageString(40));
			msg.setIRTKIP(msgClass.getMessageNumber(19, 0));
			msg.setIRBRNO(msgClass.getMessageString(5));
			msg.setIRUSER(msgClass.getMessageString(10));
			msg.setIRDTTM(msgClass.getMessageNumber(14, 0));
			msg.setIRVFLG(msgClass.getMessageString(1));
			msg.setIRTBIL(msgClass.getMessageString(1));

			
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
		return "GetTC5216";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
