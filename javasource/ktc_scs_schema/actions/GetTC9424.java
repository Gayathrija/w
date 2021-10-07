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
import ktc_scs_schema.proxies.TC9424_KORTRG05DS;
import ktcmdwscsconnector.customs.MessageClass;

public class GetTC9424 extends CustomJavaAction<IMendixObject>
{
	private java.lang.String messageString;

	public GetTC9424(IContext context, java.lang.String messageString)
	{
		super(context);
		this.messageString = messageString;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		MessageClass msgClass = new MessageClass();
		TC9424_KORTRG05DS msg = new TC9424_KORTRG05DS(this.getContext());
		
		try
		{
			// Start Detail
			msgClass.intIndex = 693;
			msgClass.MessageString = this.messageString;

			msg.setWDBNTN(msgClass.getMessageNumber(9,0));
			msg.setKTKRTN(msgClass.getMessageNumber(19,0));
			msg.setKTEMNM(msgClass.getMessageString(26));
			msg.setKTGTDT(msgClass.getMessageNumber(6,0));
			msg.setKTKTTP(msgClass.getMessageString(3));
			msg.setKTCLEC(msgClass.getMessageString(6));
			msg.setKTSRVC(msgClass.getMessageNumber(3,0));
			msg.setKTPVKI(msgClass.getMessageNumber(2,0));
			msg.setKTPVV(msgClass.getMessageString(4));
			msg.setWDBANT(msgClass.getMessageNumber(7,0));
			msg.setWDRANT(msgClass.getMessageNumber(7,0));
			msg.setWDDANT(msgClass.getMessageNumber(7,0));
			
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
		return "GetTC9424";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
