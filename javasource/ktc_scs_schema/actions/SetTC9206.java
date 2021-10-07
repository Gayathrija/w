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

public class SetTC9206 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __TC9206Rq;
	private ktc_scs_schema.proxies.TC9206_CUSMSCDS TC9206Rq;

	public SetTC9206(IContext context, IMendixObject TC9206Rq)
	{
		super(context);
		this.__TC9206Rq = TC9206Rq;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.TC9206Rq = __TC9206Rq == null ? null : ktc_scs_schema.proxies.TC9206_CUSMSCDS.initialize(getContext(), __TC9206Rq);

		// BEGIN USER CODE
		StringBuilder strMessageDetail = new StringBuilder();
		try
		{
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC9206Rq.getMSKIPN(), 19));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9206Rq.getMSINID(), 6));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9206Rq.getMSINFO(), 25));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC9206Rq.getMSDTTM(), 8));
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
		return "SetTC9206";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
