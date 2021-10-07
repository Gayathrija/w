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
import ktc_scs_schema.proxies.TC5406_LIMHISDS;
import ktcmdwscsconnector.customs.MessageClass;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class GetTC5406 extends CustomJavaAction<IMendixObject>
{
	private java.lang.String messageString;

	public GetTC5406(IContext context, java.lang.String messageString)
	{
		super(context);
		this.messageString = messageString;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		MessageClass msgClass = new MessageClass();
		TC5406_LIMHISDS msg = new TC5406_LIMHISDS(this.getContext());
		
		try
		{
			// Start Detail
			msgClass.intIndex = 693;
			msgClass.MessageString = this.messageString;
			
			msg.setLQKNTN(msgClass.getMessageNumber(19,0));
			msg.setLQUPDD(msgClass.getMessageNumber(8,0));
			msg.setLQLMNO(msgClass.getMessageNumber(9,0));
			msg.setLQLMST(msgClass.getMessageString(1));
			msg.setLQLMTP(msgClass.getMessageString(10));
			msg.setLQAVOR(msgClass.getMessageString(3));
			msg.setLQRLIM(msgClass.getMessageNumber(11,0));
			msg.setLQRSLM(msgClass.getMessageNumber(11,0));
			msg.setLQRLIS(msgClass.getMessageNumber(11,0));
			msg.setLQRSLS(msgClass.getMessageNumber(11,0));
			msg.setLQALIM(msgClass.getMessageNumber(11,0));
			msg.setLQASLM(msgClass.getMessageNumber(11,0));
			msg.setLQALIS(msgClass.getMessageNumber(11,0));
			msg.setLQASLS(msgClass.getMessageNumber(11,0));
			msg.setLQEFDT(msgClass.getMessageNumber(8,0));
			msg.setLQEXDT(msgClass.getMessageNumber(8,0));
			msg.setLQRVDT(msgClass.getMessageNumber(8,0));
			msg.setLQAPRS(msgClass.getMessageString(3));
			msg.setLQEDIT(msgClass.getMessageString(1));
			msg.setLQURGN(msgClass.getMessageString(3));
			msg.setLQREF(msgClass.getMessageString(15));
			msg.setLQAUAP(msgClass.getMessageString(1));
			msg.setLQUPBY(msgClass.getMessageString(10));
			msg.setLQDTTM(msgClass.getMessageNumber(14,0));
			msg.setLQSSTS(msgClass.getMessageString(1));
			msg.setLQPCBY(msgClass.getMessageString(10));
			msg.setLQPCLM(msgClass.getMessageNumber(11,0));
			msg.setLQPSLM(msgClass.getMessageNumber(11,0));
			msg.setLQPCLS(msgClass.getMessageNumber(11,0));
			msg.setLQPSLS(msgClass.getMessageNumber(11,0));
			msg.setLQLTR(msgClass.getMessageString(1));

			
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
		return "GetTC5406";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
