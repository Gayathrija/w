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
import ktc_scs_schema.proxies.TC9192_CUSBNK01DS;
import ktcmdwscsconnector.customs.MessageClass;

public class GetTC9192 extends CustomJavaAction<IMendixObject>
{
	private java.lang.String messageString;

	public GetTC9192(IContext context, java.lang.String messageString)
	{
		super(context);
		this.messageString = messageString;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		MessageClass msgClass = new MessageClass();
		TC9192_CUSBNK01DS msg = new TC9192_CUSBNK01DS(this.getContext());
				
		try
		{
			// Start Detail
			msgClass.intIndex = 693;
			msgClass.MessageString = this.messageString;

			msg.setIDKIPN(msgClass.getMessageNumber(19, false));
			msg.setIDDBB(msgClass.getMessageString(6));
			msg.setIDDBAT(msgClass.getMessageString(3));
			msg.setIDDBAN(msgClass.getMessageString(19));
			msg.setIDDBSQ(msgClass.getMessageNumber(2, false));
			msg.setIDDBST(msgClass.getMessageString(1));
			msg.setIDDTTM(msgClass.getMessageNumber(14, false));
			msg.setIDCDTM(msgClass.getMessageNumber(14, false));
			msg.setIDOFLG(msgClass.getMessageString(3));
			msg.setIDOLIC(msgClass.getMessageString(40));
			msg.setIDOITP(msgClass.getMessageString(3));
			msg.setIDOADR(msgClass.getMessageString(200));
			msg.setIDONAM(msgClass.getMessageString(80));
			msg.setIDCHNL(msgClass.getMessageString(3));
			//msg.setIDALIS(msgClass.getMessageString(80));
			
			msg.setResponseCode("OK");
			msg.setResponseDescription("Successfully.");
		}
		catch (Exception ex) {
			msg.setResponseCode("ER");
			msg.setResponseDescription(ex.getMessage() + " [intIndex=" + msgClass.intIndex + ", Length="
					+ msgClass.MessageString.length() + "]");
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
		return "GetTC9192";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
