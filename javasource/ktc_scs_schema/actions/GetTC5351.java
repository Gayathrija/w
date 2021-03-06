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
import ktc_scs_schema.proxies.TC5351_BNTAVS01DS;
import ktcmdwscsconnector.customs.MessageClass;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class GetTC5351 extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.lang.String messageString;
	private java.lang.String searchKey;
	private java.lang.String moreRecord;

	public GetTC5351(IContext context, java.lang.String messageString, java.lang.String searchKey, java.lang.String moreRecord)
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
				TC5351_BNTAVS01DS msg = new TC5351_BNTAVS01DS(this.getContext());
				// Start Detail
				msgClass.intIndex = 693;
				msgClass.MessageString = this.messageString;

				msg.setBNBNTN(msgClass.getMessageNumber(9, 0));
				msg.setBNBLON(msgClass.getMessageNumber(7, 0));
				msg.setBNTTYP(msgClass.getMessageNumber(4, 0));
				msg.setBNBKID(msgClass.getMessageNumber(11, 0));
				msg.setBNBEL(msgClass.getMessageNumber(15, 2));
				msg.setBNCCDE(msgClass.getMessageString(3));
				msg.setBNBANT(msgClass.getMessageNumber(7, 0));
				msg.setBNEDAT(msgClass.getMessageNumber(8, 0));
				msg.setBNBDAT(msgClass.getMessageNumber(8, 0));
				msg.setBNBNST(msgClass.getMessageNumber(3, 0));
				msg.setBNKORR(msgClass.getMessageString(1));
				msg.setBNEREF(msgClass.getMessageString(15));
				msg.setBNUSER(msgClass.getMessageString(10));
				msg.setBNDTTM(msgClass.getMessageNumber(14, 0));
				msg.setBNBPNM(msgClass.getMessageString(40));
				msg.setWDFROM(msgClass.getMessageNumber(8, 0));
				msg.setWDTOM(msgClass.getMessageNumber(8, 0));
				msg.setWDBKID(msgClass.getMessageNumber(11, 0));
				msg.setWDRKID(msgClass.getMessageString(6));
				msg.setBNUAPV(msgClass.getMessageString(10));
				
				msg.setSearchKey(searchKey);
				msg.setMoreRecord(moreRecord);
				msg.setResponseCode("OK");
				msg.setResponseDescription("Successfully.");

				list.add(msg.getMendixObject());
			}
		}
		catch (Exception ex)
		{
			TC5351_BNTAVS01DS msg = new TC5351_BNTAVS01DS(this.getContext());
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
		return "GetTC5351";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
