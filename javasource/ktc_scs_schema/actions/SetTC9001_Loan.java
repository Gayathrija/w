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
import ktc_scs_schema.proxies.TC9001Rq_LoanInfo;
import ktcmdwscsconnector.customs.MessageClass;

public class SetTC9001_Loan extends CustomJavaAction<java.lang.String>
{
	private java.util.List<IMendixObject> __request;
	private java.util.List<ktc_scs_schema.proxies.TC9001Rq_LoanInfo> request;

	public SetTC9001_Loan(IContext context, java.util.List<IMendixObject> request)
	{
		super(context);
		this.__request = request;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.request = new java.util.ArrayList<ktc_scs_schema.proxies.TC9001Rq_LoanInfo>();
		if (__request != null)
			for (IMendixObject __requestElement : __request)
				this.request.add(ktc_scs_schema.proxies.TC9001Rq_LoanInfo.initialize(getContext(), __requestElement));

		// BEGIN USER CODE
		StringBuilder strMessageDetail = new StringBuilder();
		
		try
		{
			if (this.request.size() > 0)
			{
				TC9001Rq_LoanInfo obj = (TC9001Rq_LoanInfo)this.request.get(0);
				
				strMessageDetail.append(MessageClass.setMessageNumber(obj.getWDTERM(), 4));
				strMessageDetail.append(MessageClass.setMessageNumber(obj.getWDPYDT(), 8));
				strMessageDetail.append(MessageClass.setMessageNumber(obj.getWDORGA(), 15));
				strMessageDetail.append(MessageClass.setMessageNumber(obj.getWDBKDT(), 8));
				strMessageDetail.append(MessageClass.setMessageNumber(obj.getWDKRTN1(), 19));
			}
			else
			{
				strMessageDetail.append(MessageClass.setMessageNumber("0", 4));
				strMessageDetail.append(MessageClass.setMessageNumber("0", 8));
				strMessageDetail.append(MessageClass.setMessageNumber("0", 15));
				strMessageDetail.append(MessageClass.setMessageNumber("0", 8));
				strMessageDetail.append(MessageClass.setMessageNumber("0", 19));
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
		return "SetTC9001_Loan";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
