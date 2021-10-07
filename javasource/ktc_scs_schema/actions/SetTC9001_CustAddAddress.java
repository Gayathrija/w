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
import ktc_scs_schema.proxies.TC9001Rq_CustAddAddress;
import ktcmdwscsconnector.customs.MessageClass;

public class SetTC9001_CustAddAddress extends CustomJavaAction<java.lang.String>
{
	private java.util.List<IMendixObject> __request;
	private java.util.List<ktc_scs_schema.proxies.TC9001Rq_CustAddAddress> request;

	public SetTC9001_CustAddAddress(IContext context, java.util.List<IMendixObject> request)
	{
		super(context);
		this.__request = request;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.request = new java.util.ArrayList<ktc_scs_schema.proxies.TC9001Rq_CustAddAddress>();
		if (__request != null)
			for (IMendixObject __requestElement : __request)
				this.request.add(ktc_scs_schema.proxies.TC9001Rq_CustAddAddress.initialize(getContext(), __requestElement));

		// BEGIN USER CODE
		StringBuilder strMessageDetail = new StringBuilder();
		
		try
		{
			for (int i = 0; i < 3; i++)
			{
				if (this.request.size() > 0 && i < this.request.size())
				{
					TC9001Rq_CustAddAddress obj = (TC9001Rq_CustAddAddress)this.request.get(i);
					
					strMessageDetail.append(MessageClass.setMessageString(obj.getIPADTP(), 1));
					strMessageDetail.append(MessageClass.setMessageString(obj.getIPADR1(), 40));
					strMessageDetail.append(MessageClass.setMessageString(obj.getIPADR2(), 40));
					strMessageDetail.append(MessageClass.setMessageString(obj.getIPADR3(), 40));
					strMessageDetail.append(MessageClass.setMessageString(obj.getIPADR4(), 40));
					strMessageDetail.append(MessageClass.setMessageString(obj.getIPCITY(), 40));
					strMessageDetail.append(MessageClass.setMessageString(obj.getIPLSTE(), 3));
					strMessageDetail.append(MessageClass.setMessageString(obj.getIPPNR(), 9));
				}
				else
				{
					strMessageDetail.append(MessageClass.setMessageString("", 1));
					strMessageDetail.append(MessageClass.setMessageString("", 40));
					strMessageDetail.append(MessageClass.setMessageString("", 40));
					strMessageDetail.append(MessageClass.setMessageString("", 40));
					strMessageDetail.append(MessageClass.setMessageString("", 40));
					strMessageDetail.append(MessageClass.setMessageString("", 40));
					strMessageDetail.append(MessageClass.setMessageString("", 3));
					strMessageDetail.append(MessageClass.setMessageString("", 9));
				}
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
		return "SetTC9001_CustAddAddress";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
