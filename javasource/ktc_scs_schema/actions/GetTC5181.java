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
import ktc_scs_schema.proxies.TC5181_INTPRJ01DS;
import ktcmdwscsconnector.customs.MessageClass;

public class GetTC5181 extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.lang.String messageString;
	private java.lang.String searchKey;
	private java.lang.String moreRecord;

	public GetTC5181(IContext context, java.lang.String messageString, java.lang.String searchKey, java.lang.String moreRecord)
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
				TC5181_INTPRJ01DS msg = new TC5181_INTPRJ01DS(this.getContext());				

				msg.setWDKNTX(msgClass.getMessageNumber(19, 0));
				msg.setWDFRDT(msgClass.getMessageNumber(8, 0));
				msg.setWDTCGR(msgClass.getMessageString(6));
				msg.setWDSLDO(msgClass.getMessageNumber(15, 2));
				msg.setWDPROJ(msgClass.getMessageNumber(15, 2));
				msg.setWDOVDU(msgClass.getMessageNumber(15, 2));
				msg.setWDOVLM(msgClass.getMessageNumber(15, 2));
				msg.setWDOTHR(msgClass.getMessageNumber(15, 2));
				msg.setWDTOTL(msgClass.getMessageNumber(15, 2));
				msg.setWDGRTP(msgClass.getMessageNumber(2, 0));
				msg.setWDCUSG(msgClass.getMessageNumber(15, 2));
				msg.setWDUPPR(msgClass.getMessageNumber(15, 2));
				msg.setKRPRBO(msgClass.getMessageNumber(15, 2));
				msg.setLLUFLX(msgClass.getMessageNumber(15, 2));
				msg.setKUDCDE(msgClass.getMessageString(2));
				msg.setKUSKUT(msgClass.getMessageNumber(8, 0));
				msg.setWDSACT(msgClass.getMessageString(1));
				msg.setLLFTOT(msgClass.getMessageNumber(15, 2));
				msg.setWDINEX(msgClass.getMessageString(1));
				msg.setWDINSP(msgClass.getMessageString(1));
				msg.setWDFLIC(msgClass.getMessageNumber(15, 2));
				
				msg.setSearchKey(searchKey);
				msg.setMoreRecord(moreRecord);
				msg.setResponseCode("OK");
				msg.setResponseDescription("Successfully.");
								
				list.add(msg.getMendixObject());
				
			}
		}
		catch (Exception ex)
		{
			TC5181_INTPRJ01DS msg = new TC5181_INTPRJ01DS(this.getContext());
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
		return "GetTC5181";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
