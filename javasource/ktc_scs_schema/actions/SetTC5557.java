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

public class SetTC5557 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __tc5557_Rq;
	private ktc_scs_schema.proxies.TC5557_INPART10DSRq tc5557_Rq;

	public SetTC5557(IContext context, IMendixObject tc5557_Rq)
	{
		super(context);
		this.__tc5557_Rq = tc5557_Rq;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.tc5557_Rq = __tc5557_Rq == null ? null : ktc_scs_schema.proxies.TC5557_INPART10DSRq.initialize(getContext(), __tc5557_Rq);

		// BEGIN USER CODE
		StringBuffer sb = new StringBuffer();

		try {
			sb.append(MessageClass.setMessageNumber(this.tc5557_Rq.getIPKIPN(), 19));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getIPINIT(), 40));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getIPLSNM(), 40));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getIPNAME(), 40));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getIPNAM2(), 40));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getIPADR1(), 40));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getIPADR2(), 40));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getIPADR3(), 40));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getIPADR4(), 40));
			sb.append(MessageClass.setMessageNumber(this.tc5557_Rq.getIPKRTN(), 19));
			sb.append(MessageClass.setMessageNumber(this.tc5557_Rq.getKRLOPN(), 11));
			sb.append(MessageClass.setMessageNumber(this.tc5557_Rq.getKRGACC(), 19));
			sb.append(MessageClass.setMessageNumber(this.tc5557_Rq.getKRUPDT(), 8));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getKRRKID(), 6));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getKRSVID(), 6));
			sb.append(MessageClass.setMessageNumber(this.tc5557_Rq.getKRAVST(), 3));
			sb.append(MessageClass.setMessageNumber(this.tc5557_Rq.getKRKNST(), 3));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getKRKAID(), 3));
			sb.append(MessageClass.setMessageNumber(this.tc5557_Rq.getKRBKRD(), 11));
			sb.append(MessageClass.setMessageNumber(this.tc5557_Rq.getKRSLMT(), 11));
			sb.append(MessageClass.setMessageNumber(this.tc5557_Rq.getSRRTYP(), 2));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getWDKYCF(), 1));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getWDSPHF(), 1));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getWDSVID(), 25));
			sb.append(MessageClass.setMessageNumber(this.tc5557_Rq.getWDDTTM(), 14));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getANATP1(), 1));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getKRCCDE(), 3));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getKRSTFR(), 1));
			sb.append(MessageClass.setMessageNumber(this.tc5557_Rq.getKRKNTN(), 19));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getIPCNAM(), 40));
			sb.append(MessageClass.setMessageNumber(this.tc5557_Rq.getKRACCP(), 2));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getIPSPHI(), 4));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getKRBCDE(), 3));
			sb.append(MessageClass.setMessageNumber(this.tc5557_Rq.getLMLLVL(), 3));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getLMDESC(), 25));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getIPCNMT(), 40));
			sb.append(MessageClass.setMessageNumber(this.tc5557_Rq.getBSCRLN(), 10));
			sb.append(MessageClass.setMessageString(this.tc5557_Rq.getBSCRFL(), 2));

		} catch (Exception ex) {
			throw new com.mendix.systemwideinterfaces.MendixRuntimeException(ex.getMessage());
		}

		return sb.toString();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SetTC5557";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}