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

public class SetTC9205 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __TC9205Rq;
	private ktc_scs_schema.proxies.TC9205_CUSSPODS TC9205Rq;

	public SetTC9205(IContext context, IMendixObject TC9205Rq)
	{
		super(context);
		this.__TC9205Rq = TC9205Rq;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.TC9205Rq = __TC9205Rq == null ? null : ktc_scs_schema.proxies.TC9205_CUSSPODS.initialize(getContext(), __TC9205Rq);

		// BEGIN USER CODE
		StringBuilder strMessageDetail = new StringBuilder();
		try
		{
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC9205Rq.getIPKIPN(), 19));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPRLSP(), 6));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC9205Rq.getIPSEQ1(), 4));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPRLNM(), 40));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPOLI3(), 40));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPITP3(), 3));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPRAD1(), 40));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPRAD2(), 40));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPRAD3(), 40));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPRAD4(), 40));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPRPNR(), 9));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPRCTY(), 40));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPRSTE(), 3));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPRCNC(), 3));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPEMLP(), 100));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPNWI4(), 40));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPTELJ(), 20));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPTELK(), 20));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPTEL3(), 20));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPOCC1(), 6));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC9205Rq.getIPANVE(), 8));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPOCC2(), 6));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC9205Rq.getIPODT2(), 8));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPSPNM(), 32));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPRCTP(), 1));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPITP4(), 3));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPNATI(), 3));
			strMessageDetail.append(MessageClass.setMessageString(this.TC9205Rq.getIPTELJE(), 7));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC9205Rq.getIPTELKE(), 7));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC9205Rq.getIPDTTM(), 14));
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
		return "SetTC9205";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
