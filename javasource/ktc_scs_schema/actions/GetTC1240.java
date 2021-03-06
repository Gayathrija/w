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
import ktc_scs_schema.proxies.TC1240_ACCASO03DS;
import ktcmdwscsconnector.customs.MessageClass;

public class GetTC1240 extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.lang.String messageString;
	private java.lang.String searchKey;
	private java.lang.String moreRecord;

	public GetTC1240(IContext context, java.lang.String messageString, java.lang.String searchKey, java.lang.String moreRecord)
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
				TC1240_ACCASO03DS msg = new TC1240_ACCASO03DS(this.getContext());				

				msg.setASPRAC(msgClass.getMessageNumber(19,0));
				msg.setASKNTN(msgClass.getMessageNumber(19,0));
				msg.setASACTP(msgClass.getMessageString(3));
				msg.setASCANM(msgClass.getMessageString(40));
				msg.setASRKID(msgClass.getMessageString(6));
				msg.setASORGA(msgClass.getMessageNumber(15,2));
				msg.setASRAT1(msgClass.getMessageNumber(5,3));
				msg.setASSLDO(msgClass.getMessageNumber(15,2));
				msg.setASCDUE(msgClass.getMessageNumber(15,2));
				msg.setASLBET(msgClass.getMessageNumber(15,2));
				msg.setASRES1(msgClass.getMessageNumber(15,2));
				msg.setASTDUE(msgClass.getMessageNumber(15,2));
				msg.setASKNTR(msgClass.getMessageString(6));
				msg.setASDTTM(msgClass.getMessageNumber(14,0));
				msg.setASKRTN(msgClass.getMessageNumber(19,0));
				msg.setASIBDT(msgClass.getMessageNumber(8,0));
				msg.setASAINB(msgClass.getMessageNumber(15,2));
				msg.setASBELP(msgClass.getMessageNumber(15,2));
				msg.setASKNST(msgClass.getMessageNumber(3,0, true));
				msg.setASAVST(msgClass.getMessageNumber(3,0, true));
				
				msg.setSearchKey(searchKey);
				msg.setMoreRecord(moreRecord);
				msg.setResponseCode("OK");
				msg.setResponseDescription("Successfully.");
								
				list.add(msg.getMendixObject());
				
			}
		}
		catch (Exception ex)
		{
			TC1240_ACCASO03DS msg = new TC1240_ACCASO03DS(this.getContext());
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
		return "GetTC1240";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
