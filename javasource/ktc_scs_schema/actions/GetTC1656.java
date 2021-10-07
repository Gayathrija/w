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
import ktc_scs_schema.proxies.TC1656_KNTRSK33DS;
import ktcmdwscsconnector.customs.MessageClass;

public class GetTC1656 extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.lang.String messageString;
	private java.lang.String searchKey;
	private java.lang.String moreRecord;

	public GetTC1656(IContext context, java.lang.String messageString, java.lang.String searchKey, java.lang.String moreRecord)
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
				TC1656_KNTRSK33DS msg = new TC1656_KNTRSK33DS(this.getContext());
				
				msg.setKRKNTN(msgClass.getMessageNumber(19, false));
				msg.setKRRKID(msgClass.getMessageString(6));
				msg.setKRKNST(msgClass.getMessageNumber(3, true));
				msg.setKRBCDE(msgClass.getMessageString(3));
				msg.setKRAVST(msgClass.getMessageNumber(3, true));
				msg.setKTSPKD(msgClass.getMessageNumber(1, true));
				msg.setSKSPRK(msgClass.getMessageString(2));
				msg.setKTDEAC(msgClass.getMessageString(1));
				msg.setKTKRTN(msgClass.getMessageNumber(19, false));
				msg.setIPNAME(msgClass.getMessageString(40));
				msg.setIPNAM2(msgClass.getMessageString(40));
				msg.setKRPDAY(msgClass.getMessageNumber(2, false));
				msg.setANATP1(msgClass.getMessageString(1));
				msg.setWDTLIM(msgClass.getMessageNumber(11, false));
				msg.setKRSLDO(msgClass.getMessageNumber(15 , 2));
				msg.setKRBKRD(msgClass.getMessageNumber(11, false));
				msg.setAPOAMT(msgClass.getMessageNumber(15, 2 ));
				msg.setAPTMTO(msgClass.getMessageNumber(5, false));
				msg.setAPPAMT(msgClass.getMessageNumber(15, 2));
				msg.setKTGTDT(msgClass.getMessageNumber(5, false));
				msg.setKTGTDP(msgClass.getMessageNumber(5, false));
				msg.setKRLBET(msgClass.getMessageNumber(15, 2));
				msg.setIPKIP1(msgClass.getMessageNumber(19, false));
				msg.setIPKIP2(msgClass.getMessageNumber(19, false));
				msg.setCRPFLG(msgClass.getMessageString(1));
				msg.setWDOTB0(msgClass.getMessageNumber(15, 2));
				msg.setKTCEVT(msgClass.getMessageString(1));
				msg.setKRUSGA(msgClass.getMessageNumber(15, 2));	//host update attribute KRUSGA:UsageAmount
				msg.setKRPRBO(msgClass.getMessageNumber(15, 2));	//host update attribute KRPRBO:Authorised amount  
				msg.setKRTLDT(msgClass.getMessageNumber(8, false));	//host update attribute KRTLDT:Temp.limit expire 
				msg.setSKUSER(msgClass.getMessageString(10));
				msg.setSKSFDN(msgClass.getMessageNumber(8, false));
				msg.setSKSTDN(msgClass.getMessageNumber(8, false));
				msg.setKRRTYP(msgClass.getMessageNumber(2, false));
				//msg.setKRSTDT(msgClass.getMessageNumber(8, false));
				//msg.setKRSKUT(msgClass.getMessageNumber(8, false));
				//msg.setWDTOTD(msgClass.getMessageNumber(15, 2));
				msg.setSearchKey(searchKey);
				msg.setMoreRecord(moreRecord);
				msg.setResponseCode("OK");
				msg.setResponseDescription("Successfully.");
				
				if (!msg.getKRKNTN().toString().equals(""))
				{
					list.add(msg.getMendixObject());
				}
			}
		}
		catch (Exception ex)
		{
			TC1656_KNTRSK33DS msg = new TC1656_KNTRSK33DS(this.getContext());
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
		return "GetTC1656";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
