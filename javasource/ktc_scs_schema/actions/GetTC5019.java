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
import ktc_scs_schema.proxies.TC5019_LIMRQS02DS;
import ktcmdwscsconnector.customs.MessageClass;

public class GetTC5019 extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.lang.String messageString;
	private java.lang.String searchKey;
	private java.lang.String moreRecord;

	public GetTC5019(IContext context, java.lang.String messageString, java.lang.String searchKey, java.lang.String moreRecord)
	{
		super(context);
		this.messageString = messageString;
		this.searchKey = searchKey;
		this.moreRecord = moreRecord;
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		// BEGIN USER CODE
		MessageClass msgClass = new MessageClass();
		java.util.List<IMendixObject> list = new java.util.ArrayList<IMendixObject>();
		
		try
		{
			// Start Detail
			msgClass.intIndex = 693;
			msgClass.MessageString = this.messageString;
			
			while(msgClass.intIndex < msgClass.MessageString.length())
			{
				TC5019_LIMRQS02DS msg = new TC5019_LIMRQS02DS(this.getContext());
				
				msg.setLPKNTN(msgClass.getMessageNumber(19, 0));
				msg.setKRKNTN(msgClass.getMessageNumber(19, 0));
				msg.setKRBKRD(msgClass.getMessageNumber(11, 0));
				msg.setKRSLMT(msgClass.getMessageNumber(11, 0));
				msg.setWDGLIM(msgClass.getMessageNumber(11, 0));
				msg.setWDGSLM(msgClass.getMessageNumber(11, 0));
				msg.setKRAVST(msgClass.getMessageNumber(3, 0, true));
				msg.setKRRKID(msgClass.getMessageString(6));
				msg.setKRATP1(msgClass.getMessageString(1));
				msg.setKRBCDE(msgClass.getMessageString(3));
				msg.setIPNAME(msgClass.getMessageString(40));
				msg.setIPLSNM(msgClass.getMessageString(40));
				msg.setIPKRTN(msgClass.getMessageNumber(19, 0));
				msg.setKTEMNM(msgClass.getMessageString(26));
				msg.setWDCORP(msgClass.getMessageString(1));
				msg.setKRPGRP(msgClass.getMessageString(3));
				
				msg.setSearchKey(searchKey);
				msg.setMoreRecord(moreRecord);
				msg.setResponseCode("OK");
				msg.setResponseDescription("Successfully.");
				list.add(msg.getMendixObject());
			}
		}
		catch (Exception ex)
		{
			TC5019_LIMRQS02DS msg = new TC5019_LIMRQS02DS(this.getContext());
			msg.setResponseCode("ER");
			msg.setResponseDescription(ex.getMessage() + " [intIndex=" + msgClass.intIndex + ", Length=" + msgClass.MessageString.length() + "]");
			
			list.add(msg.getMendixObject());
		}
		
		return list;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GetTC5019";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}