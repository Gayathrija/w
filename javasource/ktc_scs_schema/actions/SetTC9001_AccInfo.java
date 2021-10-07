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
import ktc_scs_schema.proxies.TC9001Rq_AccInfo;
import ktcmdwscsconnector.customs.MessageClass;

public class SetTC9001_AccInfo extends CustomJavaAction<java.lang.String>
{
	private java.util.List<IMendixObject> __request;
	private java.util.List<ktc_scs_schema.proxies.TC9001Rq_AccInfo> request;

	public SetTC9001_AccInfo(IContext context, java.util.List<IMendixObject> request)
	{
		super(context);
		this.__request = request;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.request = new java.util.ArrayList<ktc_scs_schema.proxies.TC9001Rq_AccInfo>();
		if (__request != null)
			for (IMendixObject __requestElement : __request)
				this.request.add(ktc_scs_schema.proxies.TC9001Rq_AccInfo.initialize(getContext(), __requestElement));

		// BEGIN USER CODE
		StringBuilder strMessageDetail = new StringBuilder();
		
		try
		{
			if (this.request.size() > 0)
			{
				TC9001Rq_AccInfo obj = (TC9001Rq_AccInfo)this.request.get(0);
				
				strMessageDetail.append(MessageClass.setMessageString(obj.getANRKID(), 6));
				strMessageDetail.append(MessageClass.setMessageString(obj.getANSVID(), 6));
				strMessageDetail.append(MessageClass.setMessageString(obj.getWPPPPID(), 10));
				strMessageDetail.append(MessageClass.setMessageNumber(obj.getKRGACC(), 19));
				strMessageDetail.append(MessageClass.setMessageNumber(obj.getKRPDAY(), 2));
				strMessageDetail.append(MessageClass.setMessageNumber(obj.getANBKRD(), 11));
				strMessageDetail.append(MessageClass.setMessageString(obj.getKRLMTF(), 1));
				strMessageDetail.append(MessageClass.setMessageNumber(obj.getWDNCB(), 1));
				strMessageDetail.append(MessageClass.setMessageString(obj.getANOTYP(), 6));
				strMessageDetail.append(MessageClass.setMessageString(obj.getANLOCD(), 13));
				strMessageDetail.append(MessageClass.setMessageString(obj.getANCHAN1(), 5));
				strMessageDetail.append(MessageClass.setMessageString(obj.getANRCM1(), 3));
				strMessageDetail.append(MessageClass.setMessageString(obj.getANRCM2(), 3));
				strMessageDetail.append(MessageClass.setMessageString(obj.getKRCBIL(), 1));
				strMessageDetail.append(MessageClass.setMessageString(obj.getKRLBIL(), 1));
				strMessageDetail.append(MessageClass.setMessageString(obj.getANBANM1(), 3));
				strMessageDetail.append(MessageClass.setMessageString(obj.getWGIDBAN(), 19));
				strMessageDetail.append(MessageClass.setMessageString(obj.getWGIDBAT(), 2));
				strMessageDetail.append(MessageClass.setMessageString(obj.getGIINST(), 1));
				strMessageDetail.append(MessageClass.setMessageString(obj.getRLRELC(), 6));
				strMessageDetail.append(MessageClass.setMessageString(obj.getANTELH(), 20));
				strMessageDetail.append(MessageClass.setMessageString(obj.getWDSTFR(), 1));

			}
			else
			{
				strMessageDetail.append(MessageClass.setMessageString("", 6));
				strMessageDetail.append(MessageClass.setMessageString("", 6));
				strMessageDetail.append(MessageClass.setMessageString("", 10));
				strMessageDetail.append(MessageClass.setMessageNumber("0", 19));
				strMessageDetail.append(MessageClass.setMessageNumber("0", 2));
				strMessageDetail.append(MessageClass.setMessageNumber("0", 11));
				strMessageDetail.append(MessageClass.setMessageString("", 1));
				strMessageDetail.append(MessageClass.setMessageString("", 1));
				strMessageDetail.append(MessageClass.setMessageString("", 6));
				strMessageDetail.append(MessageClass.setMessageString("", 13));
				strMessageDetail.append(MessageClass.setMessageString("", 5));
				strMessageDetail.append(MessageClass.setMessageString("", 3));
				strMessageDetail.append(MessageClass.setMessageString("", 3));
				strMessageDetail.append(MessageClass.setMessageString("", 1));
				strMessageDetail.append(MessageClass.setMessageString("", 1));
				strMessageDetail.append(MessageClass.setMessageString("", 3));
				strMessageDetail.append(MessageClass.setMessageNumber("", 19));
				strMessageDetail.append(MessageClass.setMessageString("", 2));
				strMessageDetail.append(MessageClass.setMessageString("", 1));
				strMessageDetail.append(MessageClass.setMessageString("", 6));
				strMessageDetail.append(MessageClass.setMessageString("", 20));
				strMessageDetail.append(MessageClass.setMessageString("", 1));
			}
		}
		catch (Exception ex)
		{
			throw ex;
		}
		
		return strMessageDetail.toString();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SetTC9001_AccInfo";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}