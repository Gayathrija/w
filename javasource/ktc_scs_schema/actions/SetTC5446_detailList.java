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
import ktcmdwscsconnector.customs.MessageClass;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class SetTC5446_detailList extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __mxObject;
	private ktc_scs_schema.proxies.TC5446_INBETR02DS mxObject;

	public SetTC5446_detailList(IContext context, IMendixObject mxObject)
	{
		super(context);
		this.__mxObject = mxObject;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.mxObject = __mxObject == null ? null : ktc_scs_schema.proxies.TC5446_INBETR02DS.initialize(getContext(), __mxObject);

		// BEGIN USER CODE
		String strMessageApplication = "";
		

		StringBuffer sb = new StringBuffer();
		try
		{

			sb.append(MessageClass.setMessageNumber(mxObject.getINBNTN(), 9));
			sb.append(MessageClass.setMessageNumber(mxObject.getINBLON(), 7));
			sb.append(MessageClass.setMessageNumber(mxObject.getINUBNT(), 9));
			sb.append(MessageClass.setMessageNumber(mxObject.getINUBLO(), 7));
			sb.append(MessageClass.setMessageNumber(mxObject.getINTTYP(), 4));
			sb.append(MessageClass.setMessageNumber(mxObject.getINKRTN(), 19));
			sb.append(MessageClass.setMessageString(mxObject.getINRKID(), 6));
			sb.append(MessageClass.setMessageNumber(mxObject.getINBKMK(), 19));
			sb.append(MessageClass.setMessageNumber(mxObject.getINTRDT(), 8));
			sb.append(MessageClass.setMessageNumber(mxObject.getINVLDT(), 8));
			sb.append(MessageClass.setMessageNumber(mxObject.getINBEL(), 15));
			sb.append(MessageClass.setMessageString(mxObject.getINCCDE(), 3));
			sb.append(MessageClass.setMessageString(mxObject.getINREFN(), 15));
			sb.append(MessageClass.setMessageString(mxObject.getINREF(), 15));
			sb.append(MessageClass.setMessageNumber(mxObject.getINBKID(), 11));
			sb.append(MessageClass.setMessageString(mxObject.getBKBPNM(), 40));
			sb.append(MessageClass.setMessageString(mxObject.getINCANM(), 40));
			sb.append(MessageClass.setMessageString(mxObject.getTRADES(), 50));
			sb.append(MessageClass.setMessageNumber(mxObject.getINUTBN(), 9));
			sb.append(MessageClass.setMessageNumber(mxObject.getINUTBL(), 7));
			sb.append(MessageClass.setMessageString(mxObject.getBNUSER(), 10));
			sb.append(MessageClass.setMessageNumber(mxObject.getWDDATE(), 8));
			sb.append(MessageClass.setMessageNumber(mxObject.getWDTIME(), 6));
			sb.append(MessageClass.setMessageNumber(mxObject.getINCHQN(), 10));
			sb.append(MessageClass.setMessageNumber(mxObject.getINTRST(), 3));
			sb.append(MessageClass.setMessageString(mxObject.getINREAC(), 3));
			sb.append(MessageClass.setMessageNumber(mxObject.getINBDAT(), 8));
			sb.append(MessageClass.setMessageNumber(mxObject.getINPERI(), 6));
			sb.append(MessageClass.setMessageNumber(mxObject.getINBUST(), 3));
			sb.append(MessageClass.setMessageString(mxObject.getINDSCC(), 1));
			sb.append(MessageClass.setMessageString(mxObject.getINFKOD(), 15));
			sb.append(MessageClass.setMessageString(mxObject.getINKORR(), 1));
			sb.append(MessageClass.setMessageNumber(mxObject.getINPEK(), 7));
			sb.append(MessageClass.setMessageNumber(mxObject.getINDTTM(), 14));
			sb.append(MessageClass.setMessageNumber(mxObject.getINKNTN(), 19));
			sb.append(MessageClass.setMessageNumber(mxObject.getINMEAC(), 5));
			sb.append(MessageClass.setMessageNumber(mxObject.getINNOD(), 1));
			sb.append(MessageClass.setMessageString(mxObject.getINRGKR(), 1));
			sb.append(MessageClass.setMessageString(mxObject.getINRGAR(), 1));
			sb.append(MessageClass.setMessageNumber(mxObject.getINACQN(), 23));
			sb.append(MessageClass.setMessageNumber(mxObject.getINTRTM(), 6));
			sb.append(MessageClass.setMessageNumber(mxObject.getINSEQ1(), 4));
			sb.append(MessageClass.setMessageString(mxObject.getINTMID(), 8));
			sb.append(MessageClass.setMessageNumber(mxObject.getINGACC(), 19));
			sb.append(MessageClass.setMessageString(mxObject.getINTSRC(), 1));
			sb.append(MessageClass.setMessageString(mxObject.getINSSID(), 4));
			sb.append(MessageClass.setMessageNumber(mxObject.getINGLRR(), 13));
			sb.append(MessageClass.setMessageNumber(mxObject.getINBR(), 5));
			sb.append(MessageClass.setMessageNumber(mxObject.getINERPR(), 5));
			sb.append(MessageClass.setMessageString(mxObject.getTPRGKR(), 1));
			sb.append(MessageClass.setMessageString(mxObject.getKRTCGR(), 3));
			sb.append(MessageClass.setMessageNumber(mxObject.getWDBTOT(), 15));
			sb.append(MessageClass.setMessageNumber(mxObject.getWDBANT(), 7));
			sb.append(MessageClass.setMessageString(mxObject.getWDSGRP(), 1));
			sb.append(MessageClass.setMessageNumber(mxObject.getWDLINE(), 4));
			sb.append(MessageClass.setMessageNumber(mxObject.getWDREG(), 15));
			sb.append(MessageClass.setMessageNumber(mxObject.getWDREGT(), 7));
			sb.append(MessageClass.setMessageNumber(mxObject.getWDDIF(), 15));
			sb.append(MessageClass.setMessageNumber(mxObject.getWDDIFT(), 7));
		}
		catch (Exception ex)
		{
			throw ex;
		}
		
		return strMessageApplication.toString();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SetTC5446_detailList";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
