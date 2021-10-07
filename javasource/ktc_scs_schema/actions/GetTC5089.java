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
import ktc_scs_schema.proxies.TC5089_RNTAVG02DS;
import ktcmdwscsconnector.customs.MessageClass;

public class GetTC5089 extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.lang.String messageString;
	private java.lang.String searchKey;
	private java.lang.String moreRecord;

	public GetTC5089(IContext context, java.lang.String messageString, java.lang.String searchKey, java.lang.String moreRecord)
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
				TC5089_RNTAVG02DS msg = new TC5089_RNTAVG02DS(this.getContext());
				
				msg.setRABNTN(msgClass.getMessageNumber(9, 0));
				msg.setRABLON(msgClass.getMessageNumber(7, 0));
				msg.setRAUBNT(msgClass.getMessageNumber(9, 0));
				msg.setRAUBLO(msgClass.getMessageNumber(7, 0));
				msg.setRATTYP(msgClass.getMessageNumber(4, 0));
				msg.setRARKID(msgClass.getMessageString(6));
				msg.setRAKNTN(msgClass.getMessageNumber(19, 0));
				msg.setRATRDT(msgClass.getMessageNumber(8, 0));
				msg.setRABDAT(msgClass.getMessageNumber(8, 0));
				msg.setRAVLDT(msgClass.getMessageNumber(8, 0));
				msg.setRABEL(msgClass.getMessageNumber(15, 2));
				msg.setRACCDE(msgClass.getMessageString(3));
				msg.setRATRST(msgClass.getMessageNumber(3, 0));
				msg.setRABUST(msgClass.getMessageNumber(3, 0));
				msg.setRAFKDR(msgClass.getMessageString(5));
				msg.setRABKID(msgClass.getMessageNumber(11, 0));
				msg.setRADTTM(msgClass.getMessageNumber(14, 0));
				msg.setWDBEL2(msgClass.getMessageNumber(15, 2));
				msg.setWDATGD(msgClass.getMessageString(1));
				msg.setRAREFN(msgClass.getMessageString(15));
				
				msg.setSearchKey(searchKey);
				msg.setMoreRecord(moreRecord);
				msg.setResponseCode("OK");
				msg.setResponseDescription("Successfully.");
								
				list.add(msg.getMendixObject());
				
			}
		}
		catch (Exception ex)
		{
			TC5089_RNTAVG02DS msg = new TC5089_RNTAVG02DS(this.getContext());
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
		return "GetTC5089";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
