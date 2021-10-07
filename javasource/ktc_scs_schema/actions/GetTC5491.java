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
import ktc_scs_schema.proxies.TC5491Rs_KNTRSK04DS;
import ktcmdwscsconnector.customs.MessageClass;

public class GetTC5491 extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.lang.String messageString;
	private java.lang.String searchKey;
	private java.lang.String moreRecord;

	public GetTC5491(IContext context, java.lang.String messageString, java.lang.String searchKey, java.lang.String moreRecord)
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
				TC5491Rs_KNTRSK04DS msg = new TC5491Rs_KNTRSK04DS(this.getContext());
				
				msg.setIPKIPN(msgClass.getMessageNumber(19, 0, false));
				msg.setIPKRTN(msgClass.getMessageNumber(19, 0, false));
				msg.setKRSVID(msgClass.getMessageString(6));
				msg.setWDSVID(msgClass.getMessageString(25));
				msg.setANATP1(msgClass.getMessageString(1));
				msg.setKRAVST(msgClass.getMessageNumber(3, 0, true));
				msg.setKRBCDE(msgClass.getMessageString(3));
				msg.setKTEMNM(msgClass.getMessageString(26));
				msg.setKRKNST(msgClass.getMessageNumber(3, 0, true));
				msg.setKRBKRD(msgClass.getMessageNumber(11, 0));
				msg.setKRSLDO(msgClass.getMessageNumber(15, 2, false));
				msg.setPHBELP(msgClass.getMessageNumber(15, 2, false));
				msg.setKRIBDT(msgClass.getMessageNumber(8, 0, false));
				msg.setKRGACC(msgClass.getMessageNumber(19, 0, false));
				msg.setKRCCDE(msgClass.getMessageString(3));
				msg.setKRUSLD(msgClass.getMessageNumber(15, 2, false));
				msg.setKRLBET(msgClass.getMessageNumber(15, 2, false));
				msg.setKROTBM(msgClass.getMessageString(1));
				msg.setKRDBAL(msgClass.getMessageNumber(15, 2, false));
				msg.setKRPRBO(msgClass.getMessageNumber(15, 2, false));
				msg.setWDINDC(msgClass.getMessageString(1));
				msg.setKRKAID(msgClass.getMessageString(3));
				msg.setKRPGRP(msgClass.getMessageString(3));
				msg.setKRRKID(msgClass.getMessageString(6));
				msg.setWDRKID(msgClass.getMessageString(25));
				msg.setSDPPID(msgClass.getMessageString(6));
				msg.setKTKIPN(msgClass.getMessageNumber(19, 0, false));
				msg.setIPEMNM(msgClass.getMessageString(26));
				msg.setKTKRST(msgClass.getMessageNumber(3, 0, false));
				msg.setKRCLDO(msgClass.getMessageNumber(15, 2, false));
				msg.setKRRLDO(msgClass.getMessageNumber(15, 2, false));
				msg.setWDCLVL(msgClass.getMessageNumber(1, 0, false));
				msg.setWDFLAG(msgClass.getMessageString(1));
				msg.setSKSPRK(msgClass.getMessageString(2));
				msg.setWDCAVL(msgClass.getMessageNumber(15, 2, false));
				msg.setWDAAVL(msgClass.getMessageNumber(15, 2, false));
				msg.setIPNAME(msgClass.getMessageString(40));
				msg.setIPNAM2(msgClass.getMessageString(40));
				
				msg.setSearchKey(searchKey);
				msg.setMoreRecord(moreRecord);
				msg.setResponseCode("OK");
				msg.setResponseDescription("Successfully.");
				list.add(msg.getMendixObject());

			}
		}
		catch (Exception ex)
		{
			TC5491Rs_KNTRSK04DS msg = new TC5491Rs_KNTRSK04DS(this.getContext());
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
		return "GetTC5491";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
