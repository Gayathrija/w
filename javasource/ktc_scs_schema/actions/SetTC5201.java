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
import ktcmdwscsconnector.customs.MessageClass;

public class SetTC5201 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __mxObject;
	private ktc_scs_schema.proxies.TC5201_INPART03DS mxObject;

	public SetTC5201(IContext context, IMendixObject mxObject)
	{
		super(context);
		this.__mxObject = mxObject;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.mxObject = __mxObject == null ? null : ktc_scs_schema.proxies.TC5201_INPART03DS.initialize(getContext(), __mxObject);

		// BEGIN USER CODE
		StringBuffer sb = new StringBuffer();

		try {
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPKIPN(), 19));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPLSNM(), 40));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPCIFN(), 19));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPOLIC(), 40));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPITP1(), 3));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPCIDT(), 3));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPTITL(), 6));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPNAME(), 40));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPINIT(), 40));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPEMNM(), 26));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPEMN1(), 26));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPNWIC(), 40));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPITP2(), 3));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPMONM(), 40));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPMBRS(), 6));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPSEX(), 1));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPNATI(), 3));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPPENO(), 11));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPFDAT(), 8));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPFORT(), 25));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPINCD(), 1));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPRELG(), 6));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPCTCD(), 3));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPLCDE(), 3));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPCIVS(), 3));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPBERO(), 3));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPAKRT(), 1));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPRISC(), 3));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPHEDU(), 3));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPRACE(), 6));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPPRVH(), 1));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPITYP(), 1));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPFRNM(), 20));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPNAM2(), 40));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPHUS(), 3));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPFLDT(), 6));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPADRF(), 1));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPSEQ1(), 4));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPADR1(), 40));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPADR2(), 40));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPADR3(), 40));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPADR4(), 40));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPPNR(), 9));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPCITY(), 40));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPLSTE(), 3));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPCNCD(), 3));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPTELH(), 20));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPTELA(), 20));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPFAX1(), 20));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPEMLP(), 100));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPEML1(), 100));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPCBIL(), 1));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPMMTL(), 3));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPBRCD(), 1));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPCONO(), 3));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPCODT(), 8));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPOLAC(), 19));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPBGNO(), 19));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPBANM(), 40));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPKNTL(), 5));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPUSC1(), 3));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPUSC2(), 3));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPUSC3(), 3));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPUSC4(), 3));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPLIAB(), 1));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPCTNM(), 40));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPRCTP(), 1));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPREST(), 1));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPDCSD(), 1));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPBOD6(), 19));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPDTTM(), 14));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPTEL3(), 20));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPLBIL(), 1));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPEXDT(), 8));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPBVDT(), 8));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPPSTS(), 1));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPCLAS(), 1));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPGSTI(), 1));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPBR(), 5));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPLSNC(), 40));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPTELHE(), 7));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPTELAE(), 7));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPSPHI(), 4));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPSPED(), 8));
			sb.append(MessageClass.setMessageNumber(this.mxObject.getIPSPCD(), 8));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPSPCB(), 10));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPSPPI(), 4));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPSPHR(), 100));
			sb.append(MessageClass.setMessageString(this.mxObject.getIPSPRF(), 1));

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
		return "SetTC5201";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
