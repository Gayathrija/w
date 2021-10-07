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
import ktc_scs_schema.proxies.TC9201_TEXTRGDS;
import ktcmdwscsconnector.customs.MessageClass;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class GetTC9201 extends CustomJavaAction<IMendixObject>
{
	private java.lang.String messageString;

	public GetTC9201(IContext context, java.lang.String messageString)
	{
		super(context);
		this.messageString = messageString;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		MessageClass msgClass = new MessageClass();
		TC9201_TEXTRGDS msg = new TC9201_TEXTRGDS(this.getContext());
		
		try
		{
			// Start Detail
			msgClass.intIndex = 693;
			msgClass.MessageString = this.messageString;
			
			msg.setTXNTYP(msgClass.getMessageNumber(1,0));
			msg.setTXTKEY(msgClass.getMessageNumber(19,0));
			msg.setTXNCAT(msgClass.getMessageString(6));
			msg.setTXTDAT(msgClass.getMessageNumber(8,0));
			msg.setTXDTTM(msgClass.getMessageNumber(14,0));
			msg.setTXUSER(msgClass.getMessageString(10));
			msg.setTXTEXT(msgClass.getMessageString(60));
			msg.setTXRMOD(msgClass.getMessageNumber(1,0));
			msg.setTXRDAT(msgClass.getMessageNumber(8,0));
			msg.setTXDLDT(msgClass.getMessageNumber(8,0));
			msg.setTXOLIC(msgClass.getMessageString(40));
			msg.setTXDLBY(msgClass.getMessageString(10));
			msg.setTXWIND(msgClass.getMessageString(1));
			
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
		return "GetTC9201";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}