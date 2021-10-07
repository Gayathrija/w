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

public class SetTC8406 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __TC8406Rq;
	private ktc_scs_schema.proxies.TC8406_KNTRSK10DS TC8406Rq;

	public SetTC8406(IContext context, IMendixObject TC8406Rq)
	{
		super(context);
		this.__TC8406Rq = TC8406Rq;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.TC8406Rq = __TC8406Rq == null ? null : ktc_scs_schema.proxies.TC8406_KNTRSK10DS.initialize(getContext(), __TC8406Rq);

		// BEGIN USER CODE
		StringBuilder strMessageDetail = new StringBuilder();
		try
		{
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC8406Rq.getKRKNTN(), 19));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getKRRKID(), 6));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getKRKAID(), 3));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getKRCCDE(), 3));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getKRPGRP(), 3));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC8406Rq.getKRBKRD(), 11));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC8406Rq.getKRSLMT(), 11));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC8406Rq.getKRAVIF(), 1));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getKRAVFA(), 1));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getKRSTGR(), 1));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getKRUSC1(), 3));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getKRUSC2(), 3));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getKRUSC3(), 3));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getKRUSC4(), 3));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getKRSTRC(), 6));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC8406Rq.getKRDTTM(), 14));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC8406Rq.getKRGACC(), 19));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC8406Rq.getKRPRIO(), 1));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getKRTCGR(), 3));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getIPNAME(), 40));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC8406Rq.getIPKIPN(), 19));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getIPCTCD(), 3));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC8406Rq.getKTKRTN(), 19));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getKTSVID(), 6));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getSRDESC(), 25));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getSRKAID(), 3));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getTXUSER(), 10));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getGCDESC(), 25));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getCGDESC(), 25));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getIPLSNM(), 40));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC8406Rq.getIPFDAT(), 8));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC8406Rq.getKRAVST(), 3));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getKRLMTF(), 1));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC8406Rq.getWDMM(), 2));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC8406Rq.getWDYY(), 4));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getKRATML(), 1));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC8406Rq.getKRSEQ1(), 4));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getKRMISF(), 1));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getKRMISN(), 32));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getKRMISP(), 25));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getIPNAM2(), 40));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC8406Rq.getWDCORP(), 19));
			strMessageDetail.append(MessageClass.setMessageString(this.TC8406Rq.getWDSTMI(), 1));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC8406Rq.getKRGLPR(), 2));
			
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
		return "SetTC8406";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
