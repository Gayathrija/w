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

public class SetTC3211 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __TC3211Rq;
	private ktc_scs_schema.proxies.TC3211_LMTCTL02DS TC3211Rq;

	public SetTC3211(IContext context, IMendixObject TC3211Rq)
	{
		super(context);
		this.__TC3211Rq = TC3211Rq;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.TC3211Rq = __TC3211Rq == null ? null : ktc_scs_schema.proxies.TC3211_LMTCTL02DS.initialize(getContext(), __TC3211Rq);

		// BEGIN USER CODE
		StringBuilder strMessageDetail = new StringBuilder();
		try
		{
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getLMGNUM(), 19));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getLMGLMN(), 19));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDLLVL(), 3));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDKIPN(), 19));
			strMessageDetail.append(MessageClass.setMessageString(this.TC3211Rq.getWDUINI(), 40));
			strMessageDetail.append(MessageClass.setMessageString(this.TC3211Rq.getWDULSN(), 40));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDBKRD(), 11));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDSLMT(), 11));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDPRBO(), 15));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDEARM(), 15));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDUSGA(), 15));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDDBAL(), 15));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDUUTL(), 11));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDUAVI(), 11));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDUSAL(), 11));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDUSAV(), 11));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDUCAL(), 11));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDUCAV(), 11));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDUNOA(), 5));
			strMessageDetail.append(MessageClass.setMessageString(this.TC3211Rq.getWDDESC(), 25));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDSPKD(), 1));
			strMessageDetail.append(MessageClass.setMessageString(this.TC3211Rq.getWDSPRK(), 2));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDSPDT(), 8));
			strMessageDetail.append(MessageClass.setMessageString(this.TC3211Rq.getWDRPTL(), 1));
			strMessageDetail.append(MessageClass.setMessageString(this.TC3211Rq.getWDCKUP(), 1));
			strMessageDetail.append(MessageClass.setMessageString(this.TC3211Rq.getWDSHRD(), 1));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDGBAC(), 19));
			strMessageDetail.append(MessageClass.setMessageString(this.TC3211Rq.getWDCRCC(), 3));
			strMessageDetail.append(MessageClass.setMessageString(this.TC3211Rq.getWDSTCC(), 3));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDTCRL(), 11));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDTSTL(), 11));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDEXDT(), 8));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getLMLNUM(), 19));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getLMLLVL(), 3));
			strMessageDetail.append(MessageClass.setMessageString(this.TC3211Rq.getLMDESC(), 25));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getLMKIPN(), 19));
			strMessageDetail.append(MessageClass.setMessageString(this.TC3211Rq.getWDINIT(), 40));
			strMessageDetail.append(MessageClass.setMessageString(this.TC3211Rq.getWDLSNM(), 40));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getLMBKRD(), 11));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getLMSLMT(), 11));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getLMPRBO(), 15));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getLMEARM(), 15));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getLMUSGA(), 15));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getLMDBAL(), 15));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDUTIL(), 15));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDAVAI(), 15));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getLMSALC(), 11));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDSAAV(), 11));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getLMCALC(), 11));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getWDCAAV(), 11));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getLMNOAC(), 5));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getLMSPKD(), 1));
			strMessageDetail.append(MessageClass.setMessageString(this.TC3211Rq.getLMSPRK(), 2));
			strMessageDetail.append(MessageClass.setMessageString(this.TC3211Rq.getWDNXAC(), 1));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getLMDTTM(), 14));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getLMSPDT(), 8));
			strMessageDetail.append(MessageClass.setMessageString(this.TC3211Rq.getLMRPTL(), 1));
			strMessageDetail.append(MessageClass.setMessageString(this.TC3211Rq.getLMCKUP(), 1));
			strMessageDetail.append(MessageClass.setMessageString(this.TC3211Rq.getLMSHRD(), 1));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getLMGBAC(), 19));
			strMessageDetail.append(MessageClass.setMessageString(this.TC3211Rq.getLMCRCC(), 3));
			strMessageDetail.append(MessageClass.setMessageString(this.TC3211Rq.getLMSTCC(), 3));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getLMTCRL(), 11));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getLMTSTL(), 11));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC3211Rq.getLMEXDT(), 8));
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
		return "SetTC3211";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}