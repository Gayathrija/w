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
import ktc_scs_schema.proxies.TC7280Rs;
import ktcmdwscsconnector.customs.MessageClass;

public class GetTC7280 extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.lang.String messageString;
	private java.lang.String searchKey;
	private java.lang.String moreRecord;

	public GetTC7280(IContext context, java.lang.String messageString, java.lang.String searchKey, java.lang.String moreRecord)
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
	
		try {
			// Start Detail
			msgClass.intIndex = 693;
			msgClass.MessageString = this.messageString;
						
			while(msgClass.intIndex < msgClass.MessageString.length()) {   
				TC7280Rs msg = new TC7280Rs(this.getContext());
				
				msg.setKNMPAN(msgClass.getMessageNumber(11,false));
				msg.setKNBKID(msgClass.getMessageNumber(19,false));
				msg.setKNKRTN(msgClass.getMessageNumber(19,false));
				msg.setKNKNTR(msgClass.getMessageString(6));
				msg.setKNTRDT(msgClass.getMessageNumber(8,false));
				msg.setKNDTTM(msgClass.getMessageNumber(14,false));
				msg.setKNRSDT(msgClass.getMessageNumber(14,false));
				msg.setKNBELS(msgClass.getMessageNumber(15,2));
				msg.setKNCCDS(msgClass.getMessageString(3));
				msg.setKNNODS(msgClass.getMessageNumber(1,false));
				msg.setKNTRXC(msgClass.getMessageString(4));
				msg.setKNPRCD(msgClass.getMessageString(6));
				msg.setKNRESP(msgClass.getMessageString(2));
				msg.setKNSTAN(msgClass.getMessageNumber(6,false));
				msg.setKNRREF(msgClass.getMessageString(12));
				msg.setKNQRPI(msgClass.getMessageString(3));
				msg.setKNCANM(msgClass.getMessageString(40));
				msg.setKNBELI(msgClass.getMessageNumber(15,2));
				msg.setKNCCDI(msgClass.getMessageString(3));
				msg.setKNMCC(msgClass.getMessageString(4));
				msg.setKNTTYP(msgClass.getMessageNumber(4, false));
				msg.setSearchKey(searchKey);
				msg.setMoreRecord(moreRecord);
			
				msg.setResponseCode("OK");
				msg.setResponseDescription("Successfully.");
				
				list.add(msg.getMendixObject());
			}
		} catch (Exception ex) {
			TC7280Rs msg = new TC7280Rs(this.getContext());
			msg.setResponseCode("ER");
			msg.setResponseDescription(ex.getMessage() + " [intIndex=" + msgClass.intIndex + ", Length=" + msgClass.MessageString.length() + "]");
			msg.setSearchKey(this.searchKey);
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
		return "GetTC7280";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}