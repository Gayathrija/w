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

public class SetTC5094 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __TC5094Rq;
	private ktc_scs_schema.proxies.TC5094_DISPTR02DS TC5094Rq;

	public SetTC5094(IContext context, IMendixObject TC5094Rq)
	{
		super(context);
		this.__TC5094Rq = TC5094Rq;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.TC5094Rq = __TC5094Rq == null ? null : ktc_scs_schema.proxies.TC5094_DISPTR02DS.initialize(getContext(), __TC5094Rq);

		// BEGIN USER CODE
		StringBuilder strMessageDetail = new StringBuilder();
		try
		{
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5094Rq.getDPBNTN(), 9));			
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5094Rq.getDPBLON(), 7));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5094Rq.getDPTTYP(), 4));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5094Rq.getDPKRTN(), 19));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5094Rq.getDPKNTN(), 19));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5094Rq.getDPVLDT(), 8));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5094Rq.getDPBDAT(), 8));
			strMessageDetail.append(MessageClass.setMessageString(this.TC5094Rq.getDPSTAS(), 1));
			strMessageDetail.append(MessageClass.setMessageString(this.TC5094Rq.getDPDPRE(), 2));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5094Rq.getDPAMT(), 15));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5094Rq.getDPRDAT(), 8));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5094Rq.getDPSTLC(), 8));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5094Rq.getDPDTTM(), 14));
			strMessageDetail.append(MessageClass.setMessageString(this.TC5094Rq.getIPNAME(), 32));
			strMessageDetail.append(MessageClass.setMessageString(this.TC5094Rq.getIPLSNM(), 40));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5094Rq.getWDFLAG(), 1));
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
		return "SetTC5094";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
