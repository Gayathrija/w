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
import ktc_scs_schema.proxies.TCIILN503Rs;
import ktcmdwscsconnector.customs.MessageClass;

public class GetTCIILN503 extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.lang.String messageString;
	private java.lang.String searchKey;
	private java.lang.String moreRecord;

	public GetTCIILN503(IContext context, java.lang.String messageString, java.lang.String searchKey, java.lang.String moreRecord)
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
				TCIILN503Rs msg = new TCIILN503Rs(this.getContext());
				
				msg.setCFSSNO(msgClass.getMessageString(40));
				msg.setCFCIFN(msgClass.getMessageNumber(19, 0, false));
				msg.setACCTNO(msgClass.getMessageNumber(19, 0, false));
				msg.setACNAM1(msgClass.getMessageString(80));
				msg.setACNAM2(msgClass.getMessageString(120));	
				msg.setSTATUS(msgClass.getMessageNumber(1, 0));
				msg.setLoanType(msgClass.getMessageString(10));	
				msg.setPTYDSC(msgClass.getMessageString(20));				
				msg.setRATE(msgClass.getMessageNumber(11, 9, false));
				msg.setPMTAMT(msgClass.getMessageNumber(17, 2, false));
				msg.setNPDT8(msgClass.getMessageNumber(8, 0, false));
				msg.setCBAL(msgClass.getMessageNumber(17, 2, false));
				msg.setXDUEBAL(msgClass.getMessageNumber(17, 2, false));
				msg.setXOSBAL(msgClass.getMessageNumber(17, 2, false));
				msg.setMATDT8(msgClass.getMessageNumber(8, 0, false));
				msg.setORGDT8(msgClass.getMessageNumber(8, 0, false));
				msg.setLMMIAC(msgClass.getMessageNumber(5, 0, false));
				msg.setACTYPE(msgClass.getMessageString(1));		
				msg.setCCBRGN(msgClass.getMessageString(25));	
				msg.setBRN(msgClass.getMessageNumber(5, 0, false));
				msg.setTERM(msgClass.getMessageNumber(5, 0, false));
				msg.setTMCODE(msgClass.getMessageString(1));
				msg.setDAYIN(msgClass.getMessageNumber(5, 0, false));
				msg.setAVLBAL(msgClass.getMessageNumber(17, 2, false));
				msg.setAVLLMT(msgClass.getMessageNumber(17, 2, false));
				msg.setCFBIR8(msgClass.getMessageString(8));
				msg.setEMAIL(msgClass.getMessageString(100));
				msg.setMOBIL(msgClass.getMessageString(100));
				msg.setCARCD(msgClass.getMessageString(2));
				msg.setTLCODE(msgClass.getMessageString(2));
				
				msg.setSearchKey(searchKey);
				msg.setMoreRecord(moreRecord);
				msg.setResponseCode("OK");
				msg.setResponseDescription("Successfully.");
				
				list.add(msg.getMendixObject());
				
			}
		}
		catch (Exception ex)
		{
			TCIILN503Rs msg = new TCIILN503Rs(this.getContext());
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
		return "GetTCIILN503";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}