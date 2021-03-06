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

public class SetTC2226 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __TC2226Rq;
	private ktc_scs_schema.proxies.TC2226_KORTEX01DS TC2226Rq;

	public SetTC2226(IContext context, IMendixObject TC2226Rq)
	{
		super(context);
		this.__TC2226Rq = TC2226Rq;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.TC2226Rq = __TC2226Rq == null ? null : ktc_scs_schema.proxies.TC2226_KORTEX01DS.initialize(getContext(), __TC2226Rq);

		// BEGIN USER CODE
		StringBuilder strMessageDetail = new StringBuilder();
		try
		{
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC2226Rq.getKTKRTN(), 19));			
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC2226Rq.getKTKIPN(), 19));
			strMessageDetail.append(MessageClass.setMessageString(this.TC2226Rq.getIPLSNM(), 40));
			strMessageDetail.append(MessageClass.setMessageString(this.TC2226Rq.getIPINIT(), 40));
			strMessageDetail.append(MessageClass.setMessageString(this.TC2226Rq.getIPNAME(), 40));
			strMessageDetail.append(MessageClass.setMessageString(this.TC2226Rq.getIPNAM2(), 40));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC2226Rq.getKRKNTN(), 19));
			strMessageDetail.append(MessageClass.setMessageString(this.TC2226Rq.getKTCBI2(), 1));
			strMessageDetail.append(MessageClass.setMessageString(this.TC2226Rq.getWDCBI2(), 1));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC2226Rq.getKTCRE2(), 19));
			strMessageDetail.append(MessageClass.setMessageString(this.TC2226Rq.getWDLSNM(), 40));
			strMessageDetail.append(MessageClass.setMessageString(this.TC2226Rq.getWDINIT(), 40));
			strMessageDetail.append(MessageClass.setMessageString(this.TC2226Rq.getKTCBI3(), 1));
			strMessageDetail.append(MessageClass.setMessageString(this.TC2226Rq.getWDCBI3(), 1));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC2226Rq.getKTCRE3(), 19));
			strMessageDetail.append(MessageClass.setMessageString(this.TC2226Rq.getWDLSN3(), 40));
			strMessageDetail.append(MessageClass.setMessageString(this.TC2226Rq.getWDINI3(), 40));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC2226Rq.getLMGNUM(), 19));
			strMessageDetail.append(MessageClass.setMessageString(this.TC2226Rq.getLMGNAM(), 40));
			strMessageDetail.append(MessageClass.setMessageString(this.TC2226Rq.getWDIND(), 1));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC2226Rq.getKTDTTM(), 14));			
			
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
		return "SetTC2226";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
